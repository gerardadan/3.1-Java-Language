#  Description - Exercise Statement

## Level 1 - Exercise 1: ArrayList and HashSet Manipulation

In this exercise, a class named **Month** is created with a "name" attribute to store the name of the month of the year.

1.  **11 Month objects** are created and added to an **ArrayList**, except for "August".
2.  The insertion of "August" is performed in the correct position to maintain the order of the months.
3.  The **ArrayList** is converted into a **HashSet** to ensure that it does not allow duplicates.
4.  The list is traversed using **a for loop** and **an iterator**.

---

## Level 1 - Exercise 2: Lists and ListIterator

1.  A **List<Integer>** is created and filled with various values.
2.  A second **List<Integer>** is created where the elements of the first list are inserted in **reverse order**.
3.  **ListIterator objects** are used to read the elements of the first list and insert them into the second.

---

## Level 1 - Exercise 3: Capitals Quiz

**Objective**

* Develop a Java program that reads a text file countries.txt, where each line contains the name of a country and its capital separated by a comma. The program will store this data in a HashMap<String, String> and conduct a quiz for the user.

**Functionality**

* Read the countries.txt file and store the countries and capitals in a HashMap<String, String>.
    Ask for the user's name.
* Display 10 countries randomly and ask the user to write their capital.
    If the user guesses correctly, add 1 point.
* At the end of the game, save the user's name and their score in the classificacio.txt file.

**Requirements**

* Use a HashMap<String, String> to store the data.
* Read and write files with FileReader and FileWriter or equivalents.
* Use a repetitive structure to manage the 10 questions.
* Use a Random to select the countries randomly.

---

#  Technologies Used

* **Java**
* **Collections in Java (ArrayList, HashSet, ListIterator)**
* **Iterators in Java**

---

#  Requirements

To run this project, you need:

* **JDK 8 or higher**
* A development environment like **IntelliJ IDEA, Eclipse, or VS Code** with Java extension
* Basic knowledge of **Java** and **collections**

### To compile and run the program from the terminal:

```sh
javac Month.java Main.java
java Main
```
