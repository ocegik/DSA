# Class
# A class is a blueprint or template used to create objects.
# It defines the properties and methods that objects will have.

class Student:
    def study(self):
        print("Student is Studying.")


# Object
# An object is an instance of a class.
# Objects are created using the class name followed by parentheses.

s = student()
s.study()

# A constructor is a special method that is executed automatically when an object is created.
# In Python, the constructor is named __init__.

# self
# self represents the current object of the class.

class Demo:
    def show(self):
        print("Hello")

d = Demo()
d.show()

# Constructor (__init__ Method)

# A constructor is a special method that is executed automatically when an object is created.
# In Python, the constructor is named __init__.

# Purpose
# Initialize instance variables

# Allocate resources

class Teacher:
    def __init__(self, name, age):
        self.name = name
        self.age = age

s = Teacher("Tarun", 20)
print(s.name, s.age)

# Instance Variables

# Instance variables are variables unique to each object.
# They are defined using self.

class Car:
    def __init__(self, brand):
        self.brand = brand

c1 = Car("BMW")
c2 = Car("Audi")


# Instance Methods

# Instance methods operate on instance variables and use self.

class Person:
    def greet(self):
        print("Hello")

p = Person()
p.greet()

# Class Variables

# Class variables are shared by all objects of the class.
# They are defined outside methods.

class Car:
    wheels = 4

print(Car.wheels)

c = Car()
print(c.wheels)





