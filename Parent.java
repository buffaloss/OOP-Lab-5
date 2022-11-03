import java.util.Random;

interface parentActivity { //the main actions of other workers

    void takeChild();
    void bringChild();
    void entersMeetingRoom();

}

public class Parent extends Person {
    
    Random random = new Random();
    public String exist() {
        String existence = " *exists* ";
        return existence;
    }

    public String doSomething() {
        String action = " *attends meetings...*";
        return action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeChild() {
        System.out.println(getName()+ " : *goes home with child* ");
    }

    public void bringChild() {
        System.out.println(getName()+ " : Good luck today and listen well to your teachers! ");
    }

    public void leaveMeeting() {
        System.out.println(getName()+ " : *leaves meeting* ");

    }

    public void entersMeetingRoom() {
        System.out.println(getName() + " * enters the room with a lot of other parents and teachers* ");
    }

}
