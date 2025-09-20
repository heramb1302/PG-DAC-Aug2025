# Arrays

## 1. **Traversal of an Array**

**Algorithm:**

```
1. Start
2. Set i = 0
3. Repeat steps 4 and 5 while i < n (number of elements)
4. Print A[i]
5. Increment i = i + 1
6. Stop
```

---

## 2. **Insertion in an Array**

**(Insert element X at position K)**

```
1. Start
2. Set i = n - 1   (last index)
3. Repeat steps 4 and 5 while i >= K
4. A[i + 1] = A[i]   (shift element right)
5. Decrement i = i - 1
6. A[K] = X          (insert element at position)
7. Increment n = n + 1
8. Stop
```

---

## 3. **Deletion from an Array**

**(Delete element from position K)**

```
1. Start
2. Set i = K
3. Repeat steps 4 and 5 while i < n - 1
4. A[i] = A[i + 1]   (shift element left)
5. Increment i = i + 1
6. Decrement n = n - 1
7. Stop
```

---

## 4. **Searching in an Array (Linear Search)**

**(Find element X in array A\[0..n-1])**

```
1. Start
2. Set i = 0
3. Repeat steps 4 and 5 while i < n
4. If A[i] == X, then print "Found at position i" and Stop
5. Increment i = i + 1
6. If i == n, print "Not Found"
7. Stop
```

---

## **Binary Search Algorithm**

**Input:** Sorted array `A[0..n-1]`, element `X` to search

**Output:** Index of `X` if found, else -1

```
1. Start
2. Set low = 0, high = n - 1
3. Repeat steps 4–7 while low <= high
4.   mid = (low + high) / 2
5.   If A[mid] == X
         Print "Found at position mid" and Stop
6.   Else If A[mid] < X
         Set low = mid + 1
7.   Else
         Set high = mid - 1
8. Print "Not Found"
9. Stop
```

---

Key Points:

* Works only on **sorted arrays**.
* Time Complexity: **O(log n)**
* Space Complexity: **O(1)**

---


## **Recursive Binary Search Algorithm**

**Input:** Sorted array `A[0..n-1]`, element `X`, low index `low`, high index `high`

**Output:** Index of `X` if found, else -1

```
1. Start
2. If low > high
       Return -1   // Element not found
3. Set mid = (low + high) / 2
4. If A[mid] == X
       Return mid   // Element found
5. Else If A[mid] > X
       Call BinarySearch(A, X, low, mid - 1)
6. Else
       Call BinarySearch(A, X, mid + 1, high)
7. Stop
```

---

⚡ **Key Points**:

* Base condition: `low > high` → element not present.
* Each recursive call reduces the search space by half.
* Time Complexity: **O(log n)**
* Space Complexity: **O(log n)** (due to recursive stack).

---



