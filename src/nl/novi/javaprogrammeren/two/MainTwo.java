package nl.novi.javaprogrammeren.two;

public class MainTwo {

    public static void main(String[] args) {
        Animal sjaak = new Dog();
        sjaak.setName("Pietje");

        System.out.println("De hond heet " + sjaak.getName() + " en heeft " + sjaak.getAmountOfLegs() + " poten");

    }
}
