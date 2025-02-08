package org.designpattern.structural.flyweightorcache.texteditorcharacterformatting;

//(Flyweight -> intrinsic state)
public class TextStyle
{
	private final String fontFamily;
	private final int fontSize;
	private final boolean isBold;
	private final boolean isItalic;

	public TextStyle(String fontFamily, int fontSize, boolean isBold, boolean isItalic)
	{
		this.fontFamily = fontFamily;
		this.fontSize = fontSize;
		this.isBold = isBold;
		this.isItalic = isItalic;
	}

	public void applyStyle(String character)
	{
		System.out.println("Character: '" + character + "' with style: " +
				"Font=" + fontFamily + ", Size=" + fontSize +
				", Bold=" + isBold + ", Italic=" + isItalic);
	}
}
