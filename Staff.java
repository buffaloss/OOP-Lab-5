// Staff will contain name, ID,job ( can be nurse, school psychologist, janitor, cleaning lady, school cook, etc)
// also will have a salary which can be modified
public class Staff extends Person{ 
    //private String name;
    //private int ID;
    int a1 = 111; //example for overriding 
    protected int salary; //protected so we can acces it insubclasses without having to call class Staff first

    public String exist() {
        String existence = "Exists";
        return existence;
    }

    public String doSomething() {
        String action = "Works";
        return action;
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

    //modify staff's salary by adding or subtracting from current salary
    public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }
}