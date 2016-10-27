<!--
	Markdown
	Copyright 2016 IS2T. All rights reserved.
	Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
-->
# Overview
This project is a tool to discover the missing dependencies of libraries to be run on MicroEJ OS.

# Usage
## Online
1. Drop all your jars into [classpath](classpath/) folder.
2. Right click on DependencyDiscoverer project.
3. Select **Run As -> Java Application**
4. Double click on **DependencyDiscoverer**
3. A **result.txt** file will be generated at the root of the project.

## Offline
1. Get MicroEJ repository on [developer.microej.com](http://developer.microej.com).
2. Drop all your jars into [classpath](classpath/) folder.
3. Unzip MicroEJ repository into [againstClasspath](againstClasspath/) folder.
4. Set `OFFLINE` variable in [DependencyDiscoverer.java](src/ej/tools/dependencydiscoverer/DependencyDiscoverer.java) to `true`.
5. Use the launch configuration "DependencyDiscoverer" provided by clicking Run -> Run Configuration
6. A **result.txt** file will be generated at the root of the project.

## Add additional MicroEJ libraries.
You may receive some additional MicroEJ libraries, to include them, drop them into [againstClasspath](againstClasspath).

# Requirements
* A JRE 7 or higher.

# Dependencies
This project depends on [DependencyDiscoverer-2.0.4.jar](lib/DependencyDiscoverer-2.0.4.jar).

# Source
N/A

# Restrictions
None.