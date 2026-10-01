import java.util.Scanner;

public class DetectiveGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Create suspects
        Suspect[] suspects =
            Suspect.createSuspects();


        // Create clue manager
        ClueManager clueManager =
            new ClueManager();


        // Create investigation
        // Arjun (ID 5) is the culprit
        Investigation investigation =
            new Investigation(5);


        boolean gameRunning = true;


        while (gameRunning) {

            System.out.println(
                "\n================================="
            );

            System.out.println(
                "     DETECTIVE INVESTIGATION"
            );

            System.out.println(
                "================================="
            );

            System.out.println("1. View Suspects");
            System.out.println("2. Investigate Suspect");
            System.out.println("3. Collect Clue");
            System.out.println("4. View Collected Clues");
            System.out.println("5. Accuse Suspect");
            System.out.println("6. View Suspicion Levels");
            System.out.println("7. Exit");


            System.out.print(
                "\nEnter your choice: "
            );

            int choice = sc.nextInt();


            switch (choice) {

                case 1:

                    Suspect.displayAllSuspects(
                        suspects
                    );

                    break;


                case 2:

                    investigation.investigateSuspect(
                        suspects,
                        sc
                    );

                    break;


                case 3:

                    clueManager.collectClue(sc);

                    break;


                case 4:

                    clueManager.displayCollectedClues();

                    break;


                case 5:

                    boolean solved =
                        investigation.accuseSuspect(sc);


                    if (solved) {

                        System.out.println(
                            "\n================================="
                        );

                        System.out.println(
                            "          CASE SOLVED!"
                        );

                        System.out.println(
                            "================================="
                        );

                        System.out.println(
                            "You identified the culprit."
                        );

                        System.out.println(
                            "The missing question paper "
                            + "has been recovered."
                        );

                        gameRunning = false;
                    }

                    else if (
                        investigation.investigationFailed()
                    ) {

                        System.out.println(
                            "\n================================="
                        );

                        System.out.println(
                            "     INVESTIGATION FAILED!"
                        );

                        System.out.println(
                            "================================="
                        );

                        System.out.println(
                            "You used all three attempts."
                        );

                        System.out.println(
                            "The culprit escaped."
                        );

                        gameRunning = false;
                    }

                    break;


                case 6:

                    investigation.displaySuspicionLevels(
                        suspects
                    );

                    break;


                case 7:

                    System.out.println(
                        "\nThank you, Detective!"
                    );

                    gameRunning = false;

                    break;


                default:

                    System.out.println(
                        "\nInvalid choice!"
                    );

                    break;
            }
        }


        sc.close();
    }
}