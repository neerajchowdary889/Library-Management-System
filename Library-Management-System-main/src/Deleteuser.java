import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Deleteuser   {
    public static void deleteuser() throws Exception {
        System.out.println("[1]Delete Membership User");
        System.out.println("[2]Delete Ordinary User");
        System.out.println("[3]Back");
        int choice = Main.sc.nextInt();
        switch (choice){
            case 1 :
             delete_membership_user();
                break;
            case 2 :
                delete_ordinary_user();
                break;
            case 3 :
                Librarian.librarian();
                break;
            default:
                System.out.println("Wrong entry");
        }
    }

        public static void delete_membership_user() throws IOException {
            System.out.println("Enter Username to delete");
            String username = Main.sc.next();
            String line2;
            FileReader file12 = new FileReader("Membership.txt");
            BufferedReader file23 = new BufferedReader(file12);
            FileReader file24 = new FileReader("Login.txt");
            BufferedReader file25 = new BufferedReader(file24);
            String line3;
            while ((line2 = file23.readLine()) != null) {
                if (line2.contains(username)) {
                    remove_user.removeLineFromFile("Membership.txt", line2);
                }
                else{
                    System.out.println("User not found");
                }

            }
            while ((line3 = file25.readLine()) != null) {
                if (line3.contains(username)) {
                    remove_user.removeLineFromFile("Login.txt", line3);
                }
            }



        }
    public static void delete_ordinary_user() throws IOException {
        System.out.println("Enter Username to delete");
        String username = Main.sc.next();
        String line;
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line = file22.readLine()) != null) {
            if (line.contains(username)) {
                remove_user.removeLineFromFile("USERNAME.txt", line);
            }
            else{
                System.out.println("User not found");
            }

        }
        while ((line3 = file25.readLine()) != null) {
            if (line3.contains(username)) {
                remove_user.removeLineFromFile("Login.txt", line3);
            }
        }


    }

}

