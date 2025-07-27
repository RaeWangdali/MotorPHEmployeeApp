\# 🚗 MotorPH Employee App



A desktop Java GUI application for managing MotorPH employee records. Built with \*\*Java\*\*, \*\*Swing\*\*, and \*\*Maven\*\*, it performs core HR functions like login authentication, employee search, salary computation, and record management.



---



\## ✅ Features



\- 🔐 Login using first name \& last name (data from `login\_credentials.csv`)

\- 📋 View all employees in a table

\- 🔍 Search employee by ID

\- 💰 Compute salary based on hours worked, rate, and deductions

\- ➕ Add a new employee (auto-saved to `employees.csv`)



---



\## 💻 How to Run This Project



\### 🛠 Requirements

\- Java 8 or higher

\- NetBeans (or any IDE with Maven support)

\- Maven (usually built-in with NetBeans)



---



\### 📦 Setup Instructions



1\. \*\*Clone this repo\*\* to your machine:

&nbsp;  ```bash

&nbsp;  git clone (https://github.com/RaeWangdali/MotorPHEmployeeApp.git)



2\. Open the project in NetBeans:

* &nbsp;	Go to File > Open Project
* &nbsp;	Select the unzipped MotorPHEmployeeApp folder



3\. Ensure CSV files are in the correct location:

* &nbsp;	Place employees.csv and login\_credentials.csv inside:



&nbsp;		src/main/resources/



4\. Run the project:

* &nbsp;	Right-click Main.java in the gui package
* &nbsp;	Select Run File



🗂 Folder Structure

MotorPHEmployeeApp/

├── pom.xml

├── README.md

├── src/

│   └── main/

│       ├── java/

│       │   └── com/

│       │       └── motorph/

│       │           └── motorphemployeeapp/

│       │               ├── model/

│       │               ├── gui/

│       │               ├── controller/

│       │               └── Main.java

│       └── resources/

│           ├── employees.csv

│           └── login\_credentials.csv



📝 Notes

* This is a Maven project — all dependencies are managed via pom.xml.
* If your GUI doesn’t open, check for NullPointerException due to missing or misplaced .csv files.
* This app uses OpenCSV for reading/writing CSVs.



🙋 Default Login Credentials

Try logging in with the following (from login\_credentials.csv):

First Name   Last Name

Villanueva  Andrea Mae

Garcia      Manuel III

Lopez       Josie



📧 Contact

Created by Rae Wangdali. For questions, feel free to open an issue.



