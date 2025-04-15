Inventory Management System
Overview
This Java-based inventory management system provides a simple login interface and basic user authentication functionality. The system is designed to be extended with inventory management features for administrators.

Features
Current Functionality
User Authentication: Secure login system with username and password verification

Multiple User Support: System supports multiple user accounts (currently admin and clerk)

Encapsulation: Proper object-oriented design with private fields and public methods

Planned Functionality (to be implemented)
Inventory Management: Add, delete, and update inventory items (admin functionality)

Role-based Access: Different privileges for admin vs. regular users

Code Structure
The project consists of three main Java classes:

Login.java - The main entry point that handles user authentication

User.java - Contains user credentials and login validation logic

admin.java - (Under development) Will handle admin-specific inventory operations

Getting Started
Prerequisites
Java Development Kit (JDK) installed

Basic Java development environment set up

How to Run
Compile all Java files in the pack package:

Copy
javac pack/*.java
Run the Login class:

Copy
java pack.Login
Test Credentials
Admin Account:

Username: admin

Password: 12345

Clerk Account:

Username: clerk1

Password: 123321

Future Enhancements
Implement inventory management features in the admin class

Add database connectivity for persistent storage

Implement proper password hashing for security

Add more robust error handling

Develop a graphical user interface (GUI)

Contribution Guidelines
As this is a student project, contributions are welcome! Please:

Fork the repository

Create a feature branch

Submit a pull request with clear documentation of changes

Note: This is a work in progress as part of my software development studies. The system will be expanded with more features as I progress through my coursework.
