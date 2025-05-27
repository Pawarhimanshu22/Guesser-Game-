package MyProjectPackage;

import java.util.Scanner;

public class Player {
    int numberGuessedByPlayer;

    public int takeNumberOfPlayer(int playerId) {
        System.out.print("Player " + playerId + ", please guess a number: ");
        Scanner sc = new Scanner(System.in);
        numberGuessedByPlayer = sc.nextInt();
        return numberGuessedByPlayer;
    }
}
