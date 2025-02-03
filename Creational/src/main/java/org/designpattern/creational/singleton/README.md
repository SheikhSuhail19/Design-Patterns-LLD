Java Singleton Pattern Implementation
To implement a lazyInitializedSingleton pattern, we have different approaches, but all of them have the following common concepts:

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for the outer world
  to get
  the instance of the lazyInitializedSingleton class.