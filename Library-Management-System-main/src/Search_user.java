import com.bethecoder.ascii_table.ASCIITable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search_user {
    public static void searchuser() throws Exception {
        System.out.println("[1]Search Membership User");
        System.out.println("[2]Search Ordinary User");
        System.out.println("[3]Back");
        int choice = Main.sc.nextInt();
        switch (choice){
            case 1 :
                search_membership_user();
                break;
            case 2 :
               search_ordinary_user();
                break;
            case 3 :
                Librarian.librarian();
                break;
            default:
                System.out.println("Wrong entry");
        }

    }

    public static void search_membership_user() throws Exception {
        System.out.println("Enter Username to search");
        String username = Main.sc.next();
        String line1;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);

        while ((line1 = file23.readLine()) != null) {
            if (line1.contains(username)) {
                String [] tableHeaders = { "USERNAME", "ADDRESS", "VALID FROM", "VALID TO", "ID", "AGE"};
                String[] arr = line1.split(",",7);
                String[][] tableData = {
                        {  arr[0], arr[2], arr[3], arr[4], arr[5], arr[6] }


                };

                ASCIITable.getInstance().printTable(tableHeaders, tableData);
            }
            else{
                System.out.println("User not found");
            }
            System.out.println("[1]Search Again");
            System.out.println("[2]Back");
            int choice = Main.sc.nextInt();
            if(choice==1){
                search_membership_user();
            }
            else if(choice==2){
                Librarian.librarian();
            }
        }

    }
    public static void search_ordinary_user() throws Exception {
        System.out.println("Enter Username to search");
        String username = Main.sc.next();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        while ((line = file22.readLine()) != null) {
            if (line.contains(username)) {
                String [] tableHeaders = { "USERNAME", "ADDRESS", "ID", "AGE"};
                String[] arr = line.split(",",5);
                String[][] tableData = {
                        {  arr[0], arr[4], arr[2], arr[3] }


                };

                ASCIITable.getInstance().printTable(tableHeaders, tableData);



            }
            else{
                System.out.println("User not found");


            }
            System.out.println("[1]Search Again");
            System.out.println("[2]Back");
            int choice = Main.sc.nextInt();
            if(choice==1){
                search_ordinary_user();
            }
            else if(choice==2){
                Librarian.librarian();
            }
        }


    }
}
