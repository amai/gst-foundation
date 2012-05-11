/*
 * Copyright 2011 FatWire Corporation. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fatwire.gst.foundation.controller.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.fatwire.gst.foundation.controller.AppContext;
import com.fatwire.gst.foundation.controller.action.support.DefaultWebAppContext;
import com.fatwire.gst.foundation.facade.logging.LogUtil;

import org.apache.commons.logging.Log;

/**
 * ServletContextListener that loads and configures the AppContext for this
 * application.
 * 
 * @author Dolf Dijkstra
 * 
 */
public class WebAppContextLoader implements ServletContextListener {
    protected static final Log LOG = LogUtil.getLog(WebAppContextLoader.class);
    boolean booted = false;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        if (context.getMajorVersion() == 2 && context.getMinorVersion() < 4) {
            throw new IllegalStateException(
                    "Servlet Container is configured for version 2.3 or less. This ServletContextListener does not support 2.3 and earlier as the load order of Listeners is not guaranteed.");
        }
        AppContext parent = null;
        String init = context.getInitParameter(WebAppContext.CONTEXTS);
        if (init != null) {
            String[] c = init.split(",");

            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            Class<?>[] args = new Class[] { ServletContext.class, AppContext.class };
            for (int i = c.length - 1; i >= 0; i--) {

                try {
                    @SuppressWarnings("unchecked")
                    Class<AppContext> cls = (Class<AppContext>) cl.loadClass(c[i]);
                    Constructor<AppContext> ctr = cls.getConstructor(args);
                    AppContext n;
                    n = ctr.newInstance(context, parent);
                    if (n != null) {
                        n.init();
                        parent = n;
                    }
                } catch (IllegalArgumentException e) {
                    LOG.warn(e);
                } catch (InstantiationException e) {
                    LOG.warn(e);
                } catch (IllegalAccessException e) {
                    LOG.warn(e);
                } catch (InvocationTargetException e) {
                    LOG.warn(e);
                } catch (SecurityException e) {
                    LOG.warn(e);
                } catch (NoSuchMethodException e) {
                    LOG.warn(e);
                } catch (ClassNotFoundException e) {
                    LOG.warn(e);
                }

            }

        }
        if (parent != null) {
            context.setAttribute(WebAppContext.WEB_CONTEXT_NAME, parent);
        } else {
            AppContext def = new DefaultWebAppContext(context);
            def.init();
            context.setAttribute(WebAppContext.WEB_CONTEXT_NAME, def);
        }
        booted = true;

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute(WebAppContext.WEB_CONTEXT_NAME);
    }

}