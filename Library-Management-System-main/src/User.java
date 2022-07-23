import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class User {
    public static void viewusers() throws Exception {
        System.out.println("[1] Membership users");
        System.out.println("[2] Ordinary Users");
        System.out.println("[3] Back");
        System.out.println("Enter your choice: ");
        int choice = Main.sc.nextInt();
        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                Librarian.librarian();
                break;
            default:
                System.out.println("Wrong entry");
        }

    }

    public static void main(String[]args) throws Exception {
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %22s %27s %27s %17s %10s" ,"USERNAME","ADDRESS","VALID FROM","VALID TO","ID","AGE");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        String line1;
        while ((line1 = file23.readLine()) != null) {
            String[] arr = line1.split(",", 7);
            System.out.format("%10s %22s %34s %27s %12s %8s",arr[0],arr[2],arr[3],arr[4],arr[6],arr[5]);
            System.out.println();

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("[1] Back to Main Menu");
        String ignore = Main.sc.nextLine();
        int choice = Main.sc.nextInt();
        if (choice == 1) {
            Librarian.librarian();
        } else {
            System.out.println("\033[0;1m" + "Invalid Input" + "\u001B[0m");

        }
    }
    public static void ordinary_users() throws Exception {
        FileReader file12 = new FileReader("USERNAME.txt");
        BufferedReader file23 = new BufferedReader(file12);

        System.out.println("-----------------------------------------------------");
        System.out.printf("%10s %20s %10s %10s","USERNAME","ADDRESS","ID","AGE");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        String line1;
        while ((line1 = file23.readLine()) != null) {
            String[] arr = line1.split(",", 5);
            System.out.format("%10s %20s %10s %10s",arr[0],arr[4],arr[2],arr[3]);

            System.out.println();

            System.out.println("-----------------------------------------------------");
        }
        System.out.println("[1] Back to Main Menu");
        String ignore = Main.sc.nextLine();
        int choice = Main.sc.nextInt();
        if (choice == 1) {
            Librarian.librarian();
        } else {
            System.out.println("\033[0;1m" + "Invalid Input" + "\u001B[0m");

        }


    }
}
