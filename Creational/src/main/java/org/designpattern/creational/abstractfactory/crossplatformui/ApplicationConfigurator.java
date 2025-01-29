package org.designpattern.creational.abstractfactory.crossplatformui;

// The application picks the factory type depending on the
// current configuration or environment settings and creates it
// at runtime (usually at the initialization stage).

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ApplicationConfigurator
{

	private static GUIFactory factory;

	private static Properties readApplicationConfigFile()
	{
		Properties props = new Properties();

		try (InputStream input = org.designpattern.creational.factory.crossplatformdialog.Application.class.getClassLoader().getResourceAsStream("application.properties"))
		{
			props.load(input);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return props;
	}

	public static void main(String[] args) throws Exception
	{
		Properties props = readApplicationConfigFile();

		if (Objects.equals(props.getProperty("ui.os.type"), "Windows"))
		{
			factory = new WinFactory();
		}
		else if (Objects.equals(props.getProperty("ui.os.type"), "Web"))
		{
			factory = new WebFactory();
		}
		else if (Objects.equals(props.getProperty("ui.os.type"), "Mac"))
		{
			factory = new MacFactory();
		}
		else
		{
			throw new Exception("Error! Unknown operating system.");
		}

		Application app = new Application(factory);
		app.paint();
	}
}
