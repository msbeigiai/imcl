In-Memory File Manager - Java Application
Overview
This Java application serves as an in-memory file manager, allowing users to perform basic file system operations such as listing files and directories (ls), creating directories (mkdir), creating files (touch), deleting files or directories (rm), and displaying the current directory. The file system operations are performed in-memory, providing a lightweight and fast alternative.

Prerequisites
Java Development Kit (JDK) installed on your system
A terminal or command prompt for running the application

Getting Started
Clone the Repository:
git clone https://github.com/your-username/in-memory-file-manager.git
cd in-memory-file-manager
Compile the Java Files:
javac FileManager.java
Run the Application:
java FileManager
Usage
The application supports the following commands:

List Files and Directories:

bash
Copy code
ls
Create Directory:

bash
Copy code
mkdir directory_name
Create File:

bash
Copy code
touch file_name
Delete File or Directory:

bash
Copy code
rm file_or_directory_name
Display Current Directory:

bash
Copy code
pwd
Exit the Application:

bash
Copy code
exit
Example Usage
bash
Copy code
$ ls
- No files or directories -

$ mkdir documents
$ touch README.md
$ ls
documents  README.md

$ rm README.md
$ ls
documents

$ cd documents
$ touch report.txt
$ ls
report.txt

$ pwd
Current Directory: /documents

$ exit
Contributing
If you find any issues or have suggestions for improvement, feel free to create an issue or submit a pull request. Contributions are welcome!

License
This project is licensed under the MIT License - see the LICENSE.md file for details.
