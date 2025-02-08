package org.designpattern.structural.decoratororwrapper.fileencodingandcompression;

public class Application
{
	public static void main(String[] args)
	{
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		DataSourceDecorator encoded = new CompressionDecorator(
				new EncryptionDecorator(
						new FileDataSource("OutputDemo.txt")));
		encoded.writeData(salaryRecords); // Encryption > Compression > FileDataSource
		DataSource plain = new FileDataSource("OutputDemo.txt");

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}
}
