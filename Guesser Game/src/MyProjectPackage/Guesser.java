package MyProjectPackage;

import java.util.Scanner;

public class Guesser {
    int numberGuessedByGuesser;

    public int takeNumberOfGuesser() {
        System.out.print("Guesser, please guess a number: ");
        Scanner sc = new Scanner(System.in);
        numberGuessedByGuesser = sc.nextInt();
        return numberGuessedByGuesser;
    }
}
