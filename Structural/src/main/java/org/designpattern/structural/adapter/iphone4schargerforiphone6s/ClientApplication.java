package org.designpattern.structural.adapter.iphone4schargerforiphone6s;

public class ClientApplication
{
	public static void main(String[] args)
	{
		IPhone6s iphone6s = new IPhone6s(new Iphone4sTo6sAdapter());
		iphone6s.OnCharge();
	}
}
