# OOP-Lab-5

## School simulation 4.0

My school simulation hierarchy has root superclass "Entity", which has attribute ID and method exist(). The concrete classes School,Subject List,Room and the abstract class Person inherit superclass Entity,each with their own attributes and methods. Next there are subclasses Staff, Student and Parent of abstract class Person,which inherit the attribute name and method doSomething(). Classes Teacher, Adjunct and AuxiliaryWorker inherit class Staff. Class School has an inner class Location. The class Subject List has subclass Curriculum and class Room has subclasses Classroom, Canteen and Sports Hall,which all inherit from Room.

![alt text](https://github.com/buffaloss/OOP-Lab-4/blob/main/Lab4%20Diagram.png?raw=true)
