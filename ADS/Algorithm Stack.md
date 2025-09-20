# Stack

#  1. **Traversal of a Stack (Display elements)**

*(Assume stack implemented with array and `top` is index of last element)*

```
1. Start
2. If top == -1
       Print "Stack Empty" and Stop
3. Set i = top
4. Repeat steps 5–6 while i >= 0
5.   Print stack[i]
6.   Decrement i = i - 1
7. Stop
```

# Traversal is **from top to bottom**.

---

#  2. **Insertion (Push operation)**

```
1. Start
2. If top == MAX-1
       Print "Stack Overflow" and Stop
3. Else
       top = top + 1
       stack[top] = value
4. Stop
```

---

#  3. **Deletion (Pop operation)**

```
1. Start
2. If top == -1
       Print "Stack Underflow" and Stop
3. Else
       item = stack[top]
       top = top - 1
       Print "Deleted item = item"
4. Stop
```

---

**Key Pointer**:

* Stack follows **LIFO (Last In, First Out)**.
* Push → Insert at top.
* Pop → Remove from top.
* Traversal → Print from `top` down to `0`.


---

#  Stack Operations – Algorithm & Time Complexity

| **Operation**     | **Algorithm**                                | **Time Complexity** |
| ----------------- | -------------------------------------------- | ------------------- |
| **Push (Insert)** | Increment `top`, assign `stack[top] = value` | **O(1)**            |
| **Pop (Delete)**  | Return `stack[top]`, decrement `top`         | **O(1)**            |
| **Peek/Top**      | Return `stack[top]` (without deletion)       | **O(1)**            |
| **Traversal**     | Loop from `top` to `0`, print elements       | **O(n)**            |
| **isEmpty**       | Check if `top == -1`                         | **O(1)**            |
| **isFull**        | Check if `top == MAX-1`                      | **O(1)**            |

---

 **Key Pointer**:

* Stack is a **LIFO structure** (Last In, First Out).
* All major operations (Push, Pop, Peek) are **constant time O(1)**.
* Traversal is **linear O(n)** since all elements must be visited.

---

