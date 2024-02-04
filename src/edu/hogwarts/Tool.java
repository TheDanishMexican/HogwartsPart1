package edu.hogwarts;

public class Tool extends TeachingMaterial {
    private String name;
    private String description;

    public Tool(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String description) {
        super(name, onShoppingList, required, provided, notes);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "Teaching material:" +
                "\n  Name: " + name +
                "\n  Description: " + description +
                "\n}";
    }

    public static void main(String[] args) {

    }
}

