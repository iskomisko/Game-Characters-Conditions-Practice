//Akhmatkulov Islam
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();

        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Archer());
        for(Character c : characters) {
            c.attack();
            c.defend();
            System.out.println();
        }

    }
}
