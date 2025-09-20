# LinkedList


# 1. **Traversal in Singly Linked List**

**Algorithm:**

```
1. Start
2. Set ptr = head
3. Repeat steps 4 and 5 while ptr != NULL
4.   Print ptr->data
5.   Move ptr = ptr->next
6. Stop
```

---

# 2. **Insertion Operations**

### a) Insertion at the Beginning

```
1. Start
2. Create a new node (newNode)
3. Set newNode->data = value
4. Set newNode->next = head
5. Set head = newNode
6. Stop
```

### b) Insertion in Between (after a given position `pos`)

```
1. Start
2. Create a new node (newNode)
3. Set newNode->data = value
4. Set ptr = head, i = 0
5. Repeat steps 6 and 7 while i < pos - 1
6.   Move ptr = ptr->next
7.   Increment i
8. Set newNode->next = ptr->next
9. Set ptr->next = newNode
10. Stop
```

### c) Insertion at the End

```
1. Start
2. Create a new node (newNode)
3. Set newNode->data = value
4. Set newNode->next = NULL
5. If head == NULL
       Set head = newNode
   Else
       Set ptr = head
       Repeat while ptr->next != NULL
            Move ptr = ptr->next
       Set ptr->next = newNode
6. Stop
```

---

# 3. **Deletion Operations**

### a) Deletion at the Beginning

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. Set temp = head
4. Set head = head->next
5. Free temp
6. Stop
```

### b) Deletion in Between (at position `pos`)

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. Set ptr = head, i = 0
4. Repeat steps 5 and 6 while i < pos - 1
5.   prev = ptr
6.   ptr = ptr->next, increment i
7. Set prev->next = ptr->next
8. Free ptr
9. Stop
```

### c) Deletion at the End

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. If head->next == NULL
       Free head, set head = NULL, Stop
4. Set ptr = head
5. Repeat while ptr->next->next != NULL
       Move ptr = ptr->next
6. Free ptr->next
7. Set ptr->next = NULL
8. Stop
```

---

# Special Questions algorithm

# 🔹 1. **Search an Element in Linked List**

```
1. Start
2. Set ptr = head
3. Repeat steps 4–6 while ptr != NULL
4.   If ptr->data == X
         Print "Element Found" and Stop
5.   Else move ptr = ptr->next
6. Print "Element Not Found"
7. Stop
```

---

# 🔹 2. **Cycle Detection (Floyd’s Cycle Detection Algorithm – Tortoise & Hare)**

```
1. Start
2. If head == NULL → return "No Cycle"
3. Set slow = head, fast = head
4. Repeat steps 5–7 while fast != NULL AND fast->next != NULL
5.   slow = slow->next
6.   fast = fast->next->next
7.   If slow == fast
         Print "Cycle Detected" and Stop
8. Print "No Cycle Found"
9. Stop
```

---

# 🔹 3. **Reverse a Linked List**

```
1. Start
2. Set prev = NULL, curr = head
3. Repeat steps 4–6 while curr != NULL
4.   nextNode = curr->next
5.   curr->next = prev
6.   prev = curr, curr = nextNode
7. Set head = prev
8. Stop
```

---

# 🔹 4. **Find the Middle of Linked List**

```
1. Start
2. If head == NULL → return "Empty List"
3. Set slow = head, fast = head
4. Repeat steps 5–6 while fast != NULL AND fast->next != NULL
5.   slow = slow->next
6.   fast = fast->next->next
7. When loop ends → slow points to middle node
8. Print slow->data
9. Stop
```

---

# 🔹 5. **Count Number of Nodes in Linked List**

```
1. Start
2. Set count = 0, ptr = head
3. Repeat steps 4–5 while ptr != NULL
4.   count = count + 1
5.   Move ptr = ptr->next
6. Print "Total Nodes = count"
7. Stop
```


---

#  Singly Linked List Operations – Algorithm & Time Complexity

| **Operation**              | **Algorithm Used**                                        | **Time Complexity** |
| -------------------------- | --------------------------------------------------------- | ------------------- |
| **Traversal**              | Start from `head`, move `ptr = ptr->next` until NULL      | **O(n)**            |
| **Insertion at Beginning** | Create new node, point newNode->next to head, update head | **O(1)**            |
| **Insertion at End**       | Traverse to last node, link new node                      | **O(n)**            |
| **Insertion in Between**   | Traverse to (pos-1), insert node, adjust links            | **O(n)**            |
| **Deletion at Beginning**  | Update head to head->next, free old node                  | **O(1)**            |
| **Deletion at End**        | Traverse to (n-1)th node, free last node                  | **O(n)**            |
| **Deletion in Between**    | Traverse to (pos-1), bypass node, free it                 | **O(n)**            |
| **Search (Linear)**        | Traverse nodes, compare data                              | **O(n)**            |
| **Cycle Detection**        | Floyd’s (Tortoise & Hare) algorithm                       | **O(n)**            |
| **Reverse Linked List**    | Iterative pointer reversal (prev, curr, next)             | **O(n)**            |
| **Find Middle Node**       | Floyd’s slow & fast pointer method                        | **O(n)**            |
| **Count Nodes**            | Traverse list, increment counter                          | **O(n)**            |

---

### **Key Pointer**:

* `O(1)` → Constant time (independent of list size).
* `O(n)` → Linear time (depends on number of nodes).
* All major linked list operations involve traversal → usually **O(n)**.

