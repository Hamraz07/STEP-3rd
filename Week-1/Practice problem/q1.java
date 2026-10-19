import java.util.Random;
import java.util.Scanner;

public class q1{

    static String generateComputerMove(Random random) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        int index = random.nextInt(3);
        return moves[index];
    }

    static String playRound(String playerMove, String computerMove) {

        if (!playerMove.equals("Rock") &&
            !playerMove.equals("Paper") &&
            !playerMove.equals("Scissors")) {
            return "Invalid Move";
        }

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberOfRounds = 5;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[] playerMoves = new String[numberOfRounds];
        String[] computerMoves = new String[numberOfRounds];
        String[] results = new String[numberOfRounds];

        for (int round = 0; round < numberOfRounds; round++) {

            System.out.print("Round " + (round + 1)
                    + " - Enter Rock, Paper or Scissors: ");

            String playerMove = sc.nextLine();
            String computerMove = generateComputerMove(random);

            String result = playRound(playerMove, computerMove);

            playerMoves[round] = playerMove;
            computerMoves[round] = computerMove;
            results[round] = result;

            System.out.println("Computer: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println();

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else if (result.equals("Draw")) {
                draws++;
            }
        }

        double winPercentage = ((double) wins / numberOfRounds) * 100;

        System.out.println("Final Summary");
        System.out.println("---------------------------------------------");
        System.out.println("Round\tPlayer\t\tComputer\tResult");

        for (int round = 0; round < numberOfRounds; round++) {
            System.out.println((round + 1) + "\t"
                    + playerMoves[round] + "\t\t"
                    + computerMoves[round] + "\t\t"
                    + results[round]);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}
