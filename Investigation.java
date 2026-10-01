import java.util.Scanner;

public class Investigation {

    int culpritId;
    int attempts;

    // Constructor
    Investigation(int culpritId) {

        this.culpritId = culpritId;
        attempts = 0;
    }


    // Investigate a suspect
    void investigateSuspect(
        Suspect[] suspects,
        Scanner sc
    ) {

        System.out.print("\nEnter suspect ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Suspect suspect : suspects) {

            if (suspect.id == id) {

                System.out.println("\n===== SUSPECT DETAILS =====");

                suspect.displayDetails();

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Invalid suspect ID!");
        }
    }


    // Display suspicion levels
    void displaySuspicionLevels(
        Suspect[] suspects
    ) {

        System.out.println("\n===== SUSPICION LEVELS =====");

        for (Suspect suspect : suspects) {

            System.out.println(
                suspect.name + " : "
                + suspect.suspicionLevel
            );
        }
    }


    // Accuse a suspect
    boolean accuseSuspect(Scanner sc) {

        if (attempts >= 3) {

            System.out.println(
                "You have already used all three attempts."
            );

            return false;
        }

        System.out.print(
            "\nEnter suspect ID to accuse: "
        );

        int accusedId = sc.nextInt();

        attempts++;

        if (accusedId == culpritId) {

            return true;
        }

        System.out.println("Wrong accusation!");

        System.out.println(
            "Attempts remaining: "
            + (3 - attempts)
        );

        return false;
    }


    // Check whether all attempts are used
    boolean investigationFailed() {

        return attempts >= 3;
    }
}