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

package tools.gsf.facade.runtag.asset;

import tools.gsf.facade.runtag.AbstractTagRunner;

/**
 * Wrapper around the ASSET.CREATE tag
 *
 * @author Mike Field
 * @since Jun 11, 2008
 */
public final class AssetCreate extends AbstractTagRunner {

    // Default Constructor
    public AssetCreate() {
        super("ASSET.CREATE");
    }

    /**
     * Sets name to the value of <code>s</code>
     *
     * @param s The name of the asset instance
     */
    public void setName(String s) {
        // validate first
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Invalid string for Name: " + s);
        }
        this.set("NAME", s);
    }

    /**
     * Sets the type to the asset to <code>s</code>
     *
     * @param s The name of the asset type
     */
    public void setType(String s) {
        // validate first
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Invalid string for Type: " + s);
        }
        this.set("TYPE", s);
    }

}
