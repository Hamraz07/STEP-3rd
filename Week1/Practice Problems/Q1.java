
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    static String playRound(String player, String computer) {
        player = player.trim().toLowerCase();
        computer = computer.toLowerCase();
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] players = new String[5], computers = new String[5], results = new String[5];
        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Round " + (i + 1) + " - Rock, Paper, or Scissors: ");
            players[i] = input.nextLine().trim();
            computers[i] = moves[random.nextInt(3)];
            results[i] = playRound(players[i], computers[i]);
            System.out.println("Computer: " + computers[i] + " | " + results[i]);
            if (results[i].equals("Player Wins")) wins++;
            else if (results[i].equals("Computer Wins")) losses++;
            else draws++;
        }
        System.out.println("\nRound | Player | Computer | Result");
        for (int i = 0; i < 5; i++)
            System.out.println((i + 1) + " | " + players[i] + " | " + computers[i] + " | " + results[i]);
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %%: %.1f%%%n",
                wins, losses, draws, wins * 100.0 / 5);
        input.close();
    }
}
