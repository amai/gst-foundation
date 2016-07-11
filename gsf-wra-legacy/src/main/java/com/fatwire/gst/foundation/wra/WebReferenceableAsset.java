/*
 * Copyright 2010 FatWire Corporation. All Rights Reserved.
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
package com.fatwire.gst.foundation.wra;


/**
 * Bean containing core WebReferenceableAsset fields
 * 
 * @author Tony Field
 * @author Dolf Dijkstra
 * @since Jul 21, 2010
 * 
 * @deprecated as of release 12.x, replace with WCS 12c's native vanity URLs support.
 * 
 */
public interface WebReferenceableAsset extends VanityAsset {

    public String getMetaTitle();

    public String getMetaDescription();

    public String getMetaKeyword();

    public String getH1Title();

    public String getLinkText();

}
