import java.sql.*;
import java.text.BreakIterator;
import java.util.Formatter;
import java.util.Scanner;
import java.util.*;
class Famouspep_recommend {
    static String str;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void Famouspeople_recommends() throws Exception{
        System.out.println("\033[0;1m" + "Famous People Recommendations: "+ "\u001B[0m");
        System.out.println("Type Famous personality Name: \n(this will display if that person recommended book is in our Library");
        String pep = sc.nextLine();
        String str = "SELECT * FROM famouspeople_recommends WHERE Recommender like  '%"+pep+"%';";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(str);
        rs.next();

        while(rs.next()){

            String name = rs.getString(1);
            String Author = rs.getString(2);
            String GoogleID = rs.getString(3);
            String Recommeder = rs.getString(4);
            int Recommeder_count = rs.getInt(5);
            String Category = rs.getString(6);
            int Year = rs.getInt(7);
            int pages = rs.getInt(8);
            System.out.println("Book Title : "+name+"\n");
            System.out.println("Book Author : "+Author+"\n");
            System.out.println("Book GoogleID : "+GoogleID+" --->(copy and paste in google to get the book)\n");
            System.out.println("Book Recommender : "+Recommeder+"\n");
            System.out.println("Book Recommender count : "+Recommeder_count+"\n");
            System.out.println(" Category : "+Category+"\n");
            System.out.println("Published Year : "+Year+"\n");
            System.out.println("Number of Pages : "+pages);
            System.out.println("-----------------------------------------------------------");

        }

        try{
            System.out.println("PRESS 1 TO Return  \nPRESS 0 TO Rerun");
            int back = sc.nextInt();
            switch (back){
                case 0:
                    Famouspeople_recommends();
                    break;

                case 1:
                    View_book_Genre.viewbookgenre();
                    break;

                default:
                    System.out.println("Error input....");
                    Library.library();
                    break;
            }
        }
        catch(Exception e){
            System.out.println("...");
        }
    }
}