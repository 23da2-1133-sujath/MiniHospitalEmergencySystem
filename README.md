# Mini Hospital Emergency Management System

## 📌 Project Overview

The **Mini Hospital Emergency Management System** is a Java-based console application designed to manage basic hospital patient and emergency treatment operations.

The project demonstrates the practical use of different **Data Structures** such as:

* Binary Search Tree (BST)
* Queue
* Stack
* Linked List

The system allows hospital staff to add, search, display, and delete patients, manage emergency patients, record treatments, and maintain patient visit histories.

---

## 🎯 Objectives

The main objectives of this project are:

* To manage patient information efficiently.
* To implement a patient management system using a **Binary Search Tree**.
* To manage emergency patients using a **Queue**.
* To maintain treatment history using a **Stack**.
* To store patient visit records using a **Linked List**.
* To demonstrate the practical implementation of fundamental data structures in Java.
* To provide a simple menu-driven hospital management application.

---

## ✨ Features

### 1. Patient Management

The system allows users to:

* Add a new patient
* Display all patients
* Search for a patient by Patient ID
* Delete a patient by Patient ID

Patient information includes:

* Patient ID
* Name
* Age
* Contact Number
* Medical Condition

---

### 2. Emergency Patient Queue

Emergency patients are managed using a **Queue** data structure.

The system supports:

* Adding emergency patients to the queue
* Displaying waiting patients
* Sending the next patient for treatment

The queue follows the **FIFO (First In, First Out)** principle.

---

### 3. Treatment Management

Treatment records are managed using a **Stack**.

The system allows users to:

* Add treatment records
* View treatment history
* Remove the latest treatment record

The stack follows the **LIFO (Last In, First Out)** principle.

---

### 4. Patient Visit History

Patient visits are stored using a **Singly Linked List**.

Each visit contains:

* Visit ID
* Visit Date
* Doctor Name
* Diagnosis
* Treatment

The system supports:

* Adding visits
* Viewing visit history
* Searching visits
* Removing visits

---

## 🧩 Data Structures Used

| Data Structure     | Purpose                          |
| ------------------ | -------------------------------- |
| Binary Search Tree | Patient management and searching |
| Queue              | Emergency patient management     |
| Stack              | Treatment history                |
| Linked List        | Patient visit history            |

### Binary Search Tree

The `PatientBST` class stores patients based on their Patient ID.

```text
              Patient ID
                  101
                 /   \
               103    105
```

The BST provides efficient searching and maintains patients in ascending order when displayed using inorder traversal.

---

### Queue

The `EmergencyQueue` class manages emergency patients.

```text
FRONT → Patient 201 → Patient 202 → Patient 203 → REAR
```

Patients are treated in the same order they entered the emergency queue.

---

### Stack

The `TreatmentStack` class stores treatment records.

```text
TOP
 ↓
Patient 203 - X-Ray
Patient 202 - Medicine
Patient 201 - First Aid
```

The most recently added treatment is removed first.

---

### Linked List

The `VisitLinkedList` class stores patient visit records.

```text
HEAD
 ↓
Visit 1 → Visit 2 → Visit 3 → NULL
```

Each visit is connected to the next visit using a node.

---

## 🏗️ Project Structure

```text
MiniHospitalEmergencySystem/
│
├── src/
│   ├── module-info.java
│   │
│   └── hospital/
│       ├── Main.java
│       ├── Patient.java
│       ├── PatientBST.java
│       ├── EmergencyQueue.java
│       ├── TreatmentStack.java
│       ├── Visit.java
│       ├── VisitLinkedList.java
│       └── TestHospitalSystem.java
│
├── bin/
│   └── Compiled Java classes
│
├── .classpath
├── .project
└── README.md
```

---

## 📄 Main Classes

### `Main.java`

The main entry point of the application.

It provides the following menu:

```text
===== Hospital Management System =====

1. Add Patient
2. Display Patients
3. Search Patient
4. Delete Patient
5. Add Emergency Patient
6. Treat Patient
7. Add Treatment
8. View Treatment
9. Add Visit
10. View Visits
0. Exit
```

---

### `Patient.java`

Represents a hospital patient.

Attributes:

```text
patientID
name
age
contactNumber
medicalCondition
```

---

### `PatientBST.java`

Implements the Binary Search Tree used for patient management.

Operations include:

* Insert
* Search
* Inorder traversal
* Delete

---

### `EmergencyQueue.java`

Implements a queue for emergency patients.

Operations include:

* Enqueue
* Dequeue
* Display Queue

---

### `TreatmentStack.java`

Implements a stack for treatment records.

Operations include:

* Push
* Pop
* Display Stack

---

### `Visit.java`

Represents an individual patient visit.

Attributes:

```text
visitID
visitDate
doctorName
diagnosis
treatment
```

---

### `VisitLinkedList.java`

Stores patient visit records using a linked list.

Operations include:

* Add Visit
* Display Visits
* Search Visit
* Remove Visit

---

### `TestHospitalSystem.java`

Contains test cases for the implemented data structures:

* Patient BST
* Emergency Queue
* Treatment Stack
* Patient Visit Linked List

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Development Environment:** Eclipse IDE
* **Java Version:** Java 17+ recommended
* **Concepts:** Object-Oriented Programming & Data Structures
* **Application Type:** Console-Based Application

---

## 🚀 How to Run

### Method 1: Using Eclipse

1. Open **Eclipse IDE**.
2. Select:

```text
File → Import
```

3. Import the `MiniHospitalEmergencySystem` project.
4. Right-click the project.
5. Select:

```text
Run As → Java Application
```

6. Select:

```text
hospital.Main
```

---

### Method 2: Using Command Line

Navigate to the `src` directory and compile the Java files:

```bash
javac -d bin src/module-info.java src/hospital/*.java
```

Then run the application:

```bash
java -p bin -m MiniHospitalEmergencySystem/hospital.Main
```

---

## 🧪 Running the Test Program

To run the built-in test program:

```bash
java -p bin -m MiniHospitalEmergencySystem/hospital.TestHospitalSystem
```

The test program demonstrates the functionality of:

```text
1. Patient BST
2. Emergency Queue
3. Treatment Stack
4. Patient Visit Linked List
```

---

## 💡 Example Workflow

A typical workflow could be:

```text
Add Patient
     ↓
Store Patient in BST
     ↓
Emergency Patient Arrives
     ↓
Add Patient to Queue
     ↓
Treat Next Patient
     ↓
Record Treatment in Stack
     ↓
Add Patient Visit
     ↓
Store Visit in Linked List
```

---

## ⏱️ Time Complexity

| Operation             | Data Structure | Average Complexity |
| --------------------- | -------------- | -----------------: |
| Insert Patient        | BST            |          O(log n)* |
| Search Patient        | BST            |          O(log n)* |
| Delete Patient        | BST            |          O(log n)* |
| Add Emergency Patient | Queue          |               O(1) |
| Treat Patient         | Queue          |               O(1) |
| Add Treatment         | Stack          |               O(1) |
| Remove Treatment      | Stack          |               O(1) |
| Add Visit             | Linked List    |               O(n) |
| Search Visit          | Linked List    |               O(n) |
| Remove Visit          | Linked List    |               O(n) |

`*` BST operations can become **O(n)** in the worst case when the tree becomes unbalanced.

---

## 🎓 Academic Purpose

This project was developed as an academic demonstration of fundamental **Data Structures and Object-Oriented Programming concepts** using Java.

It demonstrates how different data structures can be selected according to the requirements of different hospital management operations.

---

## 🔮 Future Improvements

Possible future improvements include:

* Add a graphical user interface (GUI)
* Add database integration
* Add user authentication
* Add doctor management
* Add appointment scheduling
* Add room/bed management
* Add patient billing
* Add emergency priority levels
* Add data validation
* Store patient information permanently
* Generate hospital reports

---

## 👨‍💻 Project

**Project Name:** Mini Hospital Emergency Management System

**Language:** Java

**Type:** Console-Based Hospital Management System

**Main Concepts:**
`BST` • `Queue` • `Stack` • `Linked List` • `OOP`


