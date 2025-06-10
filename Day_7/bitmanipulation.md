# 🧠 Bit Manipulation in Programming

Bit Manipulation is the act of algorithmically manipulating bits or binary digits (0 and 1), which are the most basic form of data in computers.

---

## ✨ Why Bit Manipulation?

- Faster than arithmetic operations
- Space-efficient operations
- Widely used in:
  - Competitive programming
  - Embedded systems
  - Cryptography
  - Network protocols

---

## 🔢 Binary Basics

- **Bit**: A binary digit (0 or 1)
- **Byte**: 8 bits
- `2^n` represents how many values can be represented with `n` bits.

---

## 🧮 Common Bitwise Operators

| Operator | Symbol | Description        | Example       |
|----------|--------|--------------------|---------------|
| AND      | `&`    | 1 if both bits are 1| `5 & 3 = 1`   |
| OR       | `|`    | 1 if any bit is 1   | `5 | 3 = 7`   |
| XOR      | `^`    | 1 if bits are different | `5 ^ 3 = 6` |
| NOT      | `~`    | Flip all bits       | `~5 = -6`     |
| Left Shift | `<<` | Shifts bits to left | `5 << 1 = 10` |
| Right Shift| `>>` | Shifts bits to right| `5 >> 1 = 2`  |

---

## 🧠 Bit Tricks and Use Cases

### 1. ✅ Check if a number is even or odd
```java
if ((n & 1) == 0) → Even
if ((n & 1) == 1) → Odd
