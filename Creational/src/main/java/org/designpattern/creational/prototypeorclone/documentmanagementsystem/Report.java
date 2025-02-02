package org.designpattern.creational.prototypeorclone.documentmanagementsystem;

public class Report extends Document
{
	private String summary;

	public Report()
	{
	}

	public Report(Report source)
	{
		super(source);
		this.summary = source.summary;
	}

	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	@Override
	public Document clone()
	{
		return new Report(this);
	}

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Report document2) || !super.equals(object2)) return false;
		return document2.summary.equals(summary);
	}

	@Override
	public String toString()
	{
		return super.toString() + "Report{" + "summary='" + summary + '\'' + '}';
	}

}
