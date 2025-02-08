package org.designpattern.structural.flyweightorcache.texteditorcharacterformatting;

public class TextEditorApp
{
	public static void main(String[] args)
	{
		FormattedCharacter c1 = new FormattedCharacter('H', TextStyleFactory.getTextStyle("Arial", 12, true, false));
		FormattedCharacter c2 = new FormattedCharacter('e', TextStyleFactory.getTextStyle("Arial", 12, true, false));
		FormattedCharacter c3 = new FormattedCharacter('l', TextStyleFactory.getTextStyle("Arial", 12, true, false));
		FormattedCharacter c4 = new FormattedCharacter('l', TextStyleFactory.getTextStyle("Arial", 12, true, false));
		FormattedCharacter c5 = new FormattedCharacter('o', TextStyleFactory.getTextStyle("Arial", 14, false, true));

		c1.render();
		c2.render();
		c3.render();
		c4.render();
		c5.render();
	}
}
