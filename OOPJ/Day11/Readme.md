# Homework:
### Ques.1 

Create an **abstract class `Shape`** that represents different geometric shapes. This class should contain:  
1. A **protected attribute** `shapeName` to store the name of the shape.  
2. A **constructor** that initializes `shapeName`.  
3. A **method `getShapeName()`** that returns the name of the shape.  
4. An **abstract method `calculateArea()`** that will be implemented by subclasses.  

Next, create two concrete classes, **`Circle`** and **`Rectangle`**, that extend `Shape` and implement the `calculateArea()` method:  
- The `Circle` class should have a **private attribute `radius`**, a constructor to initialize it, and implement `calculateArea()` using the formula:  
  \[
  \text{Area} = \pi \times \text{radius}^2
  \]  
- The `Rectangle` class should have **private attributes `length` and `width`**, a constructor to initialize them, and implement `calculateArea()` using the formula:  
  \[
  \text{Area} = \text{length} \times \text{width}
  \]  

Finally, write a **test program** in the `main` method that:  
1. Creates an object of `Circle` with a radius of `5.0` and displays the area.  
2. Creates an object of `Rectangle` with a length of `4.0` and width of `6.0` and displays the area.  
3. Uses **polymorphism** by referring to objects of `Circle` and `Rectangle` using `Shape` references.  


Note: Implement the concepts of **abstraction, method overriding, polymorphism, and encapsulation in Java OOP concepts**.
