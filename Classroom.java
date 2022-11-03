//the classroom will have a width, length and number of seats for students

public class Classroom extends Room{ 
    private int width;
    private int length;
    private int seats; // capacity or number of seats for students


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

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void isFree() {
        System.out.println("This room is currently free. ");
    }

    public void isOccupied() {
        System.out.println("This room is currently occupied. ");

    }
}