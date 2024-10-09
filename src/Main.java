import java.util.Scanner;

/* Att göra:
    * Fixa så att loopen inte körs när boredom eller hunger blir för höga. kanske för loopen om han är vid liv
    * Fixa teach word.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Tamagotchi");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give your Tamagotchi a name! ");
        System.out.print("Name: ");
        String tamagotchiName = myScanner.nextLine();
        Tamagothchi tamagothchi1 = new Tamagothchi(tamagotchiName);

        while (tamagothchi1.getAlive()) {
            System.out.println();
            tamagothchi1.printStats();
            tamagothchi1.tick();
            System.out.println();
            System.out.println("What do you want " + tamagothchi1.name + " to do?");
            System.out.println("1. Eat");
            System.out.println("2. Learn a new word");
            System.out.println("3. Talk");
            System.out.println("4. Exit");

            switch (myScanner.nextLine()) {
                case "1":
                    tamagothchi1.feed();
                    break;
                case "2":
                    //System.out.println("Ange ord att lära Tamagotchi: ");
                    //String word = myScanner.nextLine();
                    // Tamagothchi1.teach(word);
                    // tamagothchi1.teach();
                    break;
                case "3":
                    tamagothchi1.speak();
                    break;
                case "4":
                    System.out.println(tamagothchi1.name + " says goodbye! ");
                    return;
                default:
                    break;
            }
        }

        if (tamagothchi1.getBoredom()>=10)
        {
            System.out.println(tamagothchi1.name + " died of boredom...");
        }
        else if (tamagothchi1.getHunger()<10){
            System.out.println(tamagothchi1.name + "died of hunger...");
        }
        else{
            System.out.println("You left " + tamagothchi1.name + " to fend for himself.");
            System.out.println("Perhaps this was for the best...");
        }

    }
}