Bridge, State, Strategy (and to some degree Adapter) have very similar structures. Indeed, all of these patterns are
based on composition, which is delegating work to other objects. However, they all solve different problems. A pattern
isn’t just a recipe for structuring your code in a specific way. It can also communicate to other developers the problem
the pattern solves.

#
    
You can use Builder when creating complex Composite trees because you can program its construction steps to work recursively.

Chain of Responsibility is often used in conjunction with Composite. In this case, when a leaf component gets a request, it may pass it through the chain of all of the parent components down to the root of the object tree.

You can use Iterators to traverse Composite trees.

You can use Visitor to execute an operation over an entire Composite tree.

You can implement shared leaf nodes of the Composite tree as Flyweights to save some RAM.

Composite and Decorator have similar structure diagrams since both rely on recursive composition to organize an open-ended number of objects.

A Decorator is like a Composite but only has one child component. There’s another significant difference: Decorator adds additional responsibilities to the wrapped object, while Composite just “sums up” its children’s results.

However, the patterns can also cooperate: you can use Decorator to extend the behavior of a specific object in the Composite tree.

Designs that make heavy use of Composite and Decorator can often benefit from using Prototype. Applying the pattern lets you clone complex structures instead of re-constructing them from scratch.