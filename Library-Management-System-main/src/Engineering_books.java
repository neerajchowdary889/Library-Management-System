import java.sql.*;
import java.text.BreakIterator;
import java.util.Formatter;
import java.util.Scanner;
class Engineeringbooks {
    static String string;
    static String Engineering_string;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";
    public static void Engineering_books() throws SQLException, ClassNotFoundException{
        System.out.println("\033[0;1m" + "Engineering Books: "+ "\u001B[0m");
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM engineering_books LIMIT  0,25;";


        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        Formatter fmt = new Formatter();
        string = String.format("%20s %20s %15s %20s %20s %15s","Name", "Author", "Pages", "Publisher", "Year", "File");
        System.out.println(string+"\n");
        int id = rs.getInt(11);
        try{
            while(rs.next()){
                String name = rs.getString(1);
                String Author = rs.getString(2);
                int Page = rs.getInt(6);
                String Page1=String.valueOf(Page);
                String Publisher = rs.getString(7);
                // int year = rs.getInt(8);
                // String year1=String.valueOf(year);
                String file = rs.getString(10);
                Engineering_string = String.format("%20s %20s %11s %18s %15s %15s %15s",name,"\n", Author, Page1, "    ",Publisher, file);
                System.out.println("-------------------------------------------------");
                System.out.println(Engineering_string+"\n");

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
        String query1 = "SELECT * FROM engineering_books LIMIT 30 OFFSET 30;";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query1);
        rs.next();
        Formatter fmt = new Formatter();

        while(rs.next()){
            String name = rs.getString(1);
            String Author = rs.getString(2);
            int Page = rs.getInt(6);
            String Page1=String.valueOf(Page);
            String Publisher = rs.getString(7);
            String file = rs.getString(10);
            Engineering_string = String.format("%20s %20s %11s %18s %15s %15s %15s",name,"\n", Author, Page1, "    ",Publisher, file);
            System.out.println("-------------------------------------------------");
            System.out.println(Engineering_string+"\n");
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
        String query2 = "SELECT * FROM engineering_books LIMIT 60 OFFSET 60;";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query2);
        rs.next();
        Formatter fmt = new Formatter();
        while(rs.next()){
            String name = rs.getString(1);
            String Author = rs.getString(2);
            int Page = rs.getInt(6);
            String Page1=String.valueOf(Page);
            String Publisher = rs.getString(7);
            String file = rs.getString(10);
            Engineering_string = String.format("%20s %20s %11s %18s %15s %15s %15s",name,"\n", Author, Page1, "    ",Publisher, file);
            System.out.println("-------------------------------------------------");
            System.out.println(Engineering_string+"\n");


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
        String query3 = "SELECT * FROM engineering_books LIMIT 70 OFFSET 90;";
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query3);
        rs.next();
        Formatter fmt = new Formatter();
        while(rs.next()){
            String name = rs.getString(1);
            String Author = rs.getString(2);
            int Page = rs.getInt(6);
            String Page1=String.valueOf(Page);
            String Publisher = rs.getString(7);
            String file = rs.getString(10);
            Engineering_string = String.format("%20s %20s %11s %18s %15s %15s %15s",name,"\n", Author, Page1, "    ",Publisher, file);
            System.out.println("-------------------------------------------------");
            System.out.println(Engineering_string+"\n");

        }
        System.out.println("PRESS 1 TO RERUN \nPRESS 0 TO GO TO BACK");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Engineering_books();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }
}