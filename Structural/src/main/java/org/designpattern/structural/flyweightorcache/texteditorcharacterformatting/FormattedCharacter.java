package org.designpattern.structural.flyweightorcache.texteditorcharacterformatting;

public class FormattedCharacter
{
	private final char character;
	private final TextStyle textStyle;

	public FormattedCharacter(char character, TextStyle textStyle)
	{
		this.character = character;
		this.textStyle = textStyle;
	}

	public void render()
	{
		textStyle.applyStyle(String.valueOf(character));
	}
}
