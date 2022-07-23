import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Librarian {

    public static void librarian() throws Exception {
        System.out.println(" [1]Add user \n [2] Delete User \n [3] search user\n [4]User History \n [5]Manage Fines \n [6]Issued Books History \n [7]Return Book History \n [8]Search Books \n [9]Add Books \n [10]Delete Books\n [11]Display All Books\n [12]Add Annoucements\n [13]Check Membership \n [14]Logout");
        int choice = Main.sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("[1] Add Membership User \n [2] Add Ordinary User");
                int choice1 = Main.sc.nextInt();
                switch (choice1){
                    case 1 :
                        Take_Membership.Takemembership();
                        break;
                    case 2 :
                        Create_Account.create();
                        break;
                    default :
                        System.out.println("Invalid Input");
                        librarian();
                        break;
                }
                break;
            case 2 :
                Deleteuser.deleteuser();
                break;
            case 3 :
                Search_user.searchuser();
                break;
                case 4 :
                Login_History.login_history();
                break;
            case 5 :
               manage_fines();
                break;
            case 6 :
              issued_books_history();
                break;
            case 7 :
              return_book_history();
                break;
            case 8 :
                Search_Books.searchbook();
                break;
            case 9 :
                Add_Books.add_books();
                break;
            case 10 :
                Delete_Book.deletebook();
                break;
            case 11 :
               View_book_Genre.viewbookgenre();
                break;
            case 12 :
                Announcements.Add_Announcements();
                break;
                case 13 :
                Check_Membership.check_membership();
                break;
            case 14 :
                Logout.logout();
                break;

            default:
                System.out.println("Wrong entry");
        }



        //display all books
        //search books
        // add and delete book
        // fines manage
        //issued books list
        //return book history
        // users history
        //Book suggestions

    }
    public static void manage_fines() throws Exception {
        System.out.println("Enter the username");
        String username = Main.sc.next();
        FileReader file12 = new FileReader("Fines.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line1;
        while((line1=file23.readLine())!=null){
            if(line1.split(",")[0].equals(username)){
                remove_user.removeLineFromFile("Fines.txt", line1);

            }
        }
        System.out.println("Press any key to continue");
        Main.sc.next();
        Librarian.librarian();


    }
    public static void issued_books_history() throws Exception {
        FileReader file12 = new FileReader("Issue books History.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line1;
        System.out.println("-----------------------------------------------------");
        System.out.printf("%10s %33s","Book Title","Issued Time","Valid Time");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        while ((line1 = file23.readLine()) != null) {
            System.out.format("%10s %40s %40s",line1.split(",")[0],line1.split(",")[1],line1.split(",")[2]);
            System.out.println();
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("Press any key to continue");
        Main.sc.next();
        Librarian.librarian();

    }
    public static void return_book_history() throws Exception {
        FileReader file12 = new FileReader("Return Book.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line1;
        System.out.println("-----------------------------------------------------");
        System.out.printf("%10s %33s","Book Title","Return Time");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        while ((line1 = file23.readLine()) != null) {
            System.out.format("%10s %40s ",line1.split(",")[0],line1.split(",")[1]);
            System.out.println();
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("Press any key to continue");
        Main.sc.next();
        Librarian.librarian();
    }

    }

