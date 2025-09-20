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


