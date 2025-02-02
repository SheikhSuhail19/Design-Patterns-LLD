package org.designpattern.creational.prototypeorclone.documentmanagementsystem;

public class Presentation extends Document
{
	private String template;
	private String slides;

	public Presentation()
	{
	}

	public Presentation(Presentation source)
	{
		super(source);
		this.template = source.template;
		this.slides = source.slides;
	}

	public void setTemplate(String template)
	{
		this.template = template;
	}

	public void setSlides(String slides)
	{
		this.slides = slides;
	}

	@Override
	public Document clone()
	{
		return new Presentation(this);
	}

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Presentation document2) || !super.equals(object2)) return false;
		return document2.template.equals(template) && document2.slides.equals(slides);
	}

	@Override
	public String toString()
	{
		return super.toString() + "Presentation{" + "template='" + template + '\'' + ", slides='" + slides + '\'' + '}';
	}

}
