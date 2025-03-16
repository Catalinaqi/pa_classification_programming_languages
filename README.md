# Programming Languages Classification

This document provides a technical description of interpreted, compiled, and mixed languages, along with steps to configure and execute them in Visual Studio Code.

## 1. Programming Languages

### **Interpreted Languages**

Interpreted languages execute source code line by line using an interpreter without requiring prior compilation. This makes them more flexible and easier to debug but generally slower compared to compiled languages. They are widely used in environments where portability and rapid development are crucial.

**Objective:** Designed to prioritize ease of development, flexibility, and cross-platform compatibility.

**Examples:** **Python, JavaScript, Ruby, PHP, Bash, ABAP, PL/SQL**

### **Compiled Languages**

Compiled languages require a compilation phase that translates the source code into machine code before execution. This process improves performance and efficiency compared to interpreted languages since the executable code is optimized for the processor architecture.

**Objective:** Created to maximize performance, efficiency, and low-level control over system resources.

**Examples:** **C, C++, Rust, Go, Fortran, Pascal**


### **Mixed Languages**

Mixed languages combine features of both compiled and interpreted languages. Typically, they are compiled into an intermediate bytecode that is then interpreted or executed by a virtual machine (JVM, CLR, etc.). This allows them to be portable while maintaining reasonable performance.

**Objective:** Designed to provide a balance between portability and execution efficiency, enabling platform independence.

**Examples:** **Java, C#, Kotlin, TypeScript, Python con PyPy**

---

## 2. Steps to Configure and Execute in Visual Studio Code

### **Setup for Python (Interpreted Language)**
1. Install Python from [python.org](https://www.python.org/).
2. Install the Python extension in VS Code.
3. Verify the installation by running:
   ```sh
   python --version
   ```
4. Configure the execution environment in VS Code.

### **Setup for C++ (Compiled Language)**
1. Install MinGW (Windows) or GCC (Linux/macOS).
2. Add MinGW/GCC to the system `PATH`:
   - On Windows, add `C:\MinGW\bin` to **Environment Variables**.
3. Install the C++ extension in VS Code.
4. Verify the installation by running:
   ```sh
   g++ --version
   ```

**Steps execute:**
   g++ "NameFile.cpp"
   ./NameFileAfterCompilated.exe
   ------------------------------
   rm NameFileAfterCompilated.exe
   g++ "NameFile.cpp"
   ./NameFileAfterCompilated.exe


### **Setup for Java (Mixed Language)**
1. Install Java JDK from [oracle.com](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Add the JDK path to the system `PATH`:
   - On Windows, add `C:\Program Files\Java\jdk-XX\bin` to **Environment Variables**.
3. Install the Java extension in VS Code.
4. Verify the installation by running:
   ```sh
   javac -version
   ```
**Steps execute:**
   javac "NameFile.java"
   java NameFile
   --------

## 3. Configuring IntelliSense for C++ in VS Code 

If using TDM-GCC, you must configure IntelliSense properly in Visual Studio Code to avoid errors in std::string, std::map, and other standard libraries. Follow these steps:

1. Modify c_cpp_properties.json

2. Open VS Code and press Ctrl + Shift + P.

3. Type "C/C++: Edit Configurations (JSON)" and select it.

4. Replace the existing configuration.

5. Save the file and restart VS Code.

6. Reload IntelliSense with Ctrl + Shift + P → "Reload Window".

7. Verify that errors related to std::string and std::map are resolved.