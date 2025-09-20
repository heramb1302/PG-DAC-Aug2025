# Circular Queue
---

#  1. **Traversal of a Circular Queue**

```
1. Start
2. If front == -1
       Print "Queue Empty" and Stop
3. Set i = front
4. Repeat
       Print queue[i]
       If i == rear
            Break
       i = (i + 1) % MAX
5. Stop
```

---

#  2. **Insertion (Enqueue in Circular Queue)**

```
1. Start
2. If (front == 0 AND rear == MAX-1) OR (front == (rear+1) % MAX)
       Print "Queue Overflow" and Stop
3. Else If front == -1   // first insertion
       front = 0, rear = 0
4. Else
       rear = (rear + 1) % MAX
5. queue[rear] = value
6. Stop
```

---

#  3. **Deletion (Dequeue in Circular Queue)**

```
1. Start
2. If front == -1
       Print "Queue Underflow" and Stop
3. item = queue[front]
4. If front == rear   // only one element
       front = rear = -1
5. Else
       front = (front + 1) % MAX
6. Print "Deleted item = item"
7. Stop
```

---

 **Key Points**:

* Circular queue avoids **wasted space** of linear queue.
* Indices wrap around using modulo `% MAX`.
* Overflow condition: `(front == (rear+1) % MAX)`.
* Underflow condition: `front == -1`.

---


#  Circular Queue Operations – Algorithm & Time Complexity

| **Operation**        | **Algorithm**                                                                  | **Time Complexity** |
| -------------------- | ------------------------------------------------------------------------------ | ------------------- |
| **Enqueue (Insert)** | Check overflow → update `rear = (rear + 1) % MAX` → assign `queue[rear] = val` | **O(1)**            |
| **Dequeue (Delete)** | Check underflow → return `queue[front]` → update `front = (front + 1) % MAX`   | **O(1)**            |
| **Peek/Front**       | Return `queue[front]` (without deletion)                                       | **O(1)**            |
| **Traversal**        | Start from `front`, print elements until `rear` using `(i+1) % MAX`            | **O(n)**            |
| **isEmpty**          | Check if `front == -1`                                                         | **O(1)**            |
| **isFull**           | Check if `(front == (rear+1) % MAX)`                                           | **O(1)**            |

---

 **Key Points**:

* Circular Queue uses **modulo (%)** to wrap indices.
* **Advantage over Linear Queue** → no wasted space after deletions.
* Enqueue & Dequeue remain **O(1)**, Traversal is **O(n)**.

---
