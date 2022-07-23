import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_Book {
    static String Title;
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void deletebook() throws Exception {
        System.out.println(" 1. Comics\n 2. Programming Books\n 3. Engineering Books\n 4. Best Sellers\n 5. Time Travel\n 6. Aliens Sifi\n 7. Bohemian Literature\n 8. Everyday Reads\n 9. Back <<<");
        int x1 = Main.sc.nextInt();
        switch (x1) {
            case 1:
                Comics();
                break;
            case 2:
                Programming_books();
                break;
            case 3:
                Engineering_books();
                break;
            case 4:
                Best_Sellers();
                break;
            case 5:
                Time_travel();
                break;
            case 6:
                Aliens_Scifi();
                break;
            case 7:
                Bohemian_literature();
                break;
            case 8:
                Everydayreads();
                break;
            case 9:
                Librarian.librarian();
            default:
                System.out.println("\033[0;1m" + "Wrong Entry.... " + "\u001B[0m");
                System.out.println("you are redireted to Mainpage....");
                Mainpage.mainpage();
                break;


        }

        }

    public static void Comics() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM marvel_comics WHERE Issue_title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Programming_books() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM programming_books WHERE Book_Title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Engineering_books() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM engineering_books WHERE Title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Best_Sellers() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM bestseller_withcategories WHERE Name_=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Time_travel() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM timetravel WHERE Title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Aliens_Scifi() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM aliens_scifi WHERE Title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Bohemian_literature() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM Bohemian_literature WHERE title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }
public static void Everydayreads() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String Delete = "DELETE FROM everybook WHERE Title=?";
        PreparedStatement a = connection.prepareStatement(Delete);
        a.setString(1, Title);
        a.executeUpdate();
        System.out.println("Deleted....");
        Librarian.librarian();
    }



}