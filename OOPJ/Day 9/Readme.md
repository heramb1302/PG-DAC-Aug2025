# Homework:

Question:

In a vehicle management system, different types of vehicles share common characteristics but have unique ways of starting their engines. To enforce a structured approach, an abstract class Vehicle is required. This class should contain a protected String brand field, a constructor to initialize it, and an abstract method startEngine() to be implemented by subclasses. Additionally, it should have a concrete method displayBrand() that prints the vehicle's brand.

Two classes, Car and Bike, should inherit from Vehicle and provide their own implementation of startEngine():

The Car class should print "Car engine started with a key!" when startEngine() is called.
The Bike class should print "Bike engine started with a self-start button!" when startEngine() is called.
Write a Java program that implements the above specifications. The program should take an integer input N (1 for Car, 2 for Bike), followed by a brand name as input, and then create the appropriate object. The program should first display the brand using displayBrand() and then call startEngine() to show the respective vehicle's startup method.

Ensure proper abstraction is used, and the classes follow the object-oriented programming (OOP) principles correctly.
