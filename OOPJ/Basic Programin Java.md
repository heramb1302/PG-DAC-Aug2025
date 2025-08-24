

### **1. Hello World Program**

```java
// This is a simple Java program
public class HelloWorld {
    public static void main(String[] args) {
        // Print a message to the console
        System.out.println("Hello, World!");
    }
}
```

---

### **2. Explanation of Each Part**

* `public class HelloWorld`

  * Defines a **class** named `HelloWorld`.
  * In Java, **every program must have at least one class**.

* `public static void main(String[] args)`

  * The **main method** is the entry point of any Java program.
  * JVM starts executing the program from here.
  * `String[] args` allows passing command-line arguments (optional).

* `System.out.println("Hello, World!");`

  * Prints the text `"Hello, World!"` to the console.
  * `System.out` is the standard output stream.
  * `println` prints the line and moves to the next line.

---

### **3. Steps to Run the Program**

1. Save the file as **HelloWorld.java** (class name = file name).

2. Open terminal/command prompt and **compile** the program:

   ```
   javac HelloWorld.java
   ```

   * This generates **HelloWorld.class** (bytecode).

3. Run the program using JVM:

   ```
   java HelloWorld
   ```

   * Output:

     ```
     Hello, World!
     ```

---

### **4. Example: Program with Variables and Arithmetic**

```java
public class BasicMath {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;

        System.out.println("Sum of a and b = " + sum);
    }
}
```

**Output:**

```
Sum of a and b = 15
```

---

