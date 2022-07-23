import com.bethecoder.ascii_table.ASCIITable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDateTime;

public class Issue_Books {

    static String Title;
    static String Title1;
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void issuebook () throws Exception {
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
        String query1 = "SELECT*FROM aliens_sifi WHERE Title='" + Title + "'";
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(query1);
        int quantity = 0;
        while (rs.next()) {
            Title1 = rs.getString(1);
            String Author = rs.getString(2);
            String Language = rs.getString(3);
            String Rating = rs.getString(4);
            String Voters = rs.getString(5);
            String Year = rs.getString(6);
            quantity = rs.getInt(10);
            String[] tableHeaders = {"Title", "Author", "Language", "Rating", "Voters", "Year", "Quantity"};
            String[][] tableData = {
                    {Title1, Author, Language, Rating, Voters, Year, Integer.toString(quantity)}
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("Do you want to issue this book? \nPress 1 to issue \nPress 0 to issue another book");
        int choice = Main.sc.nextInt();
        if (choice == 1) {
            if (quantity == 0) {
                System.out.println("\033[0;1m" + "Book is not available \n" + "\u001B[0m");
                Issue_Books.issuebook();
            } else {

                quantity = quantity - 1;
                String query2 = "UPDATE aliens_sifi SET Quantity='" + quantity + "' WHERE Title='" + Title + "'";
                Statement stm1 = connection.createStatement();
                stm1.executeUpdate(query2);
                System.out.println("\033[0;1m" + "Book Issued Successfully \n" + "\u001B[0m");
                String Time = Current_dateTime.current_dateTime();
                String Return = Current_dateTime.valid_date();
                FileWriter fw = new FileWriter("Issue book History.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(Title + "," + Time + "," + Return);
                pw.close();
                System.out.println("\033[0;1m" + "Your Return Date is " + Return + "\u001B[0m");
                Library.library();
            }

        }
        else if (choice == 0) {
            Issue_Books.issuebook();
        }
        else {
            System.out.println("\033[0;1m" + "Invalid Input \n" + "\u001B[0m");
            Issue_Books.issuebook();
        }



    }
}
