package nl.novi.javaprogrammeren.four.hidden;

public class HumanMaker {

    private HumanMaker() {
    }

    public static Human makeHuman(String name){
        return new Human(name);
    }

    public static String getHumanName(Human human){
        return human.getName();
    }
}
