# Doubly Linked List

#  1. Traversal in Doubly Linked List

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. Set ptr = head
4. Repeat steps 5–6 while ptr != NULL
5.   Print ptr->data
6.   Move ptr = ptr->next
7. Stop
```

---

#  2. Insertion Operations

### a) Insertion at Beginning

```
1. Start
2. Create newNode
3. Set newNode->data = value
4. Set newNode->prev = NULL
5. Set newNode->next = head
6. If head != NULL
       head->prev = newNode
7. Set head = newNode
8. Stop
```

---

### b) Insertion in Between (after a given position pos)

```
1. Start
2. Create newNode
3. Set newNode->data = value
4. Set ptr = head, i = 0
5. Repeat steps 6–7 while i < pos - 1
6.   ptr = ptr->next
7.   Increment i
8. Set newNode->next = ptr->next
9. Set newNode->prev = ptr
10. If ptr->next != NULL
        ptr->next->prev = newNode
11. Set ptr->next = newNode
12. Stop
```

---

### c) Insertion at End

```
1. Start
2. Create newNode
3. Set newNode->data = value
4. Set newNode->next = NULL
5. If head == NULL
       newNode->prev = NULL
       head = newNode
       Stop
6. Set ptr = head
7. Repeat while ptr->next != NULL
       ptr = ptr->next
8. Set ptr->next = newNode
9. Set newNode->prev = ptr
10. Stop
```

---

#  3. Deletion Operations

### a) Deletion at Beginning

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. Set temp = head
4. Set head = head->next
5. If head != NULL
       head->prev = NULL
6. Free temp
7. Stop
```

---

### b) Deletion in Between (at position pos)

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. Set ptr = head, i = 0
4. Repeat steps 5–6 while i < pos
5.   ptr = ptr->next
6.   Increment i
7. If ptr->prev != NULL
       ptr->prev->next = ptr->next
8. If ptr->next != NULL
       ptr->next->prev = ptr->prev
9. Free ptr
10. Stop
```

---

### c) Deletion at End

```
1. Start
2. If head == NULL
       Print "List Empty" and Stop
3. Set ptr = head
4. Repeat while ptr->next != NULL
       ptr = ptr->next
5. If ptr->prev != NULL
       ptr->prev->next = NULL
   Else
       head = NULL
6. Free ptr
7. Stop
```

---

#  Doubly Linked List Operations – Algorithm & Time Complexity

| **Operation**              | **Algorithm**                                                | **Time Complexity** |
| -------------------------- | ------------------------------------------------------------ | ------------------- |
| **Traversal**              | Start at `head`, move `ptr = ptr->next` until NULL           | **O(n)**            |
| **Insertion at Beginning** | Create new node, adjust `prev` and `next`, update `head`     | **O(1)**            |
| **Insertion at End**       | Traverse to last node, adjust pointers                       | **O(n)**            |
| **Insertion in Between**   | Traverse to (pos-1), link new node, adjust `prev/next`       | **O(n)**            |
| **Deletion at Beginning**  | Update `head = head->next`, set `head->prev = NULL`          | **O(1)**            |
| **Deletion at End**        | Traverse to last node, unlink it, update `prev->next = NULL` | **O(n)**            |
| **Deletion in Between**    | Traverse to node, update `prev->next` and `next->prev`       | **O(n)**            |
| **Search (Linear)**        | Traverse nodes, compare data                                 | **O(n)**            |
| **Count Nodes**            | Traverse list, increment counter                             | **O(n)**            |

---

 **Key Pointer**:

* DLL supports **bi-directional traversal** (forward & backward).
* Insertion/Deletion at **beginning** is **O(1)** (constant time).
* All operations involving traversal (end, between, search, count) are **O(n)**.

