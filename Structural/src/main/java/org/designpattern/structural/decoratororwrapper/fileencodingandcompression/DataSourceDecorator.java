package org.designpattern.structural.decoratororwrapper.fileencodingandcompression;

// The base decorator class follows the same interface as the
// other components. The primary purpose of this class is to
// define the wrapping interface for all concrete decorators.
// The default implementation of the wrapping code might include
// a field for storing a wrapped component and the means to
// initialize it.

public abstract class DataSourceDecorator implements DataSource
{
	private final DataSource wrappee;

	DataSourceDecorator(DataSource source)
	{
		this.wrappee = source;
	}

	// The base decorator simply delegates all work to the
	// wrapped component. Extra behaviors can be added in
	// concrete decorators.
	@Override
	public void writeData(String data)
	{
		wrappee.writeData(data);
	}

	// Concrete decorators may call the parent implementation of
	// the operation instead of calling the wrapped object
	// directly. This approach simplifies extension of decorator
	// classes.
	@Override
	public String readData()
	{
		return wrappee.readData();
	}
}