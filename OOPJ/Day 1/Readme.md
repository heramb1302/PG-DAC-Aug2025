## **Introduction to Java**
- Java is a **high-level, object-oriented, platform-independent** programming language.
- Developed by **James Gosling** at **Sun Microsystems** in **1995**.
- Follows the **WORA (Write Once, Run Anywhere)** principle using **JVM (Java Virtual Machine)**.

### **Key Highlights**
- **Simple:** Syntax similar to C++, but with automatic memory management.
- **Object-Oriented:** Uses classes and objects for better code modularity.
- **Platform-Independent:** Compiled into **bytecode** which runs on any system with JVM.
- **Secure:** No explicit pointers, automatic garbage collection, and runtime security checks.
- **Robust:** Strong memory management and exception handling.
- **Multithreaded:** Supports concurrent execution of multiple tasks.
- **Portable:** Java bytecode can run on any compatible OS.

### **JVM Components**
1. **Class Loader** - Loads `.class` files into memory.
2. **Runtime Memory Areas:**
   - **Method Area**: Stores class structures like methods, static variables.
   - **Heap**: Stores objects and instance variables.
   - **Stack**: Stores method calls and local variables.
   - **PC Register**: Holds address of current instruction.
   - **Native Method Stack**: Stores native code (C/C++ methods).
3. **Execution Engine**:
   - **Interpreter**: Converts bytecode to machine code line-by-line.
   - **JIT (Just-In-Time) Compiler**: Optimizes frequently used code.
4. **Garbage Collector (GC)**: Automatically removes unused objects.

### **JVM Architecture Diagram**
```
        +--------------------------+
        |        Class Loader       |
        +--------------------------+
        |        Method Area        |
        |          Heap             |
        |          Stack            |
        |        PC Register        |
        |  Native Method Stack      |
        +--------------------------+
        |    Execution Engine       |
        |  (Interpreter + JIT)      |
        +--------------------------+
        |     Garbage Collector     |
        +--------------------------+
```
#### **Applications of Java**
- **Desktop Applications**: IDEs, media players, and antivirus software.
- **Web Applications**: E-commerce platforms, dynamic websites (using Servlets and JSP).
- **Mobile Applications**: Android apps (Java is the base language for Android development).
- **Enterprise Applications**: Large-scale distributed systems using **Java EE**.
- **Embedded Systems**: Applications in consumer electronics.
- **Big Data and Cloud Computing**: Frameworks like Hadoop rely on Java.
- **Gaming Applications**: High-performance gaming engines.

---

#### **Why Learn Java?**
- **Versatility**: Can be used for a wide range of applications.
- **Community Support**: One of the largest developer communities.
- **Job Opportunities**: Widely used in enterprise environments.
- **Rich API and Libraries**: Extensive built-in libraries and third-party frameworks.

---
#### **Setting Up Java Environment**
- **Download and Install JDK**:
  - Install the latest JDK from Oracle's official website or OpenJDK.
- **Configure Environment Variables**:
  - Add the JDK `bin` folder to the `PATH` system variable.
- **Verify Installation**:
  - Run `java -version` and `javac -version` in the terminal.
---
#### **Features of Java**
- **Platform Independent**:
  - Java code is compiled into **bytecode** by the Java Compiler (`javac`).
  - Bytecode runs on any platform using the **Java Virtual Machine (JVM)**.
- **Object-Oriented**:
  - Based on OOP principles: **Encapsulation, Inheritance, Polymorphism, and Abstraction**.
- **Robust**:
  - Strong memory management, exception handling, and type-checking mechanisms.
- **Secure**:
  - No explicit pointers, built-in security features, and a security manager for applets.
- **Multithreaded**:
  - Supports multiple threads to run concurrently.
- **High Performance**:
  - Bytecode execution is fast, thanks to the **Just-In-Time (JIT)** compiler.
- **Dynamic and Extensible**:
  - Supports dynamic linking and can accommodate new libraries seamlessly.
 
---
# Java Development Platform
#### **What is JDK?**
- **Full Form**: Java Development Kit.
- It is a software development environment used for developing Java applications.
- JDK is a superset of **JRE (Java Runtime Environment)**, which includes tools for development and debugging.

#### **Key Components of JDK**
1. **Compiler (`javac`)**:
   - Converts Java source code (`.java` files) into bytecode (`.class` files).
2. **Java Virtual Machine (JVM)**:
   - Executes the compiled bytecode.
3. **Java Runtime Environment (JRE)**:
   - Includes libraries and JVM necessary to run Java applications.
4. **Development Tools**:
   - Debuggers (e.g., `jdb`)
   - Profilers
   - Archiving tools (`jar`)
5. **API Libraries**:
   - Predefined classes and methods for Java development (e.g., `java.util`, `java.io`).
6. **Documentation Generator (`javadoc`)**:
   - Generates HTML documentation from Java source code comments.
7. **Tools for Packaging**:
   - `jar` for bundling compiled classes and resources into a JAR file.

#### **Usage of JDK**
- **Compiling Code**:
  - Use `javac` to compile Java programs into bytecode.
  - Example: `javac HelloWorld.java`
- **Running Applications**:
  - Execute bytecode using the `java` command.
  - Example: `java HelloWorld`
- **Creating Executables**:
  - Bundle Java applications into JAR files using the `jar` tool.
  - Example: `jar cvf MyApp.jar *.class`
- **Debugging**:
  - Use tools like `jdb` to debug Java programs.
- **Documentation**:
  - Use `javadoc` to create developer-friendly documentation from source code comments.
  - Example: `javadoc -d docs HelloWorld.java`
- **Memory Management**:
  - JDK tools like `jconsole` and `jvisualvm` monitor and optimize memory usage.
- **Multi-Version Compilation**:
  - Compile code to target specific Java versions using the `--release` flag.
  - Example: `javac --release 8 HelloWorld.java`

#### **Why is JDK Important?**
- Essential for Java application development.
- Provides the environment to write, compile, debug, and execute Java code.
- Helps package applications for deployment.
- Integral for learning Java and building software ranging from basic utilities to enterprise-grade systems.

### **`printf()` in Java - Explanation with Examples**  

#### What is `printf()` in Java?
The **`printf()`** method in Java is used to print formatted output to the console. It is a method of the **`PrintStream`** class, which is a part of the **`System.out`** stream.

The method works similarly to **`printf()`** in C/C++ by formatting the output based on format specifiers.

---

### **Syntax:**
```java
System.out.printf(format, arguments);
```
- **format:** The format string containing text and format specifiers.
- **arguments:** The values to be formatted and printed.

---

### **Format Specifiers**
| Specifier | Description       | Example     |
|-----------|------------------|------------|
| `%d`      | Integer          | `System.out.printf("%d", 25);`
| `%f`      | Floating-point   | `System.out.printf("%.2f", 10.5678);`
| `%s`      | String           | `System.out.printf("%s", "Hello");`
| `%c`      | Character        | `System.out.printf("%c", 'A');`
| `%b`      | Boolean          | `System.out.printf("%b", true);`
| `%n`      | New Line         | `System.out.printf("Hello%nWorld");`

---

### **Difference between `print()`, `println()`, and `printf()`**
| Method   | Description               |
|----------|--------------------------|
| `print()` | Prints the text without a newline. |
| `println()` | Prints the text and moves to the next line. |
| `printf()` | Prints formatted text with format specifiers. |

---
### **JIT Compiler in Java - Key Points**
- **Definition:** Converts bytecode into machine code at runtime to improve performance.
- **Part of:** Java Virtual Machine (**JVM**).
- **Purpose:** Speed up the execution of frequently used code.
- **Working Process:**
  - JVM first interprets bytecode line by line.
  - JIT detects **hotspot methods** (frequently used methods).
  - Converts those methods into **native machine code**.
  - Stores compiled code for future reuse.

---

### **Advantages**
- Faster execution.
- Adaptive performance optimization.
- Code caching.
- Balanced interpretation and compilation.

---

### **Disadvantages**
- Higher memory usage.
- Slight delay during initial compilation.
- Best performance seen in long-running applications.
