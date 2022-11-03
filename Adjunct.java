interface adjunctActivity { //the main actions of adjuncts

    void hireStaff();
    void fireStaff();
    void planEvent();
    void organizeMeeting();
    void isLate();
    void isAbsent();
    void writeReport();
    void manageDocuments();
    void observeClass();
    void exmatriculation1();
    void punishment1();
    void exmatriculation2();
    void punishment2();
    void noPunishment();
    void salaryCut();

}

//adjunct directors will have diff responsabilities
// 1. Hiring staff 2.Organize events 3.Manage contracts/documents ...etc

public class Adjunct extends Staff{ 
    private String name;
    private int ID;
    private String task;
    private int salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    //modifiy the task to something else
    public void modifyTask(String task){
        this.task = task;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     //modify adjunct's salary by adding or subtracting from current salary
     public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }

    public void hireStaff() {
        System.out.println(getName()+ ": We believe you will be a great addition to our team! ");
        
    }

    public void fireStaff() {
        System.out.println(getName()+ ": I am sorry to tell you that you will have to leave us... ");
        
    }

    public void planEvent() {
        System.out.println(getName()+ ": *tells everyone what to do*");
        
    }

    public void organizeMeeting() {
        System.out.println(getName()+ ": *contacts everyone who needs to be present at the meeting* ");
        
    }

    public void isLate() {
        System.out.println(getName()+ ": *hurries towards school* ");
        
    }

    public void isAbsent() {
        System.out.println(getName()+ ": I am absent today.");
        
    }

    public void writeReport() {
        System.out.println(getName()+ ": This shall do ...");
        
    }

    public void manageDocuments() {
        System.out.println(getName()+ ": *shuffle* *shuffle*");
        
    }

    public void observeClass() {
        System.out.println(getName()+ ": Hello, today i will be observing your clas. Good luck, guys. " );
        
    }


    public void giveFeedback() {
        System.out.println(getName()+": You did a good job today, miss.  ");
    }
    
    public void exmatriculation1() {
        System.out.println(getName()+ ": The one who started the fight shall be exmatriculated. That is my final decision.");

    }

    public void punishment1() {
        System.out.println(getName()+ ": The one who started the fight shall be severly punished. You will have to do 200 hours of community service this year. That is my final decision. ");

    }
    public void exmatriculation2() {
        System.out.println(getName()+ ": And the one who continued the fight shall also be exmatriculated. ");

    }

    public void punishment2() {
        System.out.println(getName()+ ": And the one who continued the fight shall also be severly punished. You will have to do 50 hours of community service this year.");

    }

    public void noPunishment() {
        System.out.println(getName()+ ": And the one who just wanted to stop a bad deed should not get punished.  ");

    }
    public void salaryCut() {
        System.out.println(getName()+ ": You mistake will not be ignored and therefore you get a pay cut. ");
    }

}