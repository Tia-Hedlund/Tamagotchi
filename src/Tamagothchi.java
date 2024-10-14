import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagothchi {

    private int hunger = 0;
    private int boredom = 0;
    private boolean isAlice = true;
    private ArrayList<String> words = new ArrayList<>();
    private Random generator = new Random();
    public String name;
    Scanner myScanner = new Scanner(System.in);

    // constructor
    public Tamagothchi(String incomingName) {
        name = incomingName;
    }

    public void tick() {
        hunger += 1;
        boredom += 1;

        if (hunger >= 10 || boredom >= 10){
            isAlice = false;
        }
    }

    private void reduceBoredom() {
        boredom -= 1;
        if (boredom < 0) {
            boredom = 0;
        }
    }

    public void feed() {
        int reducedHunger = 1;
        hunger -= reducedHunger;
        if (hunger < 0) {
            hunger = reducedHunger;
        }
        System.out.println();
        System.out.println("Hunger reduced by " + reducedHunger);
    }

    public void speak() {
        System.out.println();
        if (words.isEmpty()) {
            System.out.println("No words known...");
        } else {
            System.out.print(name + " says: ");
            System.out.println(words.get(generator.nextInt(words.size())));
        }
        reduceBoredom();
    }

    public void teach() {
        System.out.print("Ange ord att lära Tamagotchi: ");
        String word = myScanner.next();
        words.add(word);
        reduceBoredom();
    }

    public void printStats() {
        System.out.println(name + "'s current stats:");
        System.out.println("Hunger: " + hunger);
        System.out.println("Boredom: " + boredom);

    }

    public boolean getAlive() {
        return isAlice;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

}


