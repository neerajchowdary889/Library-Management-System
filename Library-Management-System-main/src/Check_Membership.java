import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;

public class Check_Membership {
    public static void check_membership() throws Exception {
        FileReader file11 = new FileReader("Membership.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        while ((line = file22.readLine()) != null) {
            String[] arr = line.split(",", 7);
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime valid_To = LocalDateTime.parse(arr[4]);
            if(now.isAfter(valid_To)){
                remove_user.removeLineFromFile("Membership.txt", line);
            }


        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %22s %27s %27s %17s %10s" ,"USERNAME","ADDRESS","VALID FROM","VALID TO","ID","AGE");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        String line1;
        while ((line1 = file22.readLine()) != null) {
            String[] arr = line1.split(",", 7);
            System.out.format("%10s %22s %34s %27s %12s %8s",arr[0],arr[2],arr[3],arr[4],arr[6],arr[5]);
            System.out.println();

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("Memberships are suspended if they are expired");
        System.out.println("[1] Back to Main Menu");
        int choice = Main.sc.nextInt();
        if (choice == 1) {
            Librarian.librarian();
        } else {
            System.out.println("\033[0;1m" + "Invalid Input" + "\u001B[0m");
            check_membership();

        }


    }
}
