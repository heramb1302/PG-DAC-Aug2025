# Tree

# Node model (for reference)

```
Node:
  data
  left  -> Node or NULL
  right -> Node or NULL
```

---

# 1) Depth-First Traversals (Recursive)

## a) Preorder (Root, Left, Right)

```
Preorder(root):
1. If root == NULL → return
2. Visit root.data
3. Preorder(root.left)
4. Preorder(root.right)
```

## b) Inorder (Left, Root, Right)

```
Inorder(root):
1. If root == NULL → return
2. Inorder(root.left)
3. Visit root.data
4. Inorder(root.right)
```

## c) Postorder (Left, Right, Root)

```
Postorder(root):
1. If root == NULL → return
2. Postorder(root.left)
3. Postorder(root.right)
4. Visit root.data
```

---

# 2) Breadth-First Traversal (Level Order) using Queue

```
LevelOrder(root):
1. If root == NULL → return
2. Create empty queue Q
3. Enqueue(Q, root)
4. While Q not empty
     a. node = Dequeue(Q)
     b. Visit node.data
     c. If node.left  != NULL → Enqueue(Q, node.left)
     d. If node.right != NULL → Enqueue(Q, node.right)
```

---

# 3) Binary Search Tree (BST) – Search

```
BST_Search(root, key):
1. If root == NULL → return NOT FOUND
2. If key == root.data → return FOUND
3. If key < root.data → return BST_Search(root.left, key)
4. Else → return BST_Search(root.right, key)
```

---

# 4) BST – Insert

```
BST_Insert(root, key):
1. If root == NULL
     a. Create node with data=key
     b. return node
2. If key < root.data
     root.left  = BST_Insert(root.left, key)
3. Else if key > root.data
     root.right = BST_Insert(root.right, key)
4. (If duplicates not allowed, do nothing on equal)
5. return root
```

---

# 5) BST – Delete (0/1/2 children; use inorder successor)

```
BST_Delete(root, key):
1. If root == NULL → return NULL
2. If key < root.data → root.left  = BST_Delete(root.left, key)
3. Else if key > root.data → root.right = BST_Delete(root.right, key)
4. Else  // key == root.data → delete this node
     a. If root.left == NULL AND root.right == NULL
           return NULL
     b. Else if root.left == NULL
           return root.right
     c. Else if root.right == NULL
           return root.left
     d. Else  // two children
           i.   succ = MinNode(root.right)   // leftmost of right subtree
           ii.  root.data = succ.data
           iii. root.right = BST_Delete(root.right, succ.data)
5. return root

MinNode(node):
1. while node.left != NULL → node = node.left
2. return node
```

---

# 6) Height / Depth of Tree

*(Height of empty tree = −1 or 0, pick convention; here we use −1 so leaf height = 0)*

```
Height(root):
1. If root == NULL → return -1
2. leftH  = Height(root.left)
3. rightH = Height(root.right)
4. return 1 + max(leftH, rightH)
```

---

# 7) Count Nodes / Leaves

```
CountNodes(root):
1. If root == NULL → return 0
2. return 1 + CountNodes(root.left) + CountNodes(root.right)

CountLeaves(root):
1. If root == NULL → return 0
2. If root.left == NULL AND root.right == NULL → return 1
3. return CountLeaves(root.left) + CountLeaves(root.right)
```

---

# 8) Mirror / Invert Tree

```
Invert(root):
1. If root == NULL → return
2. Swap(root.left, root.right)
3. Invert(root.left)
4. Invert(root.right)
```

---

# 9) Check if a Tree is a BST (range method)

```
IsBST(root):
  return IsBSTUtil(root, -∞, +∞)

IsBSTUtil(node, low, high):
1. If node == NULL → return TRUE
2. If node.data ≤ low OR node.data ≥ high → return FALSE
3. return IsBSTUtil(node.left,  low,  node.data) AND
         IsBSTUtil(node.right, node.data, high)
```

---

# 10) Lowest Common Ancestor (LCA) in BST

```
BST_LCA(root, a, b):  // assume a ≤ b
1. If root == NULL → return NULL
2. If b < root.data → return BST_LCA(root.left, a, b)
3. If a > root.data → return BST_LCA(root.right, a, b)
4. Else → return root  // a ≤ root.data ≤ b
```

---

# 11) Build Tree from Inorder + Preorder (outline)

```
Build(inorder, preorder):
1. If either list empty → return NULL
2. rootVal = preorder[0]
3. Find rootVal index k in inorder
4. LeftIn  = inorder[0..k-1],  RightIn  = inorder[k+1..end]
5. LeftPre = preorder[1..k],   RightPre = preorder[k+1..end]
6. root = new Node(rootVal)
7. root.left  = Build(LeftIn,  LeftPre)
8. root.right = Build(RightIn, RightPre)
9. return root
```

---

# 12) Level-Order by Levels (with sentinel count)

```
LevelOrderLevels(root):
1. If root == NULL → return
2. Create queue Q; Enqueue(Q, root)
3. While Q not empty
     a. levelCount = size(Q)
     b. Repeat levelCount times
          i.  node = Dequeue(Q)
          ii. Visit node.data
          iii.If node.left  != NULL → Enqueue(Q, node.left)
          iv. If node.right != NULL → Enqueue(Q, node.right)
     c. // end of one level
```

---


#  Binary Tree & BST Operations – Algorithm & Time Complexity

| **Operation**                              | **Algorithm**                                 | **Time Complexity**                          |
| ------------------------------------------ | --------------------------------------------- | -------------------------------------------- |
| **Traversal (Inorder/Preorder/Postorder)** | DFS recursive or stack-based                  | **O(n)**                                     |
| **Traversal (Level-order)**                | BFS using queue                               | **O(n)**                                     |
| **Search (BST)**                           | Compare key, go left/right                    | **O(h)** → worst **O(n)**, best **O(log n)** |
| **Insert (BST)**                           | Traverse down, place new node                 | **O(h)**                                     |
| **Delete (BST)**                           | Handle 0, 1, 2 children; replace by successor | **O(h)**                                     |
| **Find Min / Max (BST)**                   | Leftmost or rightmost traversal               | **O(h)**                                     |
| **Find Height**                            | Recursively max(left, right) + 1              | **O(n)**                                     |
| **Count Nodes**                            | Recursively add 1 + left + right              | **O(n)**                                     |
| **Count Leaves**                           | Recursively check nodes with no children      | **O(n)**                                     |
| **Mirror / Invert Tree**                   | Swap left/right recursively                   | **O(n)**                                     |
| **Check if BST**                           | Range method (min ≤ node ≤ max)               | **O(n)**                                     |
| **Lowest Common Ancestor (BST)**           | Traverse left/right until split point         | **O(h)**                                     |
| **Build Tree (Inorder + Preorder)**        | Recursive splitting using index lookups       | **O(n²)** naive, **O(n)** with hashmap       |
| **Level-order by Levels**                  | BFS with queue + level count                  | **O(n)**                                     |

---

 **Key Pointer**:

* `n` = number of nodes, `h` = height of tree.
* For balanced BST (like AVL, Red-Black), `h = O(log n)`.
* For skewed BST, `h = O(n)`.
* Traversal always touches every node → **O(n)**.

---
