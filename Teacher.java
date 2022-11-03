interface teacherMainActivity { //the main actions of teachers

    void teaches();
    void givesObservation();
    void makeExam();
    void gradeExam();
    void isLate();
    void isAbsent();
    void parentMeeting();
    void teacherMeeting();
    void endsClass();
}
interface teacherExtra { //the extras 

    void getsSick();
    void attendsEvent();
    void eats();
    void stopsFight();
    void entersMeetingRoom();
    void argueParent();
    void tryClassrom();
}

//Teacher will have name,ID,subject(Physical Education, Maths, English language, Physics, History, etc), and salary which can be mdofied
public class Teacher {
    private String name;
    private int ID;
    private String subject;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID ;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     //modify teacher's salary by adding or subtracting from current salary
     public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }

    public void teaches() {
        System.out.println(getName()+ ": Today we're gonna learn about something new and exciting! ");

    }

    public void givesObservation() {
        System.out.println(getName()+ ": You should listen during the class!!! ");
        
    }

    public void makeExam() {
        System.out.println(getName()+ ": I have to make everything REALLY complicated for my dear students... ");
        
    }

    public void gradeExam() {
        System.out.println(getName()+ ": Oh these children... They could've done so much better ");
        
    }

    public void isLate() {
        System.out.println(getName()+ ": *hurries towards school* ");
        
    }

    public void isAbsent() {
        System.out.println(getName()+ ": I am absent today.");
        
    }

    public void parentMeeting() {
        System.out.println(getName()+ ": To be honest, what I wanted to tell you today is.. your dear children aren't as respectful at school as they are at home...");
    }


    public void teacherMeeting() {
        System.out.println(getName()+ ": *listens and nods* ");
    }


    public void getsSick() {
        System.out.println(getName()+ ": *cough*  *cough*");
    }

    public void attendsEvent() {
        System.out.println(getName()+ ": *clap*  *clap*");
    }

    public void eats() {
        System.out.println(getName()+ ": *nom* *nom*");
    }

    public void stopsFight() {
        System.out.println(getName()+ ": Guys, stop!  You will get severly punished for this! ");
    }

    public void entersMeetingRoom() {
        System.out.println(getName() + ": Hello everyone! ");
    }

    public void argueParent() {
        System.out.println(getName()+": This is very disrespectful! How dare you talk like that to me?! You're teh same as your brat! ");
    }

    public void calmParent() {
        System.out.println(getName()+": I understand where you're coming from, but please calm down. ");
    }
    
    public void tryClassrom() {
        System.out.println(getName()+": I would like to use this classroom for this period. ");
    }

    public void hurryMeeting() {
        System.out.println(getName()+": *hurries over to teachers meeting* ");
    }
    
    public void endsClass() {
        System.out.println(getName()+": Thank you for today, don't forget to do your homework! ");
    }
    
    public void callParent() {
        System.out.println(getName()+ ": *calls parent immediately* ");
    }


}