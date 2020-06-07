package wildcards;

public class House extends Building {

    public int numberOfRooms = 10;

    @Override
    public String toString() {
        return ("house");
    }

    @Override
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
