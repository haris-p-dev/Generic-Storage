# Generic Storage System
> A type-safe Java implementation for managing objects via Generics and Interfaces.

---

## 📌 Overview
This project provides a reusable storage mechanism designed to handle any object type that implements a unique identifier. It focuses on **Type Safety**, **Encapsulation**, and **Object-Oriented Design**.

## ✨ Features
* **Generic API:** Uses `<T>` for universal object handling.
* **Bounded Types:** Ensures all stored objects provide an ID via the `HasId` interface.
* **ID-Based Retrieval:** Quick lookup for specific objects within the collection.
* **Type Safety:** Prevents runtime errors by enforcing constraints at compile-time.

---

## 🛠️ Technology Stack
* **Language:** Java 17+
* **Concepts:** Generics, Interfaces, Polymorphism.
* **Collections:** `ArrayList`.

---

## 🏗️ How It Works

The system relies on a **bounded type parameter**. Only classes implementing the `HasId` contract can be stored.



### 1. The Interface
Every stored object must provide an integer ID.
```java
public interface HasId {
    int getId();
}
