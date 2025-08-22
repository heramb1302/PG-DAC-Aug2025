# Introduction to Operating System
	  Intermediate between Hardware and Software applications
	  Hides hardware complexity (Read/write file storage, send/receive socket network)
	  Handles resource management (CPU scheduling, Memory management)
	  Provide isolation and protection (allocate different parts of memory to different applications so that applications don't overwrite other memory locations)
  
# Operating System definition:
  An Operating System is a layer of systems software that:
  
    -directly has privileged access to the underlying hardware;
    -hides the hardware complexity;
    -manages hardware on behalf of one or more applications according to some predefined policies.
    -In addition, it ensures that applications are isolated and protected from one another.

# Basics of OS:

# Kernel:
 - The kernel is a computer program that is the core of the computer's operating system with complete control over everythig in the system.
 
# System Boot:
  -Boostrap loader: locates the kernel, loads it into memory and start it.

  -Booting system, Bootstrap program.

  -EPROM or ROM memory 

# Types of Operating System:

## 1. Sigle Processor System
  -One main CPU capable of executing a general purpose instruction set including instructions from user processor

## 2. Multiprocessor System
  -prallel system or tightly coupled system
  -2/more processors in close communiucation, sharing the computer bus and somtimes the clock, memory and peripheral devices.

## 3. Clustered System
	-Client-Server system
	-Peer to peer system
	
# OS operation:
  ### Interrupt
  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/f1768fc0-e286-4910-bb20-7ea10aeafdb6)

  ### Kernel and User mode : Dual mode
  	-Kernel mode: handle hardware opration
  	-USer mode: handle application software
  	-Mode bit: undersatand by Kernel mode
   ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/2dedf263-55f1-4d0c-a075-2c17ad3eaae8)

  	
# Introduction to Linux:
    -Unix, Windows and Linux

# Windows:
  -User friendly
  -GUI: Graphical User Interface
  -Additional cost for software
  -No distributions
  -Not customizable
  -Admin
  -OS
  -Folders
  -Software
  -\(Backward Slash)
  -Filesystem : FAT,ISO ,UDF,HFS
  -Developed by Microsoft

# Linux:
  -Open source
  -free installation
  -CLI: Command Line Interface
  -Lot of distributions
  -Customizable features
  -Root user
  -Kernel
  -Directory
  -Packages
  -/(Forward Slash)
  -File system : in root users subfolder
  -Developed by Linus Torvalds : (UNIX OS) (1991)
  -fully customizable
  -stable
  -better security structure
  -high portable

# Linux Distribution:
	-Ubuntu : easy to user
	-Linux mint
	-Debian : stability
	-CentOS : trademark
	-Fedora : Application
	-RedHat : commercial
-UNIX architure:

# Powerful features of Unix:
  -Security: private and shared files
  -Multi-user support
  -Inter process communication
  -Extensive network support
  -data transmission to I/O devices
  -STABILITY: 
  -Example: Critical applications
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/bc97f90e-5d07-4886-8c36-5a28e04be33d)

# Kernel: 
  -heart of OS
  -the low level core of the system that is the interface between user application and hardwre.
  -Function:
  	Mange memory
  	Manage I/O devices
  	Allocate the time between user and process
  	Interprocess communication
  	Setting the priority for process


# Shell:
  -The shell program that sits on the interface between user and kernel
  -It is a command interpreter and it has programming capability of its own.

# Shell Types:
  -Bourne shell (First shell by Stephen Bourne)
  -C shell(sh)
  -Korn shell(ksh)
  -Bourne Again Shell (bash)(.sh)

# Bash:
	-CLI : comands : Linux based system
	-command language interpreter and programming language
	-supports variables, functions, flow control,....
	-read, write and execute small command line programs callled as shell script.
	
# Terminal Emulator:
  Username@Hostname : working directory

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/77d4ce5d-c32c-40e8-b2d5-4be0a2a376de)


# Linux Commands:
  -Commands will tell OS to perform set of operations
  -Synatx:
  
  		Command [option] [arguments]
  
  pwd: present working directory
  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/bc13f4a7-0f81-4414-bffd-13f4a05e09b0)

  ls: list of files
  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/085ced53-2b17-4cde-9ecf-879c81100818)

# File System:
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/67587887-0e2f-49c8-983b-eba9f7f7f025)

![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/d093ade5-bad5-4a2d-9269-237f64d9a7b4)

# Details of Directory files:
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/5d4bd690-f6b6-4135-937d-9bd9e30d5b10)

---
# Process

### **Process and Process Types**

- **Definition of Process**:
  - A process is a program in execution, including the program code, current activity, and associated resources such as memory, CPU time, and I/O devices.
<img width="1085" height="466" alt="image" src="https://github.com/user-attachments/assets/6af38285-477d-48d1-ae27-20adae9b76f8" />

- **Preemptive vs. Non-Preemptive Processes**:
  - **Preemptive Process**:
    - The operating system can interrupt and temporarily suspend a running process to assign CPU time to another process. 
    - **Example**: A time-sharing system where processes are switched frequently.
  - **Non-Preemptive Process**:
    - Once a process starts executing, it runs to completion without being interrupted.
    - **Example**: Batch processing systems where each job runs to completion before the next job starts.

### **Difference Between Process and Thread**

- **Process**:
  - Independent execution unit with its own memory space.
  - Higher overhead for creation, context switching, and management.
  - **Example**: Running a web browser as a process, which can have multiple tabs (each potentially as a thread).

- **Thread**:
  - A smaller execution unit within a process, sharing the same memory space as other threads in the process.
  - Lower overhead, faster context switching.
  - **Example**: Each tab in a web browser might be a thread within the same browser process.

### **Process Management and Life Cycle**

- **Process Management**:
  - OS manages processes through creation, scheduling, and termination.
  - It allocates resources, monitors process execution, and enforces priorities.

- **Process Life Cycle**:
  - **New**: Process is created.
  - **Ready**: Process is waiting to be assigned to the CPU.
  - **Running**: Process is currently being executed by the CPU.
  - **Waiting/Blocked**: Process is waiting for some event (e.g., I/O completion).
  - **Terminated**: Process has finished execution.
  - **Suspended**: Process is temporarily halted, possibly swapped to disk.
<img width="1145" height="418" alt="image" src="https://github.com/user-attachments/assets/dfddb918-e13b-4e55-b20a-0fe7e61d0141" />

### **Schedulers**

- **Short-Term Scheduler**:
  - Also known as CPU scheduler; selects which process in the ready queue should be executed next.
  - **Frequency**: Executes frequently (milliseconds).
  - **Example**: A process in a time-sharing system being selected for execution.

- **Medium-Term Scheduler**:
  - Manages processes that are in the suspended state, deciding when to bring them back into memory and into the ready state.
  - **Example**: Swapping out a process when memory is low and bringing it back when resources are available.

- **Long-Term Scheduler**:
  - Also known as job scheduler; decides which processes should be brought into the ready queue from the job pool.
  - **Frequency**: Executes less frequently (seconds or minutes).
  - **Example**: Deciding which batch jobs should be brought into the system for processing.
<img width="993" height="353" alt="image" src="https://github.com/user-attachments/assets/9f3d6c10-10aa-4563-83f3-97ad71e52526" />

### **Process Scheduling Algorithms**
<img width="1113" height="437" alt="image" src="https://github.com/user-attachments/assets/1c32b7ed-3ef9-4c2c-8648-e59e59775bb1" />

- **First-Come, First-Served (FCFS)**:
  - Processes are executed in the order they arrive in the ready queue.
  - **Example**: Jobs at a print queue being printed in the order they are submitted.
  - **Turnaround Time Calculation**:
    - Process arrival times: P1=0, P2=2, P3=4
    - Burst times: P1=4, P2=3, P3=2
    - Turnaround Time: P1=4, P2=7, P3=9
    - Average Turnaround Time = (4+7+9)/3 = 6.67 units
<img width="1135" height="475" alt="image" src="https://github.com/user-attachments/assets/9941a6f6-d70b-49fe-8581-e18736e4d7eb" />

- **Shortest Job First (SJF)**:
  - Process with the shortest burst time is executed first.
  - **Example**: Short jobs like printing a small document are prioritized over longer tasks.
  - **Turnaround Time Calculation**:
    - Burst times: P1=2, P2=4, P3=1
    - Turnaround Time: P3=1, P1=3, P2=7
    - Average Turnaround Time = (1+3+7)/3 = 3.67 units

- **Priority Scheduling**:
  - Each process is assigned a priority; the process with the highest priority is executed first.
  - **Example**: Real-time systems where certain tasks (e.g., emergency alerts) are given higher priority.
  - **Turnaround Time Calculation**:
    - Priorities: P1=2, P2=1, P3=3 (lower number means higher priority)
    - Turnaround Time: P2=4, P1=6, P3=8
    - Average Turnaround Time = (4+6+8)/3 = 6 units

- **Round Robin (RR)**:
  - Each process is given a fixed time slice (quantum); processes are cycled through the ready queue.
  - **Example**: Time-sharing systems where each user gets an equal share of CPU time.
  - **Turnaround Time Calculation**:
    - Time Quantum: 2 units
    - Burst times: P1=5, P2=4, P3=3
    - Turnaround Time: P1=9, P2=7, P3=6
    - Average Turnaround Time = (9+7+6)/3 = 7.33 units

- **Multilevel Queue Scheduling**:
  - Processes are divided into different queues based on priority or type, and each queue may use different scheduling algorithms.
  - **Example**: System processes in one queue with RR, user processes in another with FCFS.

- **Belady's Anomaly**:
  - In the context of page replacement algorithms, it refers to the counterintuitive situation where increasing the number of page frames results in more page faults.
  - **Example**: In FIFO page replacement, adding more memory might lead to an increase in page faults.

### **Process Creation and Management**

- **Process Creation using fork()**:
  - `fork()`: System call that creates a new process (child process) that is a copy of the parent process.
  - **Example**:
    ```c
    pid_t pid = fork();
    if (pid == 0) {
        // Child process
        printf("Child process\n");
    } else {
        // Parent process
        printf("Parent process\n");
    }
    ```

- **waitpid() System Call**:
  - `waitpid()`: Parent process waits for the child process to terminate, retrieving its exit status.
  - **Example**: 
    ```c
    pid_t pid = fork();
    if (pid > 0) {
        waitpid(pid, NULL, 0);
        printf("Child terminated\n");
    }
    ```

- **exec() System Call**:
  - `exec()`: Replaces the current process image with a new process image.
  - **Example**:
    ```c
    execl("/bin/ls", "ls", NULL);
    ```
  - **Parent and Child Processes**:
    - Parent: The original process that creates a child process.
    - Child: The new process created by the parent, which can run concurrently with the parent.

- **Orphan and Zombie Processes**:
  - **Orphan Process**:
    - A process whose parent has terminated, leaving it to be adopted by the init process.
    - **Example**: A child process still running after its parent process has completed.
  - **Zombie Process**:
    - A process that has completed execution but still has an entry in the process table, typically because its parent hasn’t yet read its exit status.
    - **Example**: A child process that has finished execution, but the parent hasn’t called `wait()` or `waitpid()` to clean it up.

---
# Shell Scripting

### **Shell Programming**

#### **Decision Loops**

- **`if-else` Statement**:
  - **Syntax**:
    ```bash
    if [ condition ]
    then
        # Code to execute if condition is true
    else
        # Code to execute if condition is false
    fi
    ```
  - **Example**:
    ```bash
    #!/bin/bash
    read -p "Enter a number: " num
    if [ $num -gt 10 ]; then
        echo "Number is greater than 10"
    else
        echo "Number is 10 or less"
    fi
    ```

- **`test` Command**:
  - Used within `if` statements to evaluate expressions.
  - **Common Expressions**:
    - **File Checks**:
      - `-e file`: True if the file exists.
      - `-f file`: True if the file exists and is a regular file.
      - `-d dir`: True if the directory exists.
    - **String Comparisons**:
      - `=`, `!=`: Equal, not equal.
      - `-z string`: True if the string is empty.
    - **Numeric Comparisons**:
      - `-eq`, `-ne`, `-gt`, `-lt`, `-ge`, `-le`: Equal, not equal, greater than, less than, etc.
  - **Example**:
    ```bash
    if test -f "/etc/passwd"; then
        echo "The file exists."
    fi
    ```

- **Nested `if-else`**:
  - **Syntax**:
    ```bash
    if [ condition1 ]; then
        if [ condition2 ]; then
            # Code if both conditions are true
        else
            # Code if condition1 is true and condition2 is false
        fi
    else
        # Code if condition1 is false
    fi
    ```
  - **Example**:
    ```bash
    read -p "Enter your age: " age
    if [ $age -ge 18 ]; then
        if [ $age -le 65 ]; then
            echo "You are eligible to work."
        else
            echo "You are retired."
        fi
    else
        echo "You are too young to work."
    fi
    ```

- **`case` Control**:
  - **Syntax**:
    ```bash
    case $variable in
        pattern1)
            # Code to execute if variable matches pattern1
            ;;
        pattern2)
            # Code to execute if variable matches pattern2
            ;;
        *)
            # Default code if no patterns match
            ;;
    esac
    ```
  - **Example**:
    ```bash
    read -p "Enter a number between 1 and 3: " num
    case $num in
        1)
            echo "You chose one."
            ;;
        2)
            echo "You chose two."
            ;;
        3)
            echo "You chose three."
            ;;
        *)
            echo "Invalid choice."
            ;;
    esac
    ```

- **`while` Loop**:
  - **Syntax**:
    ```bash
    while [ condition ]
    do
        # Code to execute while condition is true
    done
    ```
  - **Example**:
    ```bash
    count=1
    while [ $count -le 5 ]; do
        echo "Count is $count"
        ((count++))
    done
    ```

- **`until` Loop**:
  - **Syntax**:
    ```bash
    until [ condition ]
    do
        # Code to execute until condition is true
    done
    ```
  - **Example**:
    ```bash
    count=1
    until [ $count -gt 5 ]; do
        echo "Count is $count"
        ((count++))
    done
    ```

- **`for` Loop**:
  - **Syntax**:
    ```bash
    for variable in list
    do
        # Code to execute for each item in list
    done
    ```
  - **Example**:
    ```bash
    for i in 1 2 3 4 5
    do
        echo "Number: $i"
    done
    ```

#### **Regular Expressions**

- **Definition**:
  - A pattern used to match strings within text.
  - Commonly used with tools like `grep`, `sed`, and `awk`.
  
- **Basic Regex Syntax**:
  - `.`: Matches any single character.
  - `*`: Matches zero or more of the preceding character.
  - `^`: Matches the start of a line.
  - `$`: Matches the end of a line.
  - `[abc]`: Matches any one of the enclosed characters.
  - `[^abc]`: Matches any character not in the brackets.
  - `\`: Escape character to match special characters literally.
  
- **Example**:
  ```bash
  # Find lines starting with 'hello'
  grep "^hello" file.txt
  
  # Find lines ending with 'world'
  grep "world$" file.txt
  
  # Find lines with exactly 3 digits
  grep "^[0-9]\{3\}$" file.txt
  ```

#### **Arithmetic Expressions**

- **Syntax**:
  - Arithmetic operations in shell scripting can be performed using the `expr` command, `(( ))` for integer arithmetic, or `$(( ))` for arithmetic expansion.
  
- **Basic Operators**:
  - `+`, `-`, `*`, `/`, `%`: Addition, subtraction, multiplication, division, modulus.
  - `**`: Exponentiation (supported in some shells like `bash`).
  
- **Examples**:
  ```bash
  # Using expr
  result=$(expr 5 + 3)
  echo "Result: $result"
  
  # Using arithmetic expansion
  result=$((5 + 3))
  echo "Result: $result"
  
  # Using double parentheses
  ((sum = 5 + 3))
  echo "Sum: $sum"
  ```

#### **More Examples in Shell Programming**

- **Simple Calculator**:
  ```bash
  #!/bin/bash
  echo "Enter first number: "
  read a
  echo "Enter second number: "
  read b
  echo "Enter operation (+, -, *, /): "
  read op
  
  case $op in
      +) result=$((a + b)) ;;
      -) result=$((a - b)) ;;
      \*) result=$((a * b)) ;;
      /) result=$((a / b)) ;;
      *) echo "Invalid operation" ;;
  esac
  
  echo "Result: $result"
  ```

- **Check if a File Exists**:
  ```bash
  #!/bin/bash
  read -p "Enter a filename: " filename
  if [ -e $filename ]; then
      echo "File exists."
  else
      echo "File does not exist."
  fi
  ```

- **Loop through Files in a Directory**:
  ```bash
  #!/bin/bash
  for file in /path/to/directory/*
  do
      echo "Processing $file"
      # Perform some action with $file
  done
  ```

- **Backup Script**:
  ```bash
  #!/bin/bash
  src_dir="/home/user/documents"
  backup_dir="/home/user/backup"
  
  date=$(date +%Y%m%d)
  backup_file="backup_$date.tar.gz"
  
  tar -czf $backup_dir/$backup_file $src_dir
  
  echo "Backup completed. File saved as $backup_dir/$backup_file"
  ```




<img width="1147" height="526" alt="image" src="https://github.com/user-attachments/assets/c70dba0c-96b9-4274-a8e0-7f600ba520b9" />
---
# Deadlock

### **Deadlocks in Operating System**

* **Definition:**

  * A **deadlock** is a situation in which **two or more processes are unable to proceed because each is waiting for resources held by the other**.
  * Essentially, **processes are stuck forever**, unable to continue execution.

* **Necessary Conditions for Deadlock (Coffman Conditions):**
  Deadlock occurs only if **all four conditions** hold simultaneously:

  1. **Mutual Exclusion:**
<img width="776" height="237" alt="image" src="https://github.com/user-attachments/assets/36fb8c93-0725-42a8-9e28-f7f0d4312f55" />

     * At least one resource must be **non-sharable** (only one process can use it at a time).
  2. **Hold and Wait:**

     * A process **holds at least one resource** and **waits for other resources** currently held by other processes.
  3. **No Preemption:**
<img width="587" height="418" alt="image" src="https://github.com/user-attachments/assets/95de245a-7a30-4568-a2e4-6f69c41149e7" />

     * Resources **cannot be forcibly taken** from a process; the process must release them voluntarily.
  4. **Circular Wait:**

     * A **closed chain** of processes exists where each process **waits for a resource held by the next process** in the chain.
<img width="1116" height="470" alt="image" src="https://github.com/user-attachments/assets/eb932bdb-9847-4278-a152-8894ab4afb45" />

* **Example:**

  * Process P1 holds Resource R1 and waits for Resource R2.
  * Process P2 holds Resource R2 and waits for Resource R1.
  * Both processes are stuck → **deadlock**.

* **Deadlock Handling Strategies:**

  1. **Deadlock Prevention:**

     * Ensure at least one of the Coffman conditions cannot hold.
     * Example: **Disallow circular wait** by imposing resource hierarchy.
  2. **Deadlock Avoidance:**

     * Require processes to **declare maximum resources** in advance.
     * Use algorithms like **Banker’s Algorithm** to ensure safe resource allocation.
  3. **Deadlock Detection and Recovery:**

     * Allow deadlock to occur, **detect it**, and recover:

       * Terminate one or more processes.
       * Preempt resources from some processes.
  4. **Ignoring Deadlocks:**

     * Also called the **ostrich approach**; suitable when deadlocks are rare.

* **Methods of Deadlock Detection:**

  * **Resource Allocation Graph (RAG):** Detect cycles in the graph.
  * **Detection Algorithm:** Keep track of resources and processes; check if any process is indefinitely waiting.

### **Banker’s Algorithm**

* **Definition:**

  * The **Banker’s Algorithm** is a **deadlock avoidance algorithm**.
  * Named after the banking system analogy: a banker **only grants resources if it is safe** to do so, ensuring that all processes can complete eventually.
  * Works by **checking system safety** before allocating resources.

* **Purpose:**

  * To **avoid deadlocks** by ensuring that the system **never enters an unsafe state**.
  * Guarantees that **resources are allocated only if the system remains in a safe state**.

* **Key Concepts:**

  1. **Safe State:**

     * A state is **safe** if there exists a sequence of processes such that **all can complete without causing deadlock**.
  2. **Unsafe State:**

     * A state is **unsafe** if there is **no guarantee that all processes can complete**, even if resources are currently available.

* **Data Structures Used:**

  * **Available:** Vector showing the number of **available instances of each resource type**.
  * **Max:** Matrix showing the **maximum demand of each process** for each resource type.
  * **Allocation:** Matrix showing **current resources allocated** to each process.
  * **Need:** Matrix showing **remaining resources needed** by each process to complete:

    $$
    \text{Need[i][j]} = \text{Max[i][j]} - \text{Allocation[i][j]}
    $$

* **Algorithm Steps (Safety Check):**

  1. Let **Work = Available**, **Finish\[i] = false** for all processes.
  2. Find a process `P[i]` such that:

     $$
     \text{Need[i]} \leq \text{Work} \quad \text{and} \quad \text{Finish[i]} = false
     $$
  3. If such a process is found:

     * Pretend to allocate resources to `P[i]` and let it finish.
     * Update:

       $$
       Work = Work + Allocation[i]
       $$

       $$
       Finish[i] = true
       $$
     * Repeat step 2.
  4. If no such process exists and all Finish\[i] = true → **Safe state**.
  5. Otherwise → **Unsafe state**, do **not allocate resources**.

* **Example:**

  | Process | Max | Allocation | Need |
  | ------- | --- | ---------- | ---- |
  | P0      | 7   | 0          | 7    |
  | P1      | 5   | 1          | 4    |
  | P2      | 3   | 1          | 2    |

  * If Available = 3, check if resources can be safely allocated.
  * Use **Need ≤ Available** to find safe sequence.
  * Only allocate if the system stays in **safe state**.

* **Advantages:**

  * **Avoids deadlocks proactively**.
  * Allows **concurrent execution** of processes safely.

* **Disadvantages:**

  * Requires **processes to declare maximum resource need in advance**.
  * **Overhead** of checking system safety for every request.
  * Not practical for all systems, especially **dynamic processes** with unknown maximum needs.


---



### **Dining Philosophers Problem**

* **Definition:**

  * The **Dining Philosophers Problem** is a **classic synchronization problem** in operating systems.
  * It illustrates problems like **deadlock, starvation, and resource sharing** among concurrent processes.

* **Problem Statement:**

  * Imagine **five philosophers** sitting around a circular table.
  * **Each philosopher alternates** between **thinking** and **eating**.
  * There is **one fork between each pair of philosophers** (so 5 forks in total).
  * To **eat**, a philosopher needs **both the left and right forks**.
  * Only **one philosopher can pick up a fork at a time** (mutual exclusion).

* **Key Constraints / Issues:**

  1. **Mutual Exclusion:** Only one philosopher can use a fork at a time.
  2. **Deadlock:** If every philosopher picks up their **left fork simultaneously**, all will wait for the **right fork** → no one eats.
  3. **Starvation:** Some philosophers may **wait indefinitely** if others keep eating.
  4. **Concurrency Problem:** Requires proper **synchronization** to avoid conflicts.

* **Goals / Requirements:**

  * **Prevent deadlock.**
  * **Prevent starvation.**
  * Ensure **all philosophers get a chance to eat** eventually.

* **Solutions / Approaches:**

  1. **Resource Hierarchy (Numbering Forks):**

     * Number the forks 1 to 5.
     * Always pick up the **lower-numbered fork first**, then the higher-numbered fork.
     * Prevents **circular wait** → **avoids deadlock**.

  2. **Arbitrator (Waiter) Solution:**

     * Introduce a **waiter** (semaphore) who **grants permission to pick up forks**.
     * Philosophers can **eat only if both forks are available**.

  3. **Semaphore Solution (Chandy/Misra Algorithm):**

     * Use **binary semaphores** for each fork.
     * Implement **P (wait) and V (signal) operations** to ensure **mutual exclusion**.

  4. **Limit Philosophers:**

     * Allow **only 4 out of 5 philosophers to pick up forks** at a time.
     * Ensures at least **one philosopher can always eat**, preventing deadlock.

* **Real-world Analogy:**

  * Multiple processes sharing **limited resources** (printers, CPU cores, memory).
  * Helps in understanding **deadlocks and synchronization in operating systems**.

---



### **Thread in Operating System**

* **Definition:**

  * A **thread** is the **smallest unit of execution** within a process.
  * Sometimes called a **lightweight process (LWP)** because it shares resources of its parent process.

* **Key Concept:**

  * A process can have **multiple threads** executing concurrently.
  * Threads within the same process **share code, data, and resources**, but have their **own program counter, stack, and registers**.
<img width="1461" height="1085" alt="image" src="https://github.com/user-attachments/assets/fddba2a5-fb5a-493e-b1ba-c34020b2839d" />

* **Components of a Thread:**

  * **Thread ID:** Unique identifier for the thread.
  * **Program Counter (PC):** Indicates the current execution point.
  * **Registers:** Store the current working variables.
  * **Stack:** Each thread has its own stack for function calls, local variables, etc.

* **Types of Threads:**

  * **User-level threads (ULT):** Managed by user-level libraries; OS unaware.
  * **Kernel-level threads (KLT):** Managed by the OS; can be scheduled independently.
  * **Hybrid Threads:** Combination of ULT and KLT (e.g., many-to-many model).
    
<img width="1488" height="1077" alt="image" src="https://github.com/user-attachments/assets/a9f81b07-15ad-44c1-9061-4b9883e8bc57" />
<img width="1463" height="1079" alt="image" src="https://github.com/user-attachments/assets/839bd3d2-701b-4161-bd05-5c354c6e53cd" />
<img width="1459" height="1087" alt="image" src="https://github.com/user-attachments/assets/7d61dcce-e164-4480-81b3-72d238e27129" />

* **Advantages of Threads:**

  * **Faster context switching** than processes.
  * **Efficient CPU utilization** (concurrent execution).
  * **Shared memory** simplifies communication between threads.
  * **Better resource management** because threads of the same process share resources.

* **Disadvantages / Challenges:**

  * **Synchronization issues** (race conditions, deadlocks).
  * **Complex debugging** due to concurrent execution.
  * If one thread fails, it may **affect other threads** in the same process.

* **Thread Operations:**

  * **Creation:** Start a new thread.
  * **Termination:** End a thread’s execution.
  * **Synchronization:** Use mutex, semaphores, or monitors.
  * **Scheduling:** Threads are scheduled by the OS or thread library.

* **Examples of Thread Usage:**

  * Web server handling multiple requests simultaneously.
  * GUI applications: one thread for UI, another for background tasks.
  * Parallel computation in scientific applications.

* **Difference between Process and Thread:**

| Feature           | Process              | Thread                           |
| ----------------- | -------------------- | -------------------------------- |
| Resource Sharing  | Has own memory space | Shares memory with other threads |
| Context Switch    | Slower               | Faster                           |
| Creation Overhead | Higher               | Lower                            |
| Execution         | Independent          | Part of process execution        |

---

# Memory Management
### **Memory Management**

- **Memory Types**:
  - **Primary Memory** (RAM):
    - Fast, volatile memory used by the CPU to store data and instructions currently in use.
    - **Example**: Programs running on your computer are stored in RAM.
  - **Secondary Memory** (HDD/SSD):
    - Non-volatile memory used for long-term storage of data and programs.
    - **Example**: Files saved on your hard drive or solid-state drive.
  - **Cache Memory**:
    - Small, high-speed memory located close to the CPU, used to temporarily hold frequently accessed data.
    - **Example**: CPU cache that stores recently used instructions.
  - **Virtual Memory**:
    - A technique that extends the available memory by using disk space to simulate additional RAM.
    - **Example**: When running out of physical RAM, the system uses a swap file on the disk.
<img width="1187" height="517" alt="image" src="https://github.com/user-attachments/assets/7b6a406a-45ea-446c-8989-ce8f9c99cec6" />

- **Need for Memory Management**:
  - Efficiently manages the limited memory resources, ensuring that multiple processes can run simultaneously without interference.
  - Allocates memory to processes, keeps track of memory usage, and frees memory when it is no longer needed.
  - Prevents issues like fragmentation, ensures security by isolating process memory, and optimizes system performance.

### **Continuous and Dynamic Allocation**
<img width="962" height="467" alt="image" src="https://github.com/user-attachments/assets/f04c8c5e-d38c-4859-a259-ab6c3cf311c6" />

- **Continuous Allocation**:
  - Memory is allocated in contiguous blocks.
  - **Example**: A program requiring 100 KB of memory might be allocated a single, continuous block of 100 KB.
  - **Limitation**: Can lead to fragmentation and inefficient use of memory.

- **Dynamic Allocation**:
  - Memory is allocated dynamically as needed, possibly in non-contiguous blocks.
  - **Example**: A program might allocate memory in chunks at runtime, such as dynamic arrays in C (`malloc()`).

### **Memory Allocation Strategies**

- **First Fit**:
  - Allocates the first block of memory that is large enough for the process.
  - **Example**: If blocks of 10 KB, 20 KB, and 30 KB are available, and a process needs 15 KB, the 20 KB block is chosen.

- **Best Fit**:
  - Allocates the smallest block of memory that is large enough to satisfy the process's requirements.
  - **Example**: If blocks of 10 KB, 20 KB, and 30 KB are available, and a process needs 15 KB, no fit is found unless there's a 15 KB block exactly.

- **Worst Fit**:
  - Allocates the largest available block of memory, leaving the largest leftover portion.
  - **Example**: If blocks of 10 KB, 20 KB, and 30 KB are available, and a process needs 15 KB, the 30 KB block is chosen, leaving 15 KB.

### **Compaction**

- **Definition**:
  - A technique used to reduce fragmentation by shifting processes in memory to create a large contiguous block of free space.
  - **Example**: After several allocations and deallocations, memory might be scattered with free and used blocks; compaction rearranges memory to consolidate free space.

### **Fragmentation**
<img width="1175" height="486" alt="image" src="https://github.com/user-attachments/assets/b28d20fa-81e6-415d-9e62-c0314516f698" />

- **Internal Fragmentation**:
  - Occurs when allocated memory is slightly larger than the requested memory, leaving small, unusable gaps.
  - **Example**: Allocating 20 KB to a process that only needs 18 KB leaves 2 KB of internal fragmentation.

- **External Fragmentation**:
  - Occurs when there is enough total free memory, but it is not contiguous, preventing allocation to processes that require a large contiguous block.
  - **Example**: Free memory scattered in small blocks across the system, preventing the allocation of a large block to a new process.

### **Segmentation**

- **What is Segmentation**:
  - A memory management technique that divides the process memory into segments based on logical divisions such as functions, data, or stack.
  - **Example**: A program might have a code segment, data segment, and stack segment.

- **Hardware Requirement for Segmentation**:
  - **Segment Table**:
    - Stores the base address and limit (length) of each segment.
  - **Segment Table Interpretation**:
    - Base Address: Starting address of the segment in physical memory.
    - Limit: Size of the segment.
  - **Diagram**:
    - Segment table entry:
      ```
      Segment   Base Address   Limit
        0       1000           400
        1       1400           300
        2       1700           500
      ```

### **Paging**
<img width="926" height="467" alt="image" src="https://github.com/user-attachments/assets/3312f89b-4fb0-422d-8d64-c46e63cd2a24" />

- **What is Paging**:
  - A memory management scheme that eliminates the need for contiguous allocation by dividing memory into fixed-sized pages.
  - **Example**: A process of 10 KB might be divided into 2 pages of 4 KB each, with the remaining 2 KB in a third page.

- **Hardware Required for Paging**:
  - **Page Table**:
    - Maps virtual page numbers to physical frame numbers.
  - **Translation Lookaside Buffer (TLB)**:
    - A cache used to store recent page table entries to speed up address translation.

- **Paging Table**:
  - Contains entries mapping virtual page numbers to physical frames.
  - **Diagram**:
    ```
    Virtual Page Number   Frame Number
    0                     5
    1                     9
    2                     12
    ```

### **Concept of Dirty Bit**

- **Dirty Bit**:
  - A flag used in memory management to indicate whether a page has been modified while in memory. If set, the page must be written back to disk before being replaced.
  - **Example**: If a word processor modifies a document in memory, the dirty bit for that page is set, indicating it must be saved before being removed from memory.

### **Shared Pages and Reentrant Code**

- **Shared Pages**:
  - Pages that are shared between multiple processes, often containing reentrant code.
  - **Example**: Multiple instances of a text editor sharing the same read-only code segment.

- **Reentrant Code**:
  - Code that can be safely executed by multiple processes simultaneously without interference.
  - **Example**: The text editor’s code segment can be shared because it does not modify itself.

### **Throttling**

- **Definition**:
  - Controlling the rate at which processes can access memory or other system resources to ensure system stability.
  - **Example**: Limiting the number of processes accessing the disk simultaneously to prevent I/O bottlenecks.

### **I/O Management**

- **Overview**:
  - Manages input/output operations, coordinating between the CPU, memory, and I/O devices.
  - **Components**:
    - **Device Drivers**: Software that controls specific hardware devices.
    - **I/O Scheduler**: Manages the order in which I/O operations are processed.
  - **Example**: The OS decides the order in which print jobs are sent to the printer, ensuring efficient and fair access. 

### **Diagrams**

- **Paging**:
  - Example diagram showing logical pages mapped to physical frames:
    ```
    Virtual Address       Physical Address
    +------------+       +------------+
    |  Page 0    | ----> | Frame 5     |
    +------------+       +------------+
    |  Page 1    | ----> | Frame 9     |
    +------------+       +------------+
    |  Page 2    | ----> | Frame 12    |
    +------------+       +------------+
    ```

- **Segmentation**:
  - Example diagram showing segment table mapping logical segments to physical memory:
    ```
    Segment Table
    +------------+---------------+--------+
    | Segment ID | Base Address  |  Limit |
    +------------+---------------+--------+
    |     0      |    1000       |   400  |
    |     1      |    1400       |   300  |
    |     2      |    1700       |   500  |
    +------------+---------------+--------+

    Physical Memory
    +-------------------------+
    |   Segment 0             |   Base Address: 1000
    |   (Code)                |
    +-------------------------+
    |   Segment 1             |   Base Address: 1400
    |   (Data)                |
    +-------------------------+
    |   Segment 2             |   Base Address: 1700
    |   (Stack)               |
    +-------------------------+
    ```

- **TLB in Paging**:
  - Example showing the TLB and its role in fast address translation:
    ```
    Virtual Address        TLB Lookup        Physical Address
    +-------------+       +-------------+   +-------------+
    | Page Number | ----> | Frame Number | > | Frame Number |
    +-------------+       +-------------+   +-------------+
    ```
