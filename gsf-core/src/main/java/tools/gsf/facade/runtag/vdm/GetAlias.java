/*
 * Copyright 2008 FatWire Corporation. All Rights Reserved.
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

package tools.gsf.facade.runtag.vdm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.gsf.facade.runtag.AbstractTagRunner;

/**
 * {@code <VDM.GETALIAS KEY="keyvalue" VARNAME="varname"/>}
 *
 * @author Tony Field
 * @since Sep 29, 2008
 */
public class GetAlias extends AbstractTagRunner {

    protected static final Logger log = LoggerFactory.getLogger("tools.gsf.facade.runtag.vdm.GetAlias");

    public GetAlias() {
        super("VDM.GETALIAS");
    }

    public GetAlias(String key, String varname) {
        this();
        setKey(key);
        setVarname(varname);
    }

    public void setKey(String key) {
        set("KEY", key);
    }

    public void setVarname(String varname) {
        set("VARNAME", varname);
    }
}
