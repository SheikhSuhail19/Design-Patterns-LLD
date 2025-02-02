package org.designpattern.creational.prototypeorclone.documentmanagementsystem;

public abstract class Document
{
	private String title;
	private String content;
	private String author;
	private String creationDate;

	public Document()
	{
	}

	public Document(String title, String content, String author, String creationDate)
	{
		this.title = title;
		this.content = content;
		this.author = author;
		this.creationDate = creationDate;
	}

	public Document(Document source)
	{
		this.title = source.title;
		this.content = source.content;
		this.author = source.author;
		this.creationDate = source.creationDate;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setCreationDate(String creationDate)
	{
		this.creationDate = creationDate;
	}

	public abstract Document clone();

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Document document2)) return false;
		return document2.title.equals(title) && document2.content.equals(content) && document2.author.equals(author) && document2.creationDate.equals(creationDate);
	}

	@Override
	public String toString()
	{
		return "Document{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", author='" + author + '\'' + ", creationDate='" + creationDate + '\'' + '}';
	}

}
