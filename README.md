<!--
 Copyright 2012 Oracle Corporation. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
-->

#GST Site Foundation Overview

The GSF aims at:

	1.	Defining architectural and design standards for the foundation of a site

	2.	Standardizing processes for business users

	3.	Simplifying coding greatly, to the point where much can be provided in common libraries

	4.	Clearly defining extension points   

At a high level, the GSF offers a non-rendering foundation which aims at providing the following primary benefits:

	*	Is suitable for use "out of the box" for a large number of sites

	*	Standardizes usage of the Page asset for modeling navigation (e.g. Site Maps, Menus, etc...)

	*	Extends Webcenter Sites's controller infrastructure, leveraging clean, reusable code and productivity 

	*	Provides for managed alias assets pointing at other assets or external URLs

	*	Can be cleanly extended to address custom client requirements

This release of the GSF, GSF-12, is considered to be a "transitional" one.

Its main goal is providing the means for clients out there already using GSF to reuse as much of their existing
code as possible when upgrading from WCS 11.x to WCS 12.x.

Some of the GSF's features have become partially or totally unnecessary due to WCS 12.x offering a native equivalent.

Such features have been deprecated and, in some cases, even wiped off the GSF's codebase.

Only those classes / components which are still valid and/or useful and/or expected to become building blocks for NEW
features to be implemented in future releases of the GSF have been either left untouched or adjusted specifically
for WCS 12.x.

This release acknowledges the small but mission-critical differences that sometimes exist amongst WCS implementations
out there.
    
In this regard, GSF-12's roadmap contemplates reengineering some of the core features in previous versions - such as the
Navigation Service - so tailoring them to address those small differences is as painless as possible.

Developers and Architects are encouraged to build upon - and extend - this framework with the long-term goal of folding
in such enhancements into future versions of the GST Site Foundation.

August, 2016

##An Important Note on Backwards-Compatibility

One of the major changes introduced into the GSF codebase in version 12 (and up) is a brand new namespace for all classes
and loggers.

In doing so, all of the GSF's pre-existing classes have been <<deprecated>> in this release.
	
The new namespace is: <<tools.gsf>>.
	
Starting this initial release of GSF-12, new "CORE" classes will belong to a subpackage of "tools.gsf" (or "tools.gsf" itself) 
	
All deprecated classes will be packaged inside a separate artifact / JAR file we will call "LEGACY".
	
The above implies all pre-existing classes - i.e. all classes under the legacy namespace - <<com.fatwire.gst>> - will enter
the GSF	deprecation cycle.
	
The GSF's deprecation cycle dictates that deprecated components will be physically removed from the GSF's codebase / project in
the	next major release after deprecation occurs.
	
If you are extending the GSF (or looking at the the source code anyway), you will notice that there are classes in the CORE
artifact which are exactly the same as one in the LEGACY artifact.
	
This is our way of allowing your smoothly transitioning from the old namespace / classes onto the new ones.
	
However, note that deprecated classes will not be enhanced, ever. Only the CORE classes will. In other words, as
CORE features / classes evolve they will gradually diverge from their LEGACY counterpart, whenever applicable.  
	
For all of the above, <<you are strongly advised to start using the new namespace (e.g. packages / classnames) right away>>. 

##Documentation

* {{{./InstallGuide.html}GSF-12 Installation ReadMe}} - Guide for manually installing and configuring GSF-12

* JavaDocs are included in this kit. Alternatively, you can get them from the GSF's website.

##Download

For this transitional release, classes are shipped in 2 JAR files:
    
	* gsf-core-<version>.jar: here you'll find the classes that make up GSF's new CORE.    
    
	* gsf-legacy-<version>.jar: here you'll find deprecated classes scheduled for physical removal in a future release.
	
This kit includes both JAR files. 

Alternatively, you can obtain them by either:

	* Checking out the GSF project from GitHub and building the JARs yourself:

		https://github.com/dolfdijkstra/gst-foundation.git

	... or

	* Downloading the pre-compiled JARs from the GSF's website:
	
		http://gst-foundation.org/	
    
##Support

The Global Site Foundation is supported by the community. Questions and remarks can be send to ips-link@yahoogroups.com. 

Oracle Support does NOT provide support on GSF.

##Requirements

Java 1.8 (or newer)
Servlet 3.0
WCS 12c
SLF4J 1.7.21 (or newer) -- NOTE: WCS 12c already ships with SLF4J

##Support

The Global Site Foundation is supported by the community. Questions and remarks can be send to ips-link@yahoogroups.com. 

Oracle Support does NOT provide support on GSF.

##License

This project is licensed under the [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) license.

