package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    static int numBeers = 0;

    public Beer(String brand) {
        this.brand = brand;
        System.out.println("Biertje nummer " + ++numBeers + " is getapt");

    }

    public static int getTappedBeersAmount(){
        return numBeers;
    }

    public int getAmountOfBeersTapped(){
        return numBeers;
    }
}
