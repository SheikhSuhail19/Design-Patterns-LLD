package org.designpattern.structural.flyweightorcache.texteditorcharacterformatting;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory
{
	private static final Map<String, TextStyle> styleMap = new HashMap<>();

	public static TextStyle getTextStyle(String fontFamily, int fontSize, boolean isBold, boolean isItalic)
	{
		String key = fontFamily + fontSize + isBold + isItalic;
		return styleMap.computeIfAbsent(key, k -> new TextStyle(fontFamily, fontSize, isBold, isItalic));
	}
}
