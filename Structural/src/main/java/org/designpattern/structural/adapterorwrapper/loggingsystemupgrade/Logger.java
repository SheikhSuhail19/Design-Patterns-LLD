package org.designpattern.structural.adapterorwrapper.loggingsystemupgrade;

// The new target logging interface
public interface Logger
{
	void debug(String message);

	void info(String message);

	void error(String message);
}


