package edu.hogwarts.data;

public class Ingredient extends TeachingMaterial {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double amount, String unit) {
        super(name, onShoppingList, required, provided, notes);
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return  "Teach material: " +
                "\n  Name: " + name +
                "\n  Amount: " + amount +
                "\n  Unit: " + unit +
                "\n}";
    }

    public static void main(String[] args) {

    }
}
