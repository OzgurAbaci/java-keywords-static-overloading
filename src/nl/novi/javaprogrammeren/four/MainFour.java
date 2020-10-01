package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.Human;
import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {
    public static void main(String[] args) {
        Human h1 = HumanMaker.makeHuman("Henk");
        System.out.println(HumanMaker.getHumanName(h1));
    }
}
