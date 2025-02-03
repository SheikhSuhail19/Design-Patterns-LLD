The Components of the Adapter Design Pattern -:
The Adapter pattern involves three main components -:

a) Target: This represents the interface or class that the client code expects to work with. It defines the operations
that the client can use.

b) Adaptee: This refers to the existing class or interface that needs to be adapted. It has a different interface that
is incompatible with the client’s expectations.

c) Adapter: This is the class that bridges the gap between the Target and Adaptee. It implements the Target interface
and internally uses an instance of the Adaptee to perform the desired operations. The Adapter class acts as a wrapper or
translator, adapting the Adaptee’s interface to match the Target interface.

Different implementations of Adapter Design Pattern -:
There are two main approaches to implementing the Adapter Design Pattern: the class adapter pattern and the object
adapter pattern. Both approaches produce the same result, but they use different techniques.

- Class Adapter Pattern
In a class adapter, the Adapter class extends both the Target interface and the Adaptee class. It inherits the behavior
of the Adaptee and adapts it to match the Target interface. However, this approach requires multiple inheritance, which
may not be supported in some programming languages like Java, unlike C++ which supports multiple inheritance.

- Object Adapter Pattern
In an object adapter, the Adapter class implements the Target interface and contains an instance of the Adaptee class.
It delegates the calls from the Target interface to the Adaptee object, adapting its interface to match the Target
interface. This approach uses composition instead of inheritance, making it more flexible and compatible with different
programming languages.