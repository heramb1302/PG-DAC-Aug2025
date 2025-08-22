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
