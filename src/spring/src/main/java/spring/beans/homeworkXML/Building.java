package spring.beans.homeworkXML;

public class Building {
    private int height=10;
    private int width=10;
    private int numberOfFloors=5;
    private  Address address;

    public Building(Address address) {
        this.address = address;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public Address getAddress() {
        return address;
    }
}

