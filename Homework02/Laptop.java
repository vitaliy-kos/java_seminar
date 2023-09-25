package Homework02;

public class Laptop {
    int ID;
    Brand brand;
    Color color;
    Os os;
    int hard;
    int ram;

    public Laptop(int id, Brand brand, Color color, Os os, int hard, int ram) {
        this.ID = id;
        this.brand = brand;
        this.color = color;
        this.os = os;
        this.hard = hard;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "ID=" + this.ID +
                ", brand=" + this.brand +
                ", color=" + this.color +
                ", os=" + this.os +
                ", hard=" + this.hard + "GB" +
                ", ram=" + this.ram + "GB" + '}';
    }
    
}
