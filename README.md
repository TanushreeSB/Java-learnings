# Java-learnings

## 📌 Data Types in Java

In Java, data types are broadly classified into **two categories**:

---

### 1️⃣ Primitive Data Types

Primitive data types are **basic, built-in data types** provided by Java. They store **simple values** directly.

**Types of Primitive Data Types:**

* `byte`
* `short`
* `int`
* `long`
* `float`
* `double`
* `boolean`
* `char`

**Key Characteristics:**

* Predefined in Java
* Store actual values
* Start with **lowercase letters**
* Cannot call methods
* Cannot be `null`

---

### 2️⃣ Non-Primitive Data Types (Reference Types)

Non-primitive data types are used to store **references to objects** rather than the actual data.

**Examples of Non-Primitive Data Types:**

* `String`
* Arrays
* Classes
* Interfaces

**Key Characteristics:**

* Mostly created by the programmer
  *(Exception: `String` is provided by Java)*
* Store references to objects
* Can call methods to perform operations
* Usually start with **uppercase letters**
* Can have a value of `null`

---

## 🔍 Difference Between Primitive and Non-Primitive Data Types

| Feature        | Primitive Data Types     | Non-Primitive Data Types      |
| -------------- | ------------------------ | ----------------------------- |
| Definition     | Built-in data types      | User-defined (except String)  |
| Data Storage   | Stores actual value      | Stores reference to an object |
| Method Support | Cannot call methods      | Can call methods              |
| Case Style     | Lowercase (`int`)        | Uppercase (`String`)          |
| Null Value     | Cannot be `null`         | Can be `null`                 |
| Examples       | `int`, `char`, `boolean` | `String`, Arrays, Classes     |

---

## 📌 The `var` Keyword in Java

The `var` keyword was introduced in **Java 10** (released in 2018).

It allows the **compiler to automatically infer the data type** of a variable based on the value assigned to it. This helps reduce verbosity and makes code **cleaner and more readable**, especially when dealing with long or complex types.

---

## 🔹 Basic Example

Instead of explicitly declaring a type:

```java
int x = 5;
```

You can write:

```java
var x = 5;   // x is inferred as int
System.out.println(x);
```

The compiler determines that `5` is an `int`, so `x` becomes an `int`.

---

## 🔹 Examples with Different Data Types

The inferred type depends on the value assigned:

```java
var myNum = 5;           // int
var myDouble = 9.98;     // double
var myChar = 'D';        // char
var myBoolean = true;    // boolean
var myString = "Hello";  // String
```

---

## ⚠️ Important Notes About `var`

### 1️⃣ Initialization Is Mandatory

You must assign a value at the time of declaration.

```java
var x;       // ❌ Error
var x = 5;   // ✅ Valid
```

---

### 2️⃣ Type Is Fixed After Inference

Once the compiler infers the type, it **cannot be changed**.

```java
var x = 5;   // x is inferred as int
x = 10;      // ✅ OK (still an int)
x = 9.99;    // ❌ Error (double cannot be assigned to int)
```

---

### 3️⃣ `var` Is Not Dynamically Typed

Although `var` looks flexible, Java remains **statically typed**.
The type is decided **at compile time**, not at runtime.

---

## ✅ Summary

* `var` improves readability by reducing redundant type declarations
* The type is inferred **only once** and remains fixed
* Initialization is required
* Java does **not** become dynamically typed with `var`

---


