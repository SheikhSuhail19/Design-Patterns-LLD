package org.designpattern.creational.factory.crossplatformdialog;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class Application
{
	private Dialog dialog;

	// The application picks a creator's type depending on the
	// current configuration or environment settings.
	private void initialize()
	{
		Properties props = readApplicationConfigFile();

		if (Objects.equals(props.getProperty("os.type"), "Windows"))
		{
			dialog = new WindowsDialog();
		}
		else if (Objects.equals(props.getProperty("os.type"), "Web"))
		{
			dialog = new WebDialog();
		}
		else if (Objects.equals(props.getProperty("os.type"), "Linux"))
		{
			dialog = new LinuxDialog();
		}
	}

	private Properties readApplicationConfigFile()
	{
		Properties props = new Properties();

		try (InputStream input = Application.class.getClassLoader().getResourceAsStream("application.properties"))
		{
			props.load(input);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return props;
	}

	private void runBusinessLogic()
	{
		dialog.render();
	}

	// The client code works with an instance of a concrete
	// creator, albeit through its base interface. As long as
	// the client keeps working with the creator via the base
	// interface, you can pass it any creator's subclass.
	public static void main(String[] args)
	{
		Application application = new Application();

		application.initialize();
		application.runBusinessLogic();
	}
}
