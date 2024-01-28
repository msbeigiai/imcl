<<<<<<< HEAD
# In-Memory File Manager - Java Application

Overview
This Java application serves as an in-memory file manager, allowing users to perform basic file system operations such as listing files and directories (ls), creating directories (mkdir), creating files (touch), deleting files or directories (rm), and displaying the current directory. The file system operations are performed in-memory, providing a lightweight and fast alternative.

## Prerequisites
Java Development Kit (JDK) installed on your system
A terminal or command prompt for running the application

## Getting Started
### Clone the Repository:

```
git clone https://github.com/msbeigiai/imcl.git
cd imcl
```
### Compile the Java Files:
```
cd src/main/java
javac Main.java
```
### Run the Application:
```
java Main
```

### Usage
The application supports the following commands:

* List Files and Directories:
```
ls
```

* Create Directory:

```
mkdir directory_name
```
* Create File:
```
touch file_name
```
* Delete File:
```
rm -file_or_directory_name
```
* Delete Directory:
```
rm directory_name
```

### Example usage:
```
$ ls
- No files or directories -

$ mkdir documents
$ touch README.md
$ ls
documents/  
README.md

$ rm -README.md
$ ls
documents/

$ touch report.txt
$ ls
documents/
report.txt

$ exit
```
### Contributing
If you find any issues or have suggestions for improvement, feel free to create an issue or submit a pull request. Contributions are welcome!

### License
This project is licensed under the MIT License - see the LICENSE.md file for details.
