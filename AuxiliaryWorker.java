interface workerActivity { //the main actions of other workers

    void isLate();
    void isAbsent();
    void cook();
    void clean();
    void burnFood();
    void runOutOfIngredients();
    void consult();
    void treat();
    void freeClassroom();
    void enterSchool();
    void ignoreStudent();
    void sendHome();
    void sendToClass();
    void callAmbulance();
    void serveFood();
    void satisfied();
    void makeSmallerPortions();
    void noFoodAnnouncement();
    void sad();

}

//auxiliary workes will be: nurse, school psychologist, cook, janitor,etc
public class AuxiliaryWorker extends Staff{
    private String name;
    private int ID;
    private int salary;
    private String job;
    int a1 = 222; //example for overriding

    public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }

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

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void isLate() {
        System.out.println(getName()+ ": Ah, I shoud hurry over...");
    }


    public void isAbsent() {
        System.out.println(getName()+ ": I am absent today. ");
    }


    public void cook() {
        System.out.println(getName()+ ": The food will be ready soon. ");
    }


    public void clean() {
        System.out.println(getName()+ ": The room is occupied, I am cleaning it right now. ");
    }


    public void burnFood() {
        System.out.println(getName()+ ": AHHHH! The food is destroyed! ");
    }


    public void runOutOfIngredients() {
        System.out.println(getName()+ ": We need more ingredients as soon as possible. ");
    }

    public void isFree() {
        System.out.println(getName()+ ": This room is currently free. ");
    }


    public void consult() {
        System.out.println(getName()+ ": You can talk to me, what happend? How are you feeling? ");
    }


    public void treat() {
        System.out.println(getName()+ ": Let me see, so you have a headache...Here, take this pill and glass of water. ");
    }

    public void ignoreStudent() {
        System.out.println(getName()+ ": *ignores student* ");
    }

    public void sendToClass() {
        System.out.println(getName()+ ": You can go to your next class.  ");
    }

    public void sendHome() {
        System.out.println(getName()+ ": You can go home, take care! ");
    }

    public void callAmbulance() {
        System.out.println(getName()+ ": *calls ambulance because the state of the student isn't getting better*  ");
    }

    public void freeClassroom() {
        System.out.println(getName()+ ": You can use this classroom, it's free. ");
    }


    public void enterSchool() {
        System.out.println(getName()+ ": *goes to workplace* ");
    }

    public void serveFood() {
        System.out.println(getName()+ ": *serves food to everyone* ");
    }

    public void satisfied() {
        System.out.println(getName()+ ": I am happy to hear that you guys are liking it!  ");
    }

    public void makeSmallerPortions() {
        System.out.println(getName()+ ": *serves smaller portions*");
    }

    public void noFoodAnnouncement() {
        System.out.println(getName()+ ": There will be no food today guys. Please get your lunch from the nearby mini market. ");
    }

    void sad() {
        System.out.println(getName() + ": * gets sad that everyone is disappointed in them* ");
    }
}