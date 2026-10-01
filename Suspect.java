public class Suspect {

    int id;
    String name;
    String location;
    String alibi;
    int suspicionLevel;

    // Constructor
    Suspect(int id, String name, String location,
            String alibi, int suspicionLevel) {

        this.id = id;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
        this.suspicionLevel = suspicionLevel;
    }

    // Method to display one suspect
    void displayDetails() {

        System.out.println("ID              : " + id);
        System.out.println("Name            : " + name);
        System.out.println("Location        : " + location);
        System.out.println("Alibi           : " + alibi);
        System.out.println("Suspicion Level : " + suspicionLevel);
    }

    // Method to create all suspects
    static Suspect[] createSuspects() {

        Suspect[] suspects = {

            new Suspect(
                1,
                "Alex",
                "Computer Lab",
                "Working on a project",
                4
            ),

            new Suspect(
                2,
                "Maya",
                "Library",
                "Studying",
                2
            ),

            new Suspect(
                3,
                "Rahul",
                "Staff Room",
                "Meeting a faculty member",
                7
            ),

            new Suspect(
                4,
                "Sara",
                "Canteen",
                "Having lunch",
                3
            ),

            new Suspect(
                5,
                "Arjun",
                "Department Office",
                "Collecting documents",
                9
            )
        };

        return suspects;
    }

    // Method to display all suspects
    static void displayAllSuspects(Suspect[] suspects) {

        System.out.println("\n===== ALL SUSPECTS =====");

        for (Suspect suspect : suspects) {

            System.out.println("\n------------------------");
            suspect.displayDetails();
        }
    }
}