package org.designpattern.structural.facade.complexvideoconversion;

import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.AudioMixer;
import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.BitrateReader;
import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.Codec;
import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.CodecFactory;
import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.MPEG4CompressionCodec;
import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.OggCompressionCodec;
import org.designpattern.structural.facade.complexvideoconversion.conversionlibrary.VideoFile;

import java.io.File;

public class VideoConversionFacade
{
	public File convertVideo(String fileName, String format)
	{
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec;
		if (format.equals("mp4"))
		{
			destinationCodec = new MPEG4CompressionCodec();
		}
		else
		{
			destinationCodec = new OggCompressionCodec();
		}
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}