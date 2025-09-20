# Queue

#  1. **Traversal of a Queue (Display elements)**

```
1. Start
2. If front == -1
       Print "Queue Empty" and Stop
3. Set i = front
4. Repeat steps 5–6 while i <= rear
5.   Print queue[i]
6.   Increment i = i + 1
7. Stop
```

---

#  2. **Insertion (Enqueue operation)**

```
1. Start
2. If rear == MAX-1
       Print "Queue Overflow" and Stop
3. Else If front == -1
       front = 0   // first insertion
4. Increment rear = rear + 1
5. Set queue[rear] = value
6. Stop
```

---

#  3. **Deletion (Dequeue operation)**

```
1. Start
2. If front == -1 OR front > rear
       Print "Queue Underflow" and Stop
3. Else
       item = queue[front]
       Increment front = front + 1
       Print "Deleted item = item"
4. If front > rear
       Reset front = rear = -1   // Queue becomes empty
5. Stop
```

---

 **Key Pointer**:

* Queue follows **FIFO (First In, First Out)**.
* Enqueue → Insert at **rear**.
* Dequeue → Remove from **front**.
* Traversal → Print from `front` to `rear`.

---


#  Queue Operations – Algorithm & Time Complexity

| **Operation**        | **Algorithm**                                  | **Time Complexity** |
| -------------------- | ---------------------------------------------- | ------------------- |
| **Enqueue (Insert)** | Increment `rear`, assign `queue[rear] = value` | **O(1)**            |
| **Dequeue (Delete)** | Return `queue[front]`, increment `front`       | **O(1)**            |
| **Peek/Front**       | Return `queue[front]` (without deletion)       | **O(1)**            |
| **Traversal**        | Loop from `front` to `rear`, print elements    | **O(n)**            |
| **isEmpty**          | Check if `front == -1` OR `front > rear`       | **O(1)**            |
| **isFull**           | Check if `rear == MAX-1`                       | **O(1)**            |

---

 **Key Pointer**:

* Queue is a **FIFO structure** (First In, First Out).
* Enqueue & Dequeue are always **O(1)**.
* Traversal is **O(n)** since all elements are visited.
* In array implementation, after many deletions, space is wasted → solved by **Circular Queue**.

---

