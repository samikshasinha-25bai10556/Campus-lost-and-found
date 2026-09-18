# Campus Lost & Found System

A simple **Java command-line application** for recording and searching lost and found items on a college campus.

## Project Overview

The **Campus Lost & Found System** helps students, faculty members, and staff keep track of belongings that are lost or found within the campus.

Instead of depending on informal messages or word of mouth, users can record item details such as:

* Item ID
* Item name
* Description
* Location
* Date
* Lost or Found status

The project is developed using **Java** and demonstrates Object-Oriented Programming, collections, searching, validation, exception handling, file handling, modular design, and basic testing.

---

##  Objectives

The main objectives of this project are:

* To provide a simple system for recording lost items.
* To provide a system for recording found items.
* To make lost and found information easier to search.
* To demonstrate Java Object-Oriented Programming concepts.
* To implement input validation and exception handling.
* To practice modular programming using multiple Java classes.
* To use Git and GitHub for version control and project submission.

---

##  Features

### 1. Add Lost Item

Users can enter details about an item they have lost.

Required information:

* Item name
* Description
* Location
* Date

### 2. Add Found Item

Users can record details about an item found on campus.

### 3. View All Items

The system displays all currently stored lost and found items.

### 4. Search by Name

Users can search for an item using its name.

### 5. Search by Location

Users can search for items based on the location where they were lost or found.

### 6. Search by ID

Users can search for a specific item using its unique ID.

### 7. Input Validation

The system checks important input fields and prevents empty item details from being added.

### 8. Exception Handling

Invalid numeric input is handled using Java exception handling.

### 9. File Storage

Item information is saved in a text file named:
items.txt


## 🛠️ Technologies Used

| Technology         | Purpose                                   |
| ------------------ | ----------------------------------------- |
| Java               | Main programming language                 |
| ArrayList          | Store item objects                        |
| OOP                | Classes, objects, inheritance, overriding |
| FileWriter         | Save item information                     |
| Exception Handling | Handle invalid input and file errors      |
| Git                | Version control                           |
| GitHub             | Source code repository                    |



##  Project Structure


Campus-Lost-and-Found/
│
├── src/
│   └── lostandfound/
│       ├── Main.java
│       ├── Item.java
│       ├── LostItem.java
│       ├── FoundItem.java
│       ├── ItemManager.java
│       ├── SearchService.java
│       ├── Validation.java
│       └── FileHandler.java
│
|
│   └── LostAndFoundTest.java
│
├── README.md
├── statement.md

```


##  Description of Java Files

### `Main.java`

The main entry point of the application.

Responsibilities:

* Display the menu
* Accept user input
* Call appropriate classes
* Control program execution
* Handle invalid menu input

### `Item.java`

The base class for items.

It stores common information such as:

```text
ID
Name
Description
Location
Date
```

### `LostItem.java`

Represents a lost item.

It extends the `Item` class and demonstrates inheritance and method overriding.

### `FoundItem.java`

Represents a found item.

It also extends the `Item` class.

### `ItemManager.java`

Manages the collection of items using:

```java
ArrayList<Item>
```

It provides functions for adding items, displaying items, and finding an item by ID.

### `SearchService.java`

Contains search operations.

Users can search items by:

* Name
* Location

### `Validation.java`

Contains reusable validation methods for checking:

* Empty text
* Item ID
* Date

### `FileHandler.java`

Handles saving item information into:
items.txt

It also handles `IOException`.

### `LostAndFoundTest.java`

Contains basic tests for:

* Input validation
* Item ID validation
* Adding an item
* Retrieving an item

---

##  Java Concepts Demonstrated

This project demonstrates several important Java concepts.

### Object-Oriented Programming

The project uses:

* Classes
* Objects
* Encapsulation
* Inheritance
* Method overriding

### Inheritance

The relationship is:

```text
             Item
            /    \
           /      \
     LostItem   FoundItem
```

### Collections

The project uses:

```java
ArrayList<Item>
```

to store multiple item objects.

### Searching

A simple **linear search** is used to search items by name, location, or ID.

The time complexity is:

```text
O(n)
```

where `n` is the number of stored items.

### Exception Handling

The project handles exceptions such as:

```text
NumberFormatException
IOException
```

### File Handling

`FileWriter` is used to save item information to a text file.

---

## 💻 Requirements

To run this project, you need:

* Java JDK 8 or later
* Command Prompt / PowerShell / Terminal
* Git (optional, if cloning from GitHub)

Check Java installation:

```bash
java -version
```

Check Java compiler:

```bash
javac -version
```

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository

Clone the GitHub repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

Move into the project folder:

```bash
cd Campus-Lost-and-Found
```

Replace `YOUR_GITHUB_REPOSITORY_URL` with your actual GitHub repository URL.

---

### Step 2: Compile the Source Code

From the project root directory, run:

```bash
javac -d out src/lostandfound/*.java
```

This compiles the Java files and places the `.class` files inside the `out` folder.

---

### Step 3: Run the Application

Run:

```bash
java -cp out lostandfound.Main
```

---

## 🖥️ Example Output


==============================
 CAMPUS LOST & FOUND SYSTEM
==============================
1. Add Lost Item
2. Add Found Item
3. View All Items
4. Search Item by Name
5. Search Item by Location
6. Search Item by ID
7. Exit
==============================
Enter your choice:
```

### Example: Adding a Lost Item


Enter your choice: 1

--- ADD LOST ITEM ---
Enter item name: Wallet
Enter description: Black leather wallet
Enter location where item was lost: Library
Enter date: 18-09-2026

Item added successfully!
```

### Example: Adding a Found Item


Enter your choice: 2

--- ADD FOUND ITEM ---
Enter item name: Mobile Phone
Enter description: Black Samsung phone
Enter location where item was found: Lab 2
Enter date: 18-09-2026

Item added successfully!
```

### Example: Searching


Enter your choice: 4

Enter item name to search: Wallet

--- LOST ITEM ---
ID: 1
Name: Wallet
Description: Black leather wallet
Location: Library
Date: 18-09-2026


---

## 🧪 Running the Tests

Compile all source files and the test file:

```bash
javac -d out src/lostandfound/*.java test/LostAndFoundTest.java
```

Run the test program:

```bash
java -cp out lostandfound.LostAndFoundTest
```

Example output:

```text
===== TESTING CAMPUS LOST & FOUND SYSTEM =====

Test 1 - Valid item name: PASSED
Test 2 - Empty item name: PASSED
Test 3 - Valid ID: PASSED
Test 4 - Invalid ID: PASSED
Test 5 - Add and find item: PASSED

===== TESTING COMPLETED =====
```

---

## ✅ Testing

The project includes the following test cases:

| Test  | Description             | Expected Result   |
| ----- | ----------------------- | ----------------- |
| TC-01 | Valid item name         | Accepted          |
| TC-02 | Empty item name         | Rejected          |
| TC-03 | Positive ID             | Accepted          |
| TC-04 | Negative ID             | Rejected          |
| TC-05 | Add and retrieve item   | Successful        |
| TC-06 | Invalid menu input      | Error handled     |
| TC-07 | Search existing item    | Item displayed    |
| TC-08 | Search unavailable item | Not-found message |



## 📊 Architecture

The application follows a simple modular architecture:

```text
                    USER
                      |
                      v
                  Main.java
                      |
        +-------------+-------------+
        |             |             |
        v             v             v
  ItemManager   SearchService  Validation
        |
        v
   ArrayList<Item>
        |
   +----+----+
   |         |
   v         v
LostItem  FoundItem
        |
        v
   FileHandler
        |
        v
    items.txt
```

---

## 🔄 Future Enhancements

The following features can be added in future versions:

* Database integration using MySQL
* Graphical User Interface
* Web-based version
* Student login and authentication
* Item categories
* Item status such as Lost, Found, Claimed, and Returned
* Image upload
* Automatic lost/found matching
* Email or application notifications
* Advanced search filters
* JUnit-based automated testing
* Admin dashboard

---

## 📚 Learning Outcomes

Through this project, the following concepts were practiced:

* Java programming
* Object-Oriented Programming
* Classes and objects
* Inheritance
* Method overriding
* ArrayList
* Linear searching
* Input validation
* Exception handling
* File handling
* Modular programming
* Software testing
* Git and GitHub

---

## 👥 Target Users

The system is intended for:

* Students
* Faculty members
* College staff
* Campus administration



