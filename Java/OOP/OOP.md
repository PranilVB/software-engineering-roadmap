# OOP 3 — Inheritance, Polymorphism, Encapsulation & Abstraction

## 1. OOP Principles

The four main principles of Object-Oriented Programming:

1. **Inheritance** — reusing/acquiring properties and behavior from another class.
2. **Polymorphism** — one interface/reference can have multiple forms of behavior.
3. **Encapsulation** — bundling data and methods together and controlling access to data.
4. **Abstraction** — exposing essential functionality while hiding implementation details.

---

# 2. Inheritance

### Definition

Inheritance allows a **child/subclass** to acquire accessible fields and methods from a **parent/superclass**.

### Syntax

```java
class Child extends Parent {
}
Example
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

Dog inherits eat() from Animal.

Important Points
extends is used for class inheritance.
Promotes code reusability.
Child class can add its own fields and methods.
private members of the parent are not directly accessible in the child.
Java allows a class to extend only one class.
3. Types of Inheritance
Single Inheritance

One child inherits from one parent.

Animal
   ↓
  Dog
class Animal {
}

class Dog extends Animal {
}
Hierarchical Inheritance

Multiple children inherit from the same parent.

       Animal
       /    \
     Dog    Cat
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
Multiple Inheritance

One class inherits from multiple parent classes.

A     B
 \   /
   C

Java does not support multiple inheritance through classes:

class C extends A, B { } // ❌
Why?

It can create ambiguity if both parent classes contain the same method.

Java can achieve multiple inheritance of type through interfaces:

interface A {
}

interface B {
}

class C implements A, B {
}
Hybrid Inheritance

Combination of multiple inheritance types.

Java does not support arbitrary hybrid inheritance through classes, but similar structures can be created using interfaces.

4. super Keyword
Definition

super refers to the immediate parent class portion of the current object.

Uses
Access parent class variable.
Call parent class method.
Call parent class constructor.
Example
class Animal {

    String name = "Animal";

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void display() {
        System.out.println(name);
        System.out.println(super.name);
        super.sound();
    }
}
Important
this  → current class/object
super → parent class
5. private Keyword
Definition

private restricts direct access to a class member from outside its declaring class.

class Student {

    private int marks;
}

This provides data protection and supports encapsulation.

Important

A child class also cannot directly access a parent's private members.

6. Polymorphism
Definition

Polymorphism means "many forms."

The same method/interface can represent different behavior.

Java has two major forms:

Polymorphism
├── Static / Compile-time
│   └── Method Overloading
│
└── Dynamic / Runtime
    └── Method Overriding
7. Static Polymorphism
Definition

Polymorphism resolved during compile time.

The main example is method overloading.

Method Overloading

Same method name but different parameter lists.

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
Overloading can differ by:
Number of parameters
Parameter types
Parameter order
Cannot overload using only return type
int add(int a, int b)
double add(int a, int b) // ❌
8. Dynamic Polymorphism
Definition

Polymorphism resolved during runtime.

It occurs through method overriding.

Example
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

Animal animal = new Dog();
animal.sound();

Output:

Bark
Most Important Concept
Reference Type → determines what members are accessible

Object Type → determines which overridden method executes

Example:

Animal animal = new Dog();

Reference type:

Animal

Actual object:

Dog

Therefore the overridden Dog.sound() executes.

9. Method Overriding
Definition

A subclass provides its own implementation of an inherited method with the same signature.

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
Important Rules
Must involve inheritance.
Same method name.
Same parameter list.
Return type must be compatible.
Cannot reduce access visibility.
private methods cannot be overridden.
static methods are not overridden.
final methods cannot be overridden.
@Override is recommended.
10. Static Methods and Overriding
Important

Static methods cannot be overridden.

If a child declares a static method with the same signature, it is called method hiding, not overriding.

class Parent {

    static void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void display() {
        System.out.println("Child");
    }
}

Static method selection is based on the reference/class type, not runtime polymorphism.

11. final Keyword

final prevents further modification depending on where it is used.

Final Variable
final int MAX = 100;

Cannot be reassigned.

Final Method
final void display() {
}

Cannot be overridden.

Final Class
final class Parent {
}

Cannot be extended.

Remember
final variable → cannot reassign
final method   → cannot override
final class    → cannot inherit
12. Encapsulation
Definition

Encapsulation is the bundling of data and methods inside a class while controlling access to the internal data.

Common implementation:

private fields
      +
public methods
      ↓
controlled access
Example
class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }
}

The balance cannot be directly modified from outside the class.

Benefits
Data protection
Controlled access
Validation
Better maintainability
Reduced coupling
13. Data Hiding
Definition

Data hiding means preventing direct access to internal data from outside the class.

Usually achieved using private.

class Student {

    private float marks;

    public void setMarks(float marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public float getMarks() {
        return marks;
    }
}

Instead of:

student.marks = 150; // ❌

we use:

student.setMarks(95); // ✅
Key Point

Data hiding is an important aspect of encapsulation.

14. Abstraction
Definition

Abstraction means exposing the essential functionality while hiding unnecessary implementation details.

Java primarily provides abstraction through:

Abstract classes
Interfaces
Example
abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts");
    }
}

The user knows that start() exists without needing to know its internal implementation.

15. Encapsulation vs Abstraction
Encapsulation	Abstraction
Protects/controls access to data	Hides implementation complexity
Focuses on how data is accessed	Focuses on what is exposed
Commonly uses private	Uses abstract classes/interfaces
Provides controlled access	Provides essential interface
Example: private balance	Example: abstract start()
Easy Memory Trick

Encapsulation = Protect the data

Abstraction = Hide the complexity

16. this vs super
this	super
Refers to current object/class	Refers to parent class
Access current class members	Access parent class members
Calls current class constructor	Calls parent constructor
this.variable	super.variable
this()	super()
17. Overloading vs Overriding
Overloading	Overriding
Same method name	Same method name
Different parameters	Same parameters
Usually same class	Requires inheritance
Compile-time	Runtime
Static polymorphism	Dynamic polymorphism
Return type alone cannot differentiate	Compatible return type required
Easy Memory Trick

Overloading = same name, different parameters

Overriding = child changes parent behavior

18. OOP 3 Quick Revision
                    OOP
                     │
        ┌────────────┼────────────┐
        ↓            ↓            ↓
   Inheritance   Polymorphism   Encapsulation
        │            │              │
     extends      ┌──┴──┐        private
        │         ↓     ↓           │
     Parent     Static Dynamic    Controlled
       ↓           │       │        access
     Child     Overload Override
                     │       │
                 Compile   Runtime
                   time      time

                  Abstraction
                       │
               Hide complexity
                       │
             Abstract class / Interface
⭐ Important Points to Remember
extends → class inheritance.
Java classes support single inheritance.
Java does not support multiple inheritance through classes.
Multiple inheritance of type can be achieved using interfaces.
super → parent class.
this → current object.
private → restricts direct access.
Overloading → compile-time polymorphism.
Overriding → runtime polymorphism.
Static methods are hidden, not overridden.
final variable → cannot reassign.
final method → cannot override.
final class → cannot extend.
Encapsulation → controlled access to data.
Data hiding → restrict direct access to internal data.
Abstraction → hide implementation details.
@Override helps the compiler verify that a method is actually overriding a superclass method.
🎯 OOP 3 Interview Questions
What is inheritance?
Why does Java not support multiple inheritance through classes?
What is the difference between this and super?
What is polymorphism?
Overloading vs overriding?
What is compile-time polymorphism?
What is runtime polymorphism?
How does Java decide which overridden method to execute?
Can static methods be overridden?
What is method hiding?
What does final do?
What is encapsulation?
What is data hiding?
What is abstraction?
Encapsulation vs abstraction?
Can a private method be overridden?
Can a final method be overridden?
Can a final class be inherited?
Can constructors be overridden?
Can constructors be overloaded?