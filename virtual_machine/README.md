# Simple Virtual Machine (VM) Implementation in Java and Python

## What is a Virtual Machine (VM)?
A Virtual Machine (VM) is an abstraction that allows software to execute code in an isolated environment, independent of the underlying hardware. It serves as an intermediary between the program and the hardware, providing:
- **Flexibility**: Runs on multiple platforms.
- **Security**: Isolates processes.
- **Portability**: Ensures code runs identically on different machines.

---
## Key Concept: Stack (Pila)
A **stack** is a data structure that follows the **Last In, First Out (LIFO)** principle, meaning the last item added is the first one to be removed. 

### How is the Stack Used in a Virtual Machine?
In a virtual machine, the **stack** is used to store values and intermediate results during the execution of instructions. This structure simplifies operations such as:
- Arithmetic calculations
- Function calls
- Data management

---
## Objective of the Simple Virtual Machine
This project implements a **stack-based virtual machine (VM)** supporting basic operations:
- **PUSH X** → Pushes a number onto the stack.
- **ADD** → Pops the top two numbers, adds them, and pushes the result back onto the stack.
- **PRINT** → Prints the top value from the stack.

Using a stack allows for efficient execution without requiring explicit memory management.

---
## Why Implement the Code Using a Stack?
Using a stack-based approach offers several advantages:
**Simplicity**: Eliminates the need for explicit variable management.
**Efficiency**: Allows for quick mathematical computations using simple push/pop operations.
**Alignment with Real VMs**: Most modern VMs (e.g., JVM, Python VM) use a stack-based architecture.

---
## Relationship with Bytecode
### Java and Bytecode
Java compiles its source code into **bytecode** (`.class` files), which is executed by the **Java Virtual Machine (JVM)**.

🔹 **Why does Java compile code?**
- Java is a compiled language that transforms `.java` files into `.class` files containing bytecode.
- This bytecode is interpreted or Just-In-Time (JIT) compiled by the JVM.

### Python and Bytecode
Python, unlike Java, is **interpreted** but also uses bytecode (`.pyc` files).

🔹 **How does Python execute code?**
1. The Python interpreter converts `.py` files into **bytecode (`.pyc`)**.
2. The **Python Virtual Machine (PVM)** interprets the bytecode at runtime.

🔹 **Why doesn’t Python require explicit compilation?**
- Python automatically compiles `.py` files into `.pyc` bytecode at execution.
- Unlike Java, Python does not require a separate compilation step before execution.

---
## Difference Between a Traditional Virtual Machine and Docker
### Traditional Virtual Machines (JVM, Python VM)
A **traditional VM** (such as the JVM or Python VM) runs **bytecode**, providing an abstraction over the underlying hardware.
It uses a **stack-based** architecture for managing operations and executing instructions.
It ensures **cross-platform portability** (Java bytecode can run on any system with a JVM).

### Docker and Containerization
**Docker is NOT a Virtual Machine** in the traditional sense.
Instead of interpreting bytecode, Docker **virtualizes the OS environment**.
Containers share the host OS kernel, making them more lightweight than full VMs.
Docker is used for **isolating applications**, not for executing low-level instructions like a stack-based VM.
