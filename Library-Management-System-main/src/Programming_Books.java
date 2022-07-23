import java.sql.*;
import java.text.BreakIterator;
import java.util.Formatter;
import java.util.Scanner;
public class Programming_Books {
    static String Programming_string;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void Programming_books() throws Exception{
        System.out.println("\033[0;1m" + "Programming Books: "+ "\u001B[0m");
        System.out.println("1. High Rated Programing Books \n2. Low Price Books \n"+
                "3. Based on Cover type \n4. View All Books\n5. Go back...");
        System.out.println("Enter Number: ");
        int booktype = sc.nextInt();

        switch(booktype){
            case 1:
                High_rated();
                break;

            case 2:
                Low_price();
                break;

            case 3:
                Cover();
                break;

            case 4:
                all_books();
                break;

            case 5:
                Library.library();
                break;

            default:
                System.out.println("Wrong entry...");
                Library.library();
                break;
        }

    }


    public static void High_rated() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();

        Formatter fmt = new Formatter();

        System.out.println("1. All High rated books\n2. Special Books");

        int highrated = sc.nextInt();


        if (highrated == 1){

            String query1 = "SELECT * FROM programming_books WHERE Rating >= 4;";
            ResultSet rs = st.executeQuery(query1);
            rs.next();

            while(rs.next()){
                String name = rs.getString(3);
                String Rating = rs.getString(1);
                String review = rs.getString(2);
                String pages = rs.getString(5);
                String Type = rs.getString(6);
                String price = rs.getString(7);
                Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
                System.out.println(Programming_string+"\n");
            }
            System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
            int back = sc.nextInt();
            switch (back){
                case 0:
                    View_book_Genre.viewbookgenre();
                    break;

                case 1:
                    Programming_books();
                    break;

                default:
                    System.out.println("Error input....");
                    Library.library();
                    break;
            }
        }
        else if(highrated == 2){

            String query2 = "SELECT * FROM programming_books WHERE Rating >= 3.5 AND Reviews >= 200;";
            ResultSet rs = st.executeQuery(query2);
            rs.next();

            while(rs.next()){
                String name = rs.getString(3);
                String Rating = rs.getString(1);
                String review = rs.getString(2);
                String pages = rs.getString(5);
                String Type = rs.getString(6);
                String price = rs.getString(7);
                Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
                System.out.println(Programming_string+"\n");
            }
            System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
            int back = sc.nextInt();
            switch (back){
                case 0:
                    View_book_Genre.viewbookgenre();
                    break;

                case 1:
                    Programming_books();
                    break;

                default:
                    System.out.println("Error input....");
                    Library.library();
                    break;
            }
        }


    }


    public static void Low_price() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        Formatter fmt = new Formatter();
        String query3 = "SELECT * FROM programming_books WHERE Price <= 17;";
        ResultSet rs = st.executeQuery(query3);
        rs.next();

        while(rs.next()){
            String name = rs.getString(3);
            String Rating = rs.getString(1);
            String review = rs.getString(2);
            String pages = rs.getString(5);
            String Type = rs.getString(6);
            String price = rs.getString(7);
            Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
            System.out.println(Programming_string+"\n");
        }
        System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Programming_books();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }


    public static void Cover() throws Exception{
        System.out.println("1. Hardcover\n2. Kindle Edition\n3. Paperback");
        int cover = sc.nextInt();
        if(cover == 1){
            Connection connection = DriverManager.getConnection(url, username, password);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println(" ");
            }
            Statement st = connection.createStatement();

            Formatter fmt = new Formatter();
            String query4 = "SELECT * FROM programming_books WHERE Type_ LIKE '%Hardcover%';";
            ResultSet rs = st.executeQuery(query4);
            rs.next();

            while(rs.next()){
                String name = rs.getString(3);
                String Rating = rs.getString(1);
                String review = rs.getString(2);
                String pages = rs.getString(5);
                String Type = rs.getString(6);
                String price = rs.getString(7);
                Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
                System.out.println(Programming_string+"\n");
            }
            System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
            int back = sc.nextInt();
            switch (back){
                case 0:
                    View_book_Genre.viewbookgenre();
                    break;

                case 1:
                    Programming_books();
                    break;

                default:
                    System.out.println("Error input....");
                    Library.library();
                    break;
            }
        }
        else if(cover == 2){
            Connection connection = DriverManager.getConnection(url, username, password);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println(" ");
            }
            Statement st = connection.createStatement();

            Formatter fmt = new Formatter();

            String query5 = "SELECT * FROM programming_books WHERE Type_ LIKE '%Kindle Edition%';";
            ResultSet rs = st.executeQuery(query5);
            rs.next();

            while(rs.next()){
                String name = rs.getString(3);
                String Rating = rs.getString(1);
                String review = rs.getString(2);
                String pages = rs.getString(5);
                String Type = rs.getString(6);
                String price = rs.getString(7);
                Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
                System.out.println(Programming_string+"\n");
            }
            System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
            int back = sc.nextInt();
            switch (back){
                case 0:
                    View_book_Genre.viewbookgenre();
                    break;

                case 1:
                    Programming_books();
                    break;

                default:
                    System.out.println("Error input....");
                    Library.library();
                    break;
            }
        }
        else if(cover == 3){
            Connection connection = DriverManager.getConnection(url, username, password);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println(" ");
            }
            Statement st = connection.createStatement();

            Formatter fmt = new Formatter();

            String query6 = "SELECT * FROM programming_books WHERE Type_ LIKE '%Paperback%';";
            ResultSet rs = st.executeQuery(query6);
            rs.next();

            while(rs.next()){
                String name = rs.getString(3);
                String Rating = rs.getString(1);
                String review = rs.getString(2);
                String pages = rs.getString(5);
                String Type = rs.getString(6);
                String price = rs.getString(7);
                Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
                System.out.println(Programming_string+"\n");
            }
            System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
            int back = sc.nextInt();
            switch (back){
                case 0:
                    View_book_Genre.viewbookgenre();
                    break;

                case 1:
                    Programming_books();
                    break;

                default:
                    System.out.println("Error input....");
                    Library.library();
                    break;
            }
        }
        else{
            System.out.println("Wrong entry, you are redirected back...");
            Library.library();
        }
    }


    public static void all_books() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        Formatter fmt = new Formatter();
        String query7 = "SELECT * FROM programming_books LIMIT  0,35;";
        ResultSet rs = st.executeQuery(query7);
        rs.next();
        while(rs.next()){
            String name = rs.getString(3);
            String Rating = rs.getString(1);
            String review = rs.getString(2);
            String pages = rs.getString(5);
            String Type = rs.getString(6);
            String price = rs.getString(7);
            Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
            System.out.println(Programming_string+"\n");
        }
        System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout"+
                "\n2. NEXT ROW...");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Programming_books();
                break;


            case 2:
                next_PB();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }


    private static void next_PB() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        Formatter fmt = new Formatter();
        String query8 = "SELECT * FROM programming_books LIMIT 60 OFFSET 36;";
        ResultSet rs = st.executeQuery(query8);
        rs.next();
        while(rs.next()){
            String name = rs.getString(3);
            String Rating = rs.getString(1);
            String review = rs.getString(2);
            String pages = rs.getString(5);
            String Type = rs.getString(6);
            String price = rs.getString(7);
            Programming_string = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Rating, review, "    ",pages, Type, price);
            System.out.println(Programming_string+"\n");
        }
        System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Programming_books();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }
}