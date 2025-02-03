package org.designpattern.structural.adapter.loggingsystemupgrade;

public class LoggingClient
{
	public static void main(String[] args)
	{
		// Create the LegacyLogger instance
		LegacyLogger legacyLogger = new LegacyLogger();

		// Inject LegacyLogger into LegacyLoggerAdapter via constructor injection
		LegacyLoggerAdapter legacyLoggerAdapter = new LegacyLoggerAdapter(legacyLogger);

		String log = "This is a log message";

		System.out.println("Legacy Logger");
		legacyLogger.log("DEBUG", log);

		System.out.println();

		System.out.println("Adapter Logger");
		legacyLoggerAdapter.debug(log);
		legacyLoggerAdapter.info(log);
		legacyLoggerAdapter.error(log);
	}
}
