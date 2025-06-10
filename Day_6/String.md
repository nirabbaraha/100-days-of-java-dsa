# 📘 Theory: `String` in Java

In Java, a `String` is a sequence of characters used to represent textual data. It is one of the most commonly used classes in the Java Standard Library and belongs to the `java.lang` package.

---

## 🔹 Characteristics of `String`

- `String` is an **object**, not a primitive type.
- It is **immutable**, meaning once a `String` object is created, its value cannot be changed.
- Java maintains a **String pool** to optimize memory usage by reusing common string literals.

---

## 🔹 String Immutability

When you modify a `String`, you are actually creating a **new object**. The original `String` remains unchanged.

Example:  
If `String a = "Hello";`, then `a.toUpperCase()` returns `"HELLO"` but does **not** change `a`.

---

## 🔹 String Pool (Interning)

Java maintains a pool of string literals. When a new string literal is created, the JVM checks the pool:
- If the string already exists, it returns a reference to the existing object.
- If not, it adds the new string to the pool.

This improves performance and reduces memory usage.

---

## 🔹 String vs. StringBuilder vs. StringBuffer

| Feature         | String      | StringBuilder | StringBuffer |
|-----------------|-------------|---------------|---------------|
| Mutability      | Immutable   | Mutable       | Mutable       |
| Thread-Safe     | No          | No            | Yes           |
| Performance     | Slower for many changes | Fast | Slower due to synchronization |

---

## 🔹 Common Use Cases

- Storing and processing text (e.g., user input, logs, file data)
- Forming dynamic messages or queries
- Data parsing and manipulation
- Working with web content, configurations, and identifiers

---

## 🔹 Methods in `String` Class

Though `String` is immutable, Java provides many methods to operate on strings, such as:
- `length()`
- `charAt()`
- `substring()`
- `equals()` / `equalsIgnoreCase()`
- `compareTo()`
- `indexOf()` / `lastIndexOf()`
- `toUpperCase()` / `toLowerCase()`
- `trim()`
- `replace()`
- `split()`
- `contains()`

These return new `String` objects or other results based on the original.

---

## 🔹 Summary

- A `String` in Java is a sequence of characters stored as an immutable object.
- It is widely used and highly optimized for performance via interning.
- String immutability makes Java strings thread-safe and memory-efficient in many use cases.
- For heavy modifications, prefer `StringBuilder` or `StringBuffer`.

