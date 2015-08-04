/*
 * Copyright (c) 2015 Function1 Inc. All rights reserved.
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
package com.fatwire.gst.foundation.facade.engage;

import COM.FutureTense.Interfaces.ICS;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Tony Field
 * @since 15-08-04 6:06 PM
 */
public class CartServiceImpl implements CartService {

    private static final Log LOG = LogFactory.getLog(CartService.class);
    private final ICS ics;

    public CartServiceImpl(ICS ics) {
        this.ics = ics;
        LOG.trace("Created CartServiceImpl");
        LOG.warn("Implementation is not complete");
    }
}
