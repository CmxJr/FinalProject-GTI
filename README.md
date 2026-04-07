# Student Management System - GTI Final Project

This is a Java-based desktop application designed to manage students, courses, and academic results. It connects to a MySQL database to provide a full CRUD (Create, Read, Update, Delete) experience for educational administration.

## 🚀 Features

* **Student Management:** Register, update, and remove students with automated grade handling.
* **Course & Module Tracking:** View modules associated with specific courses dynamically.
* **Academic Reports:** Generate lists of students by module and distinction levels.
* **Staff Integration:** Track Module Leads (Lecturers) assigned to each academic module.
* **Database Connectivity:** Robust SQL integration using JDBC with "On Delete Cascade" logic.

## 🛠️ Technologies Used

* **Language:** Java (JDK 17+)
* **GUI Toolkit:** Swing & AWT (Abstract Window Toolkit)
* **Database:** MySQL 8.0
* **Build Tool:** Ant (NetBeans Default)
* **Version Control:** Git & GitHub

## 📋 Database Schema

The project uses a relational database named `final_project` with the following key tables:
* `student`: Primary student records.
* `course`: Course details and QQI levels.
* `module`: Academic units linked to staff.
* `course_has_module`: Bridge table for many-to-many relationships.
* `assessment`: Stores grades linked to students and modules.

## 🔧 Installation & Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/CmxJr/FinalProject---GTI.git](https://github.com/CmxJr/FinalProject---GTI.git)
    ```
2.  **Database Setup:**
    * Import the provided SQL script (if available) into your MySQL Workbench.
    * Update the `URL`, `USER`, and `PASSWORD` constants in the Java source code to match your local database settings.
3.  **Run the application:**
    * Open the project in **NetBeans IDE**.
    * Clean and Build the project.
    * Run the `Login` or `MainMenu` frame.

## 👤 Author
* **CmxJr** - Student at Galway Technical Institute
