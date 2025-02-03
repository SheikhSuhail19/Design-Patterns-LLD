package org.designpattern.structural.adapterorwrapper.loggingsystemupgrade;

// Legacy logging system (legacy code that you cannot modify)
public class LegacyLogger
{
	/**
	 * Logs a message with the given severity.
	 *
	 * @param severity The severity level (e.g., "DEBUG", "INFO", "ERROR").
	 * @param message  The message to log.
	 */
	public void log(String severity, String message)
	{
		System.out.println("[" + severity + "] " + message);
	}
}
