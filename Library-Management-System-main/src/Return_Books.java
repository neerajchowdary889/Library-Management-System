import com.bethecoder.ascii_table.ASCIITable;

import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Return_Books {
static String Title;
static String Title1;
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";
    public static void returnbook() throws Exception {
        FileReader file24 = new FileReader("Issue book History.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line1;
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
        System.out.println("Do you want to return this book? \nPress 1 to return \nPress 0 to return another book");
        int choice = Main.sc.nextInt();
        if (choice == 1) {
            if (quantity == 2) {
                System.out.println("\033[0;1m" + "Book cant be returned \n" + "\u001B[0m");
                Library.library();
            } else {
                String query2 = "UPDATE aliens_sifi SET quantity=quantity+1 WHERE Title='" + Title + "'";
                Statement stm1 = connection.createStatement();
                stm1.executeUpdate(query2);
                System.out.println("\033[0;1m" + "Book is returned \n" + "\u001B[0m");
                FileWriter file26 = new FileWriter("Return Book.txt", true);
                BufferedWriter file27 = new BufferedWriter(file26);
                PrintWriter file28 = new PrintWriter(file27);
                LocalDateTime now = LocalDateTime.now();
                file28.println(Title+","+now);
                file28.close();


            }

            while((line1= file25.readLine())!=null){
                if(line1.contains(Title)){
                    String[] array = line1.split(",", 3);
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  --  HH:mm:ss");
                    LocalDateTime dateTime = LocalDateTime.parse(array[2], formatter);


                    if(now.isAfter(dateTime)){
                        System.out.println("\033[0;1m" + "Book is overdue You will be charged Rs 100/- \n" + "\u001B[0m");
                        FileWriter file29 = new FileWriter("Fines.txt", true);
                        BufferedWriter file30 = new BufferedWriter(file29);
                        PrintWriter file31 = new PrintWriter(file30);
                        file31.println(Login.libraryusername+","+"Rs 100/-");
                        file31.close();

                    }
                    else{
                        System.out.println("\033[0;1m" + "Book is not overdue \n" + "\u001B[0m");
                        Library.library();
                    }
                }



            }

        }
    }
}
