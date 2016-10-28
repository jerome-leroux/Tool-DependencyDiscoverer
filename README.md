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
1. Drop all your jars into [classpath](classpath/) folder.
2. Get MicroEJ offline repository from [developer.microej.com/4.0/ivy](http://developer.microej.com/4.0/ivy).
3. Unzip MicroEJ repository into [againstClasspath](againstClasspath/) folder.
4. Set `OFFLINE` variable in [DependencyDiscoverer.java](src/ej/tools/dependencydiscoverer/DependencyDiscoverer.java) to `true`.
5. Right click on DependencyDiscoverer project.
6. Select **Run As -> Java Application**
7. Double click on **DependencyDiscoverer**
8. A **result.txt** file will be generated at the root of the project.

## Adding additional MicroEJ libraries.
You may have some additional MicroEJ libraries, to include them, drop them into [againstClasspath](againstClasspath) folder.

## Interpreting the results.
Open the **result.txt** file with a text editor. Each line contains a missing dependency. If the file is empty, your library is compatible with MicroEJ OS!

Each line may be :
  * A **class** described as `package.of.class.Class`.
  * An **inner class** described as `package.of.class.Class$InnerClassName` (InnerClassName is a number if it is an anonymous class).
  * A **field** described as `package.of.class.Class.fieldName`.
  * A **constructor** described as `package.of.class.Class.<init>({parameters types see under})V`.
  * A **method** described as `package.of.class.Class.methodName({parameters types see under}){return type}`.
  
The types may be:
  * **B**: byte
  * **C**: char
  * **D**: double
  * **F**: float
  * **I**: int
  * **J**: long
  * **L{ClassName};**: reference to a {ClassName} instance
  * **S**: short
  * **V**: void
  * **Z**: boolean
  * **[{type}**: array of {type} (type may be an array it self)

## Porting a library to MicroEJ OS
To port your library with missing dependencies into MicroEJ OS, the following steps shall be taken:
1. Contact MicroEJ support, some common libraries are available on demand. 
2. Refactor your libraries to avoid those dependencies.

# Requirements
* A JRE 7 or higher.

# Dependencies
This project depends on [DependencyDiscoverer-2.0.4.jar](lib/DependencyDiscoverer-2.0.4.jar).

# Source
N/A

# Restrictions
None.