import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {

        String computer = Computerchoice();
        String player = playerChoice();
        Winner(computer, player);

        System.out.println("Computer choice is: " + Computerchoice());
        System.out.println("The rules are:" + " The rock smashes the scissors. " +
                "Scissors cuts paper." + " Paper wraps rock.");

    }

    public static String playerChoice() {
        Scanner obj = new Scanner(System.in);

        System.out.println("This program is the rock  = 1, paper = 2 & scissors = 3 game. /n What is your move? ");
        String playerMove = obj.next();

        return playerMove;

    }

    public static String Computerchoice() {

        Random random = new Random();

        int move;
        String computermove = "move";

        move = random.nextInt(3) + 1;

        if (move == 1)
            computermove = "Rock";
        if (move == 2)
            computermove = "Paper";

        if (move == 3)
            computermove = "Scissors";

        return computermove;

    }

    public static void Winner(String computer, String player) {

        if (computer.equalsIgnoreCase("Rock") && player.equalsIgnoreCase("Scissors")) {
            System.out.println(" Computer wins! Try again!");
        }
        if (computer.equalsIgnoreCase("Scissors") && player.equalsIgnoreCase("Paper")) {
            System.out.println(" Computer wins! Better luck next time!");
        }
        if (computer.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("Rock")) {
            System.out.println(" Computer wins! Better luck next time!");
        }
        if (computer.equalsIgnoreCase("Rock") && player.equalsIgnoreCase("Paper")) {
            System.out.println(" You win! Good job!");
        }
        if (computer.equalsIgnoreCase("Scissors") && player.equalsIgnoreCase("Rock")) {
            System.out.println(" You win! Good job!");
        }
        if (computer.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("Scissors")) {

            System.out.println(" You win! Good job!");
        } else if (computer.equalsIgnoreCase(player) && player.equalsIgnoreCase(computer)) {
            System.out.println(" Tie! Try again.");
        }

    }
}

