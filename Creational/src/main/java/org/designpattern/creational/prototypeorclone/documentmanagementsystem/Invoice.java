package org.designpattern.creational.prototypeorclone.documentmanagementsystem;

public class Invoice extends Document
{
	private String customerName;
	private String product;
	private int amount;

	public Invoice()
	{
	}

	public Invoice(Invoice source)
	{
		super(source);
		this.customerName = source.customerName;
		this.product = source.product;
		this.amount = source.amount;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public void setProduct(String product)
	{
		this.product = product;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	@Override
	public Document clone()
	{
		return new Invoice(this);
	}

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Invoice document2) || !super.equals(object2)) return false;
		return document2.customerName.equals(customerName) && document2.product.equals(product) && document2.amount == amount;
	}

	@Override
	public String toString()
	{
		return super.toString() + "Invoice{" + "customerName='" + customerName + '\'' + ", product='" + product + '\'' + ", amount=" + amount + '}';
	}

}
