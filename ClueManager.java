import java.util.Scanner;

public class ClueManager {

    String[] clues;
    boolean[] collected;

    // Constructor
    ClueManager() {

        clues = new String[] {

            "The office door was opened at 2:15 PM.",

            "CCTV shows someone entering the office.",

            "A torn piece of paper was found near the printer.",

            "A suspect's ID card was found inside the office.",

            "The printer was used shortly before the question paper disappeared."
        };

        collected = new boolean[clues.length];
    }


    // Display all available clues
    void displayClues() {

        System.out.println("\n===== AVAILABLE CLUES =====");

        for (int i = 0; i < clues.length; i++) {

            System.out.println(
                (i + 1) + ". " + clues[i]
            );
        }
    }


    // Collect a clue
    void collectClue(Scanner sc) {

        displayClues();

        System.out.print("\nEnter clue number to collect: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > clues.length) {

            System.out.println("Invalid clue number!");
            return;
        }

        if (collected[choice - 1]) {

            System.out.println("You have already collected this clue.");
            return;
        }

        collected[choice - 1] = true;

        System.out.println("\nClue collected successfully!");
        System.out.println(clues[choice - 1]);
    }


    // Display collected clues
    void displayCollectedClues() {

        System.out.println("\n===== COLLECTED CLUES =====");

        boolean found = false;

        for (int i = 0; i < clues.length; i++) {

            if (collected[i]) {

                System.out.println(
                    "Clue " + (i + 1) + ": " + clues[i]
                );

                found = true;
            }
        }

        if (!found) {

            System.out.println("No clues have been collected yet.");
        }
    }
}