# 📘 Theory: 2D Arrays in Java

A **2D array** in Java is an array of arrays. It is used to represent data in a tabular or matrix form, consisting of rows and columns. Each element in a 2D array is identified using two indices: the row index and the column index.

In Java, a 2D array is actually an array where each element is a reference to another array. This means that the rows of a 2D array can have different lengths, which leads to the concept of **jagged arrays**.

---

## 🔹 Characteristics of 2D Arrays

- A 2D array is declared using two sets of square brackets, e.g., `int[][]`.
- The first index refers to the row number.
- The second index refers to the column number.
- The array can be initialized with a fixed number of rows and columns, or with varying column sizes (jagged).
- Java does not require all rows to be the same length.

---

## 🔹 Memory Representation

Internally, a 2D array in Java is stored as an array of references to arrays. This structure provides flexibility in terms of memory usage and layout, especially when using jagged arrays.

---

## 🔹 Jagged Arrays

Java allows 2D arrays where each row has a different number of columns. These are called **jagged arrays** or **ragged arrays**. This is possible because each row is itself an array and can be initialized independently.

---

## 🔹 Use Cases

2D arrays are commonly used in:

- Representing matrices in mathematical computations
- Game development (e.g., grid-based games like chess or tic-tac-toe)
- Image processing (e.g., storing pixel values)
- Storing and manipulating tabular data
- Graph and pathfinding algorithms (e.g., adjacency matrices)

---

## 🔹 Summary

- A 2D array is an array of arrays.
- Java supports both uniform and jagged 2D arrays.
- Elements are accessed using two indices: `[row][column]`.
- Ideal for structured data representation such as tables and matrices.

