# OOPs Concepts in Java

Java is an object-oriented programming language based on these core principles:

---

## 📦 1. Class and Object
- **Class**: Blueprint for creating objects; defines data members and methods.
- **Object**: Instance of a class with actual values.

---

## 🔧 2. Constructor
- Special method used to initialize objects.
- Has the same name as the class.
- Automatically called when an object is created.
- Can be **default (no-arg)** or **parameterized**.

---

## 🗑️ 3. Destructor (Finalize)
- Java does not have explicit destructors like C++.
- Garbage Collector automatically removes unused objects.
- `finalize()` method can be overridden but is deprecated and not recommended.

---

## 🔒 4. Encapsulation
- Wrapping data (variables) and methods into a single unit (class).
- Data hiding using `private` access modifier.
- Controlled access via getters and setters.

---

## 🧬 5. Inheritance
- Mechanism to acquire properties and behaviors from a parent class using `extends`.
- Enables code reuse and hierarchical relationships.

---

## 🎭 6. Polymorphism
- Ability of a method to take many forms.
- **Compile-time Polymorphism**: Method Overloading.
- **Run-time Polymorphism**: Method Overriding.

---

## 🏠 7. Abstraction
- Hiding internal implementation and showing only the essentials.
- Achieved via `abstract` classes and `interfaces`.

---

## 🔄 8. Shallow Copy vs Deep Copy

- **Shallow Copy**: Copies object references, so original and copy share the same nested objects.
- **Deep Copy**: Creates a new object and recursively copies all objects, so original and copy are independent.

Java’s `clone()` method performs a shallow copy by default unless overridden for deep copying.

---

## ✅ Summary Table

| Concept        | Description                                  | Keywords/Notes                    |
|----------------|----------------------------------------------|---------------------------------|
| Class & Object | Blueprint and instance                        | `class`, `new`                  |
| Constructor    | Initialize new objects                        | Same name as class              |
| Destructor     | Cleanup before object removal (GC-managed)  | `finalize()` (deprecated)       |
| Encapsulation  | Data hiding and controlled access            | `private`, getters/setters      |
| Inheritance    | Reuse code via parent-child classes          | `extends`                      |
| Polymorphism   | Same method, different forms                  | Overloading, Overriding        |
| Abstraction    | Hide details, expose essentials               | `abstract`, `interface`        |
| Shallow Copy   | Copies references                             | Default `clone()` behavior     |
| Deep Copy      | Copies objects recursively                     | Custom `clone()` or serialization |

---
