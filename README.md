# OOP-Lab-5

## School simulation 4.0

In this laboratory work, I focused on creating a continous simulation of a school, as well as continously outputing the changes and the actions that happen to the user.

Firstly, I created some sort of connections between my previous scenarios and how they influence my simulation. 

- **Students** have eminence, which is a value that represents their reputation, good behavior and their performace. The higher the eminence, the better the student. 

- **Teachers, nurses & cooks** have their salaries, which are constantly changing in dependence of what incidents take place and how they react to them. 

- **The school** has a reputation that is calculated from a formula, which depend son the number of incidents that have happened and on the eminence of its students.

Daily there are printed the current statistics of that day, including students' eminence, workers' salaries and reputation of the school. This way, it can be observed how the data changes throughout the simulation.

**Examples:** 
- There is a 40% chance that one of the students will listen to the teacher attentively during class and a 60% chance they will be sleeping, and then there are 3 different scenarios that can happen after their reaction to getting an observation. They can react badly an dbe rude, they can keep silent or they can apologize. Each reaction adds or subtracts from their eminence. For another student, whose behavior has always been better, there is a 85% cahnce they will listen attentively during class and so on.

- The bathroom fight has a 30% chance of happening, which leads to parent - teacher meetings, where if a student's eminence is low - then parent is rude, else they may react neutrally or apologize and discipline their kid and this might add to the student's eminence or subtract from it. Generally, the student might get a severe punishment, a normal one or none at all depending on the behavior of the parent and the eminence of the student.

- When a student's eminence gets too low ( less than 30) then a meeting takes place and here depeding on teh depedning on thweir behavior and eminence, an argument might take place between the parent and the teacher. If the teacher reacts badly, they get a salary cut, of they calm down the parent - they get a bigger salary for their good work.

- There is a 50% chance that a student will come to the nurse daily. Then, the nurse might react differently: call the ambulance and parents ( then gets a slightly bigger salary for their good work), send them home ( small portion of addition to salary), send them to class ( no change in salary) or ignore the student and get a salary cut.

- There is a 55% chance an incident in the school kitchen will take place, the school cook having to react differently to it. If they run out of ingredients and make smaller portions which satisfy the students - they get and addition to salary, if not - they don't. If theu burn food they get called to a meeting and get a salary cut for their mistake.



My school simulation hierarchy has root superclass "Entity", which has attribute ID and method exist(). The concrete classes School,Subject List,Room and the abstract class Person inherit superclass Entity,each with their own attributes and methods. Next there are subclasses Staff, Student and Parent of abstract class Person,which inherit the attribute name and method doSomething(). Classes Teacher, Adjunct and AuxiliaryWorker inherit class Staff. Class School has an inner class Location. The class Subject List has subclass Curriculum and class Room has subclasses Classroom, Canteen and Sports Hall,which all inherit from Room.

![alt text](https://github.com/buffaloss/OOP-Lab-4/blob/main/Lab4%20Diagram.png?raw=true)
