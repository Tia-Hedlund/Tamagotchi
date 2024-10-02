import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tamagotchi");

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Ange ord att lära Tamagotchi: ");
        String word = myScanner.nextLine();
        Tamagothchi.teach(word);
    }

}