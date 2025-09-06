# Design Patterns

Set of solutions used for common problems in software design.

## Creational Patterns

1. **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
2. **Factory Method**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
3. **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
4. **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

Step 5a: The Role of volatile
Question: Why is this code still unsafe without volatile?
Answer: Because of two issues:
1. Instruction reordering: Object creation is not atomic. It consists
   of:
   (a) Allocate memory.
   (b) Initialize the object.
   (c) Assign reference to the variable.
   Without volatile, steps (2) and (3) can be reordered. Another thread
   might see a non-null reference to a half-constructed object.
2. Caching and visibility: Without volatile, one thread may update
   its CPU cache with the new object reference, while other threads still
   see null.


Solution: Declare the instance as volatile. This ensures:
• Visibility: All writes are immediately visible to other threads.

• Ordering: A “happens-before” relationship guarantees object con-
struction completes before reference assignment.

🔹 Why Reflection Cannot Break Enum

This is because:

The Java Language Specification mandates that enum constructors are always private.

The JVM itself prevents reflective creation of enum instances — it checks and blocks it at runtime.

Enum constants are created only once by the classloader during initialization.

So you cannot bypass it like a normal class.
