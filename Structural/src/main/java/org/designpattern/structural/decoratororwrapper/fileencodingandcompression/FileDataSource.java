package org.designpattern.structural.decoratororwrapper.fileencodingandcompression;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

// Concrete components provide default implementations for the
// operations. There might be several variations of these
// classes in a program.

public class FileDataSource implements DataSource
{
	private final String name;

	public FileDataSource(String name)
	{
		this.name = name;
	}

	@Override
	public void writeData(String data)
	{
		File file = new File(name);
		try (var fileOutputStream = new FileOutputStream(file))
		{
			fileOutputStream.write(data.getBytes(), 0, data.length());
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public String readData()
	{
		char[] buffer = null;
		File file = new File(name);
		try (FileReader reader = new FileReader(file))
		{
			buffer = new char[(int) file.length()];
			reader.read(buffer);
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		return new String(buffer);
	}
}