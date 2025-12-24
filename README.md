# 🍲 Recipe Flavor Matcher (Java Console Project)

## 📌 Project Overview

**Recipe Flavor Matcher** is a Java console-based application developed using the **MVC (Model–View–Controller) architecture** and **JDBC**.
The system allows users to enter ingredients and fetch the best matching recipes from a **pre-populated MySQL database** based on flavor combinations.
Users can also add new recipes to the database.

This project demonstrates **clean architecture, database connectivity, and separation of concerns**, making it suitable for academic evaluation and beginner-level backend development practice.

---

## 🎯 Objectives

* Implement MVC architecture in a Java console application
* Connect Java application with MySQL using JDBC
* Retrieve pre-stored data from database
* Allow users to insert new data
* Maintain clean project structure for scalability

---

## 🏗️ Project Architecture

```
MVC + DAO + JDBC
```

* **Model** → Represents data (Recipe, Ingredient)
* **View** → Handles console input/output
* **Controller** → Manages application logic
* **DAO** → Handles database operations
* **DB Layer** → Manages JDBC connection

---

## 📁 Folder Structure

```
RecipeFlavorMatcher/
│
├── src/
│   ├── app/            # Main entry point
│   ├── controller/     # Application logic
│   ├── dao/            # Database access objects
│   ├── db/             # DB connection
│   ├── model/          # Data models
│   └── view/           # Console UI
│
├── bin/                # Compiled class files
├── lib/                # MySQL JDBC connector
├── database/           # SQL script
├── .gitignore
└── README.md
```

---

## 🛢️ Database Details

**Database Name:** `recipe_flavor_matcher`

### Tables:

* `recipes`
* `ingredients`
* `recipe_ingredients`

✔ Database contains **pre-stored recipes & ingredients**
✔ User can add new recipes at runtime

---

## ⚙️ Technologies Used

* **Java (JDK 8+)**
* **MySQL**
* **JDBC**
* **Git Bash / Command Line**
* **MVC Architecture**

---

## ▶️ How to Run the Project

### 1️⃣ Compile (Git Bash)

```bash
javac -d bin -cp "lib/*" $(find src -name "*.java")
```

### 2️⃣ Run

```bash
java -cp "bin:lib/*" app.MainApp
```

---

## 🧠 Key Features

* Console-based interactive menu
* Ingredient-based recipe search
* JDBC-based database interaction
* Modular and maintainable code structure
* Easy to extend with advanced logic

---

## 📚 Learning Outcomes

* Understanding MVC architecture
* Hands-on experience with JDBC
* MySQL database integration
* Command-line Java project execution
* Clean code organization

s developed for **educational purposes**.
