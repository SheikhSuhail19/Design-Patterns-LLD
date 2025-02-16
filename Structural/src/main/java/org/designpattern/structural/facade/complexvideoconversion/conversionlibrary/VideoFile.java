package org.designpattern.structural.facade.complexvideoconversion.conversionlibrary;

public class VideoFile
{
	private final String name;
	private final String codecType;

	public VideoFile(String name)
	{
		this.name = name;
		this.codecType = name.substring(name.indexOf(".") + 1);
	}

	public String getCodecType()
	{
		return codecType;
	}

	public String getName()
	{
		return name;
	}
}