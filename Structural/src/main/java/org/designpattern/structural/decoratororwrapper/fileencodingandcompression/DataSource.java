package org.designpattern.structural.decoratororwrapper.fileencodingandcompression;

// The component interface defines operations that can be
// altered by decorators.

public interface DataSource
{
	void writeData(String data);

	String readData();
}