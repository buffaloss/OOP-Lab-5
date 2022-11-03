//Sports hall will have width,length and capacity
public class SportsHall extends  Room{
    private int width;
    private int length;
    private int capacity; // capacity will represent the maximum number of students that can do sports activites inside

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void isFree() {
        System.out.println("This room is currently free. ");
    }

    public void isOccupied() {
        System.out.println("This room is currently occupied. ");

    }
}