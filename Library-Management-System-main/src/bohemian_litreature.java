import java.sql.*;
import java.text.BreakIterator;
import java.util.Formatter;
import java.util.Scanner;
class bohemian_literature{

    static String bohemian_literature_string;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void Bohemian_literature() throws SQLException, ClassNotFoundException{
        System.out.println("\033[0;1m" + "Bohemian Literature: "+ "\u001B[0m");
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM bohemian_literature LIMIT  0,50;";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        try{
            while(rs.next()){
                String name = rs.getString(3);
                String Author = rs.getString(2);
                System.out.println("Book Title : "+ name + "\n");
                System.out.println("Author : "+ Author+"\n");
                System.out.println("-------------------------------------------------");
            }
            System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
            System.out.println("Type Number: ");
            int next = sc.nextInt();
            if(next == 1){
                next_();
            }
            else if (next == 0){
                View_book_Genre.viewbookgenre();
            }
            else{
                System.out.println("Wrong entry");
                Library.library();
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("...");
        }
    }


    public static void next_() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query1 = "SELECT * FROM bohemian_literature LIMIT 50 OFFSET 51;";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query1);
        rs.next();
        while(rs.next()){
            String name = rs.getString(3);
            String Author = rs.getString(2);
            System.out.println("Book Title : "+ name + "\n");
            System.out.println("Author : "+ Author+"\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
        System.out.println("Type Number: ");
        int next = sc.nextInt();
        if(next == 1){
            next_2();
        }

        else if (next == 0){
            View_book_Genre.viewbookgenre();
        }

        else{
            System.out.println("Wrong entry");
            Library.library();
        }

    }

    public static void next_2() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query2 = "SELECT * FROM bohemian_literature LIMIT 50 OFFSET 101;";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query2);
        rs.next();
        while(rs.next()){
            String name = rs.getString(3);
            String Author = rs.getString(2);
            System.out.println("Book Title : "+ name + "\n");
            System.out.println("Author : "+ Author+"\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
        System.out.println("Type Number: ");
        int next = sc.nextInt();
        if(next == 1){
            next_3();
        }
        else if (next == 0){
            View_book_Genre.viewbookgenre();
        }
        else{
            System.out.println("Wrong entry");
            Library.library();
        }
    }


    public static void next_3() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query3 = "SELECT * FROM bohemian_literature LIMIT 50 OFFSET 151;";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query3);
        rs.next();
        while(rs.next()){
            String name = rs.getString(3);
            String Author = rs.getString(2);
            System.out.println("Book Title : "+ name + "\n");
            System.out.println("Author : "+ Author+"\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("PRESS 1 TO RERUN \nPRESS 0 TO GO TO BACK");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Bohemian_literature();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }
}