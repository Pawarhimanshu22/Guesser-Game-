package MyProjectPackage;

public class Umpire {
    int numberFromGuesser;
    int numberFromPlayer01;
    int numberFromPlayer02;
    int numberFromPlayer03;

    public void collectNumberFromGuesser() {
        Guesser guesser = new Guesser();
        numberFromGuesser = guesser.takeNumberOfGuesser();
    }

    public void collectNumbersFromPlayers() {
        Player player = new Player();
        numberFromPlayer01 = player.takeNumberOfPlayer(1);
        numberFromPlayer02 = player.takeNumberOfPlayer(2);
        numberFromPlayer03 = player.takeNumberOfPlayer(3);
    }

    public void compareNumbers() {
        System.out.println("\n--- Game Result ---");

        if (numberFromPlayer01 == numberFromGuesser) {
            if (numberFromPlayer02 == numberFromGuesser) {
                if (numberFromPlayer03 == numberFromGuesser) {
                    System.out.println("Congratulations! Player 1, Player 2, and Player 3 all guessed correctly!");
                } else {
                    System.out.println("Well done! Player 1 and Player 2 guessed the correct number!");
                }
            } else {
                if (numberFromPlayer03 == numberFromGuesser) {
                    System.out.println("Great job! Player 1 and Player 3 guessed correctly!");
                } else {
                    System.out.println("Nice try! Only Player 1 guessed the correct number.");
                }
            }
        } else {
            if (numberFromPlayer02 == numberFromGuesser) {
                if (numberFromPlayer03 == numberFromGuesser) {
                    System.out.println("Well done! Player 2 and Player 3 guessed correctly!");
                } else {
                    System.out.println("Good effort! Only Player 2 guessed the correct number.");
                }
            } else {
                if (numberFromPlayer03 == numberFromGuesser) {
                    System.out.println("Nice! Only Player 3 guessed the correct number.");
                } else {
                    System.out.println("No correct guesses this time. Better luck next game!");
                }
            }
        }
    }
}
