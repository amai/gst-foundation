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

package tools.gsf.facade.runtag.listobject;

import tools.gsf.facade.runtag.AbstractTagRunner;

/**
 * {@literal <LISTOBJECT.ADDROW NAME="listname" colx="valx" ... colz="valz"/>}
 *
 * @author Tony Field
 * @since Oct 24, 2008
 */
public final class AddRow extends AbstractTagRunner {
    public AddRow() {
        super("LISTOBJECT.ADDROW");
    }

    public void setName(String s) {
        set("NAME", s);
    }

    public void setColumnValue(String colname, String colvalue) {
        set(colname, colvalue);
    }

}
