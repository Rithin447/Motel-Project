package model;

public class Room {
    private int roomNumber;
    private String type;
    private double price;
    private boolean isAvailable;

    public Room(int roomNumber, String type, double price, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    public void setType(String type) { this.type = type; }
    public void setPrice(double price) { this.price = price; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
}

