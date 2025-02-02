package org.designpattern.creational.singleton.threadsafesingleton.eager.usingenum;

//To overcome this situation with Reflection, Joshua Bloch suggests the use of enum to implement the singleton design pattern as Java ensures that any enum value is instantiated only once in a Java program. Since Java Enum values are globally accessible, so is the singleton. The drawback is that the enum type is somewhat inflexible (for example, it does not allow lazy initialization).

public enum EnumSingleton
{
	INSTANCE;

	private void doSomething()
	{
		System.out.println("Enum Singleton");
	}

	// Reflection cannot be used to destroy enum singleton
	// as enums are inherently serializable and the serialization
	// mechanism ensures that multiple deserialization does not
	// create multiple objects.
	// Therefore, it is guaranteed that only one instance of
	// the enum singleton is present within a JVM.
	// However, there is a catch. If the enum singleton implements
	// Serializable interface, it can still be deserialized into
	// multiple objects. To prevent this, you can implement the
	// readResolve() method and return the same object.
	private Object readResolve()
	{
		return INSTANCE;
	}

	public static void main(String[] args)
	{
		EnumSingleton.INSTANCE.doSomething();
	}
}
