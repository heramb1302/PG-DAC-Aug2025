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
# Priority Queue

# A) Simple Priority Queue (Array/Linked List)

## 1) Unsorted Array Implementation

### Enqueue (Insert `item` with `prio`)

```
1. Start
2. If rear == MAX-1 → Print "Overflow" and Stop
3. rear = rear + 1
4. pq[rear] = (item, prio)
5. If front == -1 → front = 0
6. Stop
```

### Dequeue (Remove highest priority)

```
1. Start
2. If front == -1 → Print "Underflow" and Stop
3. Set idx = front, best = front
4. While idx ≤ rear
       If pq[idx].prio < pq[best].prio
             best = idx
       idx = idx + 1
5. item = pq[best].item
6. Shift elements left from best to rear-1: pq[k] = pq[k+1]
7. rear = rear - 1
8. If rear < front → front = rear = -1
9. Print "Deleted item = item"
10. Stop
```

### Peek (View highest priority without deleting)

```
1. Start
2. If front == -1 → Print "Empty" and Stop
3. Scan front..rear to find index best with minimum prio
4. Print pq[best].item
5. Stop
```

### Traverse

```
1. Start
2. If front == -1 → Print "Empty" and Stop
3. For i = front to rear: Print (pq[i].item, pq[i].prio)
4. Stop
```

**Complexity (Unsorted):**

* Enqueue: O(1)
* Dequeue/Peek (find best): O(n)
* Traverse: O(n)

---

## 2) Sorted (by Priority) Singly Linked List

*(Head always points to highest priority node; stable insert keeps order for equal prio)*

### Enqueue (Insert in sorted position)

```
1. Start
2. Create newNode = (item, prio)
3. If head == NULL OR prio < head->prio
       newNode->next = head
       head = newNode
       Stop
4. Set ptr = head
5. While ptr->next != NULL AND ptr->next->prio <= prio
       ptr = ptr->next
6. newNode->next = ptr->next
7. ptr->next = newNode
8. Stop
```

### Dequeue (Remove highest priority: head)

```
1. Start
2. If head == NULL → Print "Underflow" and Stop
3. temp = head
4. head = head->next
5. item = temp->item; free(temp)
6. Print "Deleted item = item"
7. Stop
```

### Peek

```
1. Start
2. If head == NULL → Print "Empty" and Stop
3. Print head->item
4. Stop
```

### Traverse

```
1. Start
2. ptr = head
3. While ptr != NULL
       Print (ptr->item, ptr->prio)
       ptr = ptr->next
4. Stop
```

**Complexity (Sorted LL):**

* Enqueue: O(n)
* Dequeue/Peek: O(1)
* Traverse: O(n)

---

# B) Efficient Priority Queue (Binary Heap)

## Min-Heap Array Representation (1-indexed for simplicity)

**Helpers**

```
PARENT(i) = i / 2
LEFT(i)   = 2 * i
RIGHT(i)  = 2 * i + 1
```

### Enqueue (Heap Insert / Up-Heapify)

```
1. Start
2. If size == MAX → Print "Overflow" and Stop
3. size = size + 1
4. i = size
5. heap[i] = (item, prio)
6. While i > 1 AND heap[PARENT(i)].prio > heap[i].prio
       Swap heap[PARENT(i)] and heap[i]
       i = PARENT(i)
7. Stop
```

### Dequeue (Extract-Min / Down-Heapify)

```
1. Start
2. If size == 0 → Print "Underflow" and Stop
3. minItem = heap[1].item
4. heap[1] = heap[size]
5. size = size - 1
6. i = 1
7. While TRUE
       l = LEFT(i), r = RIGHT(i), smallest = i
       If l ≤ size AND heap[l].prio < heap[smallest].prio → smallest = l
       If r ≤ size AND heap[r].prio < heap[smallest].prio → smallest = r
       If smallest == i → Break
       Swap heap[i] and heap[smallest]
       i = smallest
8. Print "Deleted item = minItem"
9. Stop
```

### Peek (Get-Min)

```
1. Start
2. If size == 0 → Print "Empty" and Stop
3. Print heap[1].item
4. Stop
```

### Traverse (Level-order as stored)

```
1. Start
2. If size == 0 → Print "Empty" and Stop
3. For i = 1 to size: Print (heap[i].item, heap[i].prio)
4. Stop
```

**Complexity (Heap):**

* Enqueue: O(log n)
* Dequeue (extract-min): O(log n)
* Peek: O(1)
* Traverse: O(n)

---

## Notes & Tips

* **Choose implementation by workload**:

  * Many inserts + few deletes → **Unsorted** structure is fine.
  * Many deletes/peeks of best → **Sorted LL** or **Heap**.
  * Large scale, performance-critical → **Binary Heap** (or Fibonacci heap for special cases).
* **Stability** (tie priority): keep arrival index and compare `(prio, arrival)` to maintain FIFO among equals.
* To get **max-priority** behavior, invert comparisons (use max-heap or reverse conditions).


