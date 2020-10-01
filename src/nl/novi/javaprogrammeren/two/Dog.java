package nl.novi.javaprogrammeren.two;

public class Dog extends Animal{

    public Dog(){
        super();
        super.setAmountOfLegs(4);
    }

    @Override
    public void pet() {
        System.out.println("Dog is happy");
    }
}
