package edu.hogwarts.data;

public class Wand extends TeachingMaterial {
    private double lengthInInches;
    private String wood;
    private String core;

    public Wand(String name, boolean onShoppingList, boolean required, boolean provided, String notes,
                double lengthInInches, String wood, String core) {

        super(name, onShoppingList, required, provided, notes);
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    @Override
    public String toString() {
        return
                "Teaching material" +
                "\n  Name: " + getName()  +
                "\n  Length in Inches: " + lengthInInches +
                "\n  Wood: " + wood +
                "\n  Core: " + core +
                "\n}";
    }

    public static void main(String[] args) {

    }
}