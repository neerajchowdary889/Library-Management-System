import java.io.*;
import java.sql.SQLOutput;
import java.util.Stack;

public class Announcements {
    public static void Add_Announcements() throws Exception {
        FileWriter file12 = new FileWriter("Announcements.txt", true);
        BufferedWriter file23 = new BufferedWriter(file12);
        PrintWriter file34 = new PrintWriter(file23);
        System.out.println("Enter the announcement: ");
        String announcement = Main.sc.nextLine();
        file34.println(announcement);
        file34.close();
        System.out.println("Announcement added successfully");
        System.out.println("\033[0;1m" + "[1]Add another Announcements \n" + "\u001B[0m");
        System.out.println("\033[0;1m" + "[2]Go to Main Menu \n" + "\u001B[0m");
        int choice = Main.sc.nextInt();
        switch (choice) {
            case 1:
                Add_Announcements();
                break;
            case 2:
                Librarian.librarian();
                break;

        }
    }
    public static void View_Announcements() throws Exception {
        FileReader file11 = new FileReader("Announcements.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        Stack A = new Stack();
        while((line=file22.readLine())!=null){
            A.push(line);
        }
        if (A.isEmpty()){
            System.out.println("No announcements");
        }
        else {
            System.out.println("Announcements: ");
            while (!A.isEmpty()){
                System.out.println(A.pop());
            }
        }
        System.out.println("\033[0;1m" + "Press any key to continue \n" + "\u001B[0m");
        Main.sc.nextLine();
        Library.library();
    }
}
