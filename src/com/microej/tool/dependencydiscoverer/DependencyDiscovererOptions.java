/*
 * Java
 *
 * Copyright 2016 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.microej.tool.dependencydiscoverer;

/**
 * Define the options for the Dependency Discoverer.
 */
public interface DependencyDiscovererOptions {

	/**
	 * MicroEJ repository version to download.
	 */
	String MICROEJ_VERSION = "4.1";

	/**
	 * Whether the dependency discoverer tries to download the latest repository or not.
	 */
	boolean OFFLINE = false;

}
