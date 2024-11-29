import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] rps = {"Rock", "Paper", "Scissor"};
        String computerMove;
        String userMove;

        while (true) {
            System.out.println("Enter move (Rock, Paper, Scissors). To exit the game, type \"exit\": ");
            userMove = scanner.nextLine();
            
            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Game Over");
                break;
            }

            if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissor")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int index = random.nextInt(3);
            computerMove = rps[index];
            System.out.println("Computer move: " + computerMove);

            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equalsIgnoreCase("Rock")) {
                if (computerMove.equals("Scissor")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            } else if (userMove.equalsIgnoreCase("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            } else if (userMove.equalsIgnoreCase("Scissor")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }

        scanner.close();
    }
}
