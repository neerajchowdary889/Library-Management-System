import java.sql.*;
import java.text.BreakIterator;
import java.util.Formatter;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
public class Best_sellers {

    static String Best_seller_String;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";


    public static void Best_Sellers() throws Exception{
        System.out.println("\033[0;1m" + "Best Sellers: "+ "\u001B[0m");
        System.out.println("1. Fiction Books \n2. Non Fiction Books \n3. Happiness Books \n4. Back >>> ");
        System.out.println("Enter Number: ");
        int booktype = sc.nextInt();

        switch(booktype){
            case 1:
                Fiction_books();
                break;

            case 2:
                NonFiction_books();
                break;

            case 3:
                Happiness_books();
                break;

            case 4:
                View_book_Genre.viewbookgenre();
                break;

            default:
                System.out.println("Wrong entry...");
                Library.library();
                break;
        }
    }

    static void Fiction_books() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        Formatter fmt = new Formatter();
        String BestSeller_query1 = "SELECT * FROM bestseller_withcategories WHERE Genre = 'Fiction';";
        ResultSet rs = st.executeQuery(BestSeller_query1);
        rs.next();

        while(rs.next()){
            String name = rs.getString(1);
            double Rating = rs.getDouble(3);
            int review = rs.getInt(4);
            String Genre = rs.getString(7);
            String Author = rs.getString(2);
            // int price = rs.getInt(5);
            int year = rs.getInt(6);
            Best_seller_String = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Author, Rating, "    ",review, year, Genre);
            System.out.println(Best_seller_String+"\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Best_Sellers();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }

    static void NonFiction_books() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        Formatter fmt = new Formatter();
        String BestSeller_query2 = "SELECT * FROM bestseller_withcategories WHERE Genre = 'Non Fiction';";
        ResultSet rs = st.executeQuery(BestSeller_query2);
        rs.next();

        while(rs.next()){
            String name = rs.getString(1);
            double Rating = rs.getDouble(3);
            int review = rs.getInt(4);
            String Genre = rs.getString(7);
            String Author = rs.getString(2);
            // int price = rs.getInt(5);
            int year = rs.getInt(6);
            Best_seller_String = String.format("%20s %20s %11s %18s %15s %15s %15s %12s",name,"\n", Author, Rating, "    ",review, year, Genre);
            System.out.println(Best_seller_String+"\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Best_Sellers();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }

    static void Happiness_books() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" ");
        }
        Statement st = connection.createStatement();
        String BestSeller_query3 = "SELECT * FROM bestseller_happinessbooks";
        ResultSet rs = st.executeQuery(BestSeller_query3);
        rs.next();

        while(rs.next()){
            String name = rs.getString(1);
            String Fav_quote = rs.getString(3);
            String Author = rs.getString(2);
            System.out.println("Book Name: "+name+"\n");
            System.out.println("Author: "+Author+ "\n");
            System.out.println("Favorite Quote: "+ Fav_quote+"\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("PRESS 1 TO Return  \nPRESS 0 TO GO TO getout");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Best_Sellers();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }
}