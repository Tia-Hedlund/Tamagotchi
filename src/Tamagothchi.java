import java.util.ArrayList;
import java.util.Random;

public class Tamagothchi {

    private int hunger;
    private int boredom;
    private boolean isAlice;
    private ArrayList<String> words;
    private Random generator = new Random();
    public String Name;


    public void tick(){
        hunger += 1;
        boredom += 1;
    }

    public void feed(){
        hunger -= 1;
    }

    public void speak(){

        System.out.println();
        reduceBoredom();
    }


    public void teach(String word){
        words.add(word);
        reduceBoredom();
    }

    public void printStats(){
        System.out.println("Hunger: " + hunger);
        System.out.println("Boredom: " + boredom);

    }

    public boolean getAlive(){
        return false; // temporär
    }

    private void reduceBoredom(){

    }

}

