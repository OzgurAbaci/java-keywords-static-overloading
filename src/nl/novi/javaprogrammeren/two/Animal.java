package nl.novi.javaprogrammeren.two;

public abstract class Animal {

    private int amountOfLegs;
    private String name;

    public abstract void pet();

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
