import MyProjectPackage.Umpire;

public class GuesserGameProject {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guesser Game!");
        Umpire umpire = new Umpire();
        umpire.collectNumberFromGuesser();
        umpire.collectNumbersFromPlayers();
        umpire.compareNumbers();
    }
}
