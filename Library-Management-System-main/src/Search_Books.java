import com.bethecoder.ascii_table.ASCIITable;
import java.util.*;
import java.sql.*;

public class Search_Books {
    static String Title;
    static String Title_1;
    static String Title_2;
    static String Title_3;
    static String Title_4;
    static String Title_5;
    static String Title_6;
    static String Title_7;
    static int x2;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void searchbook() throws Exception{
        System.out.println(" 1. Comics\n 2. Programming Books\n 3. Engineering Books\n 4. Best Sellers\n 5. Time Travel\n 6. Aliens Sifi\n 7. Bohemian Literature\n 8. Everyday Reads\n 9. Back <<<");
        int x1 = sc.nextInt();
        x2 = x1;
        System.out.println(x2);
        switch (x1){
            case 1:
                Comics();
                break;
            case 2:
                Programming_BOOKS();
                break;
            case 3:
                ENgineering_Books();
                break;
            case 4:
                BEst_seller();
                break;
            case 5:
                TImetravel();
                break;
            case 6:
                Aliens_Scifi();
                break;
            case 7:
                BOhemian_Literature();
                break;
            case 8:
                EVerydayBooks();
                break;
            case 9:
                Library.library();
                break;
            default:
                System.out.println("\033[0;1m" + "Wrong Entry.... "+ "\u001B[0m");
                System.out.println("you are redireted to Mainpage....");
                Mainpage.mainpage();
                break;
        }


    }
    public static void Aliens_Scifi() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            String ignore = sc.nextLine();
            Title = sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query1= "SELECT*FROM aliens_sifi WHERE Title='"+Title+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query1);
        int quantity = 0;
        while (rs.next()) {
            String Title1 = rs.getString(1);
            String Author = rs.getString(2);
            String Language = rs.getString(3);
            String Rating = rs.getString(4);
            String Voters = rs.getString(5);
            String Year = rs.getString(6);
            quantity = rs.getInt(10);
            String [] tableHeaders = { "Title","Author", "Language", "Rating", "Voters","Year"};
            String[][] tableData = {
                    {  Title1,Author,Language,Rating,Voters,Year }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void Comics() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_1 = sc.nextLine();
            if (Title_1.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query2= "SELECT * FROM marvel_comics WHERE Comic_Name LIKE '"+Title_1+"';";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query2);
        while (rs.next()) {
            String name = rs.getString(1);
            String issuedtitle = rs.getString(3);
            String penciler = rs.getString(5);
            String writer = rs.getString(6);
            String coverartist = rs.getString(7);
            String activeyear = rs.getString(2);
            String publishedyear = rs.getString(4);
            String Imprint = rs.getString(8);
            String format = rs.getString(9);
            String rating = rs.getString(10);
            System.out.println(name+writer);
            String [] tableHeaders = { "Comic_Name","Issued Title", "Penciler", "Writer", "CoverArtist","ActiveYear","Published Year","Imprint","Format","Rating"};
            String[][] tableData = {
                    {  name,issuedtitle,penciler,writer,coverartist,activeyear,publishedyear,Imprint,format,rating }


            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void Programming_BOOKS() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_2 = sc.nextLine();
            if (Title_2.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query3= "SELECT*FROM programming_books WHERE Book_Title LIKE '"+Title_2+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query3);
        int quantity = 0;
        while (rs.next()) {
            String name = rs.getString(3);
            String Rating = rs.getString(1);
            String review = rs.getString(2);
            String pages = rs.getString(5);
            String Type = rs.getString(6);
            String price = rs.getString(7);
            String [] tableHeaders = { "Title","Rating", "Revuew", "Pages", "Type","Price"};
            String[][] tableData = {
                    { name, Rating, review,pages, Type, price }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void BOhemian_Literature() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_3 = sc.nextLine();
            if (Title_3.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query4= "SELECT*FROM bohemian_literature WHERE title LIKE'"+Title_3+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query4);
        int quantity = 0;
        while (rs.next()) {
            String name = rs.getString(3);
            String Author = rs.getString(2);
            String [] tableHeaders = { "Title","Author"};
            String[][] tableData = {
                    {  name, Author }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void BEst_seller() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_4 = sc.nextLine();
            if (Title_4.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query5= "SELECT*FROM bestseller_withcategories WHERE Name_ LIKE'"+Title_4+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query5);
        int quantity = 0;
        while (rs.next()) {
            String name = rs.getString(1);
            double Rating = rs.getDouble(3);
            String Rating1=String.valueOf(Rating);
            int review = rs.getInt(4);
            String review1=String.valueOf(review);
            String Genre = rs.getString(7);
            String Author = rs.getString(2);
            int price = rs.getInt(5);
            String price1=String.valueOf(price);
            int year = rs.getInt(6);
            String year1=String.valueOf(year);
            String [] tableHeaders = { "Title","Author","Rating","Review","Year","Genre"};
            String[][] tableData = {
                    {  name, Author,Rating1,review1,Genre,Author,price1, year1 }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        };
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void ENgineering_Books() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_5 = sc.nextLine();
            if (Title_5.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query6= "SELECT*FROM engineering_books WHERE Title LIKE '"+Title_5+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query6);
        int quantity = 0;
        while (rs.next()) {
            String name = rs.getString(1);
            String Author = rs.getString(2);
            int Page = rs.getInt(3);
            String Page1=String.valueOf(Page);
            String Publisher = rs.getString(4);
            String file = rs.getString(7);
            String [] tableHeaders = { "Title","Author","Pages", "Publisher","File"};
            String[][] tableData = {
                    { name, Author, Page1,Publisher, file }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void EVerydayBooks() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_6 = sc.nextLine();
            if (Title_6.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query7= "SELECT*FROM everybook WHERE Title LIKE '"+Title_6+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query7);
        int quantity = 0;
        while (rs.next()) {
            String name = rs.getString(2);
            String Author = rs.getString(3);
            String Rating = rs.getString(4);
            int voters = rs.getInt(5);
            String voters1 = String.valueOf(voters);
            String Publisher = rs.getString(6);
            String pages = rs.getString(7);
            String date_year = rs.getString(8);
            String [] tableHeaders = { "Title","Author","Voters", "Publisher","Pages","Date"};
            String[][] tableData = {
                    { name, Author, voters1,Publisher, pages,date_year }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }

    public static void TImetravel() throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title_7 = sc.nextLine();
            if (Title_7.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        String query8= "SELECT*FROM timetravel WHERE Title LIKE '"+Title_7+"'";
        Statement stm =connection.createStatement();
        ResultSet rs= stm.executeQuery(query8);
        int quantity = 0;
        while (rs.next()) {
            String name = rs.getString(1);
            String Author = rs.getString(2);
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            String review1 = String.valueOf(review);
            int voters = rs.getInt(5);
            String voters1 = String.valueOf(voters);
            int year = rs.getInt(6);
            String year1 = String.valueOf(year);
            String Url = rs.getString(8);
            String [] tableHeaders = { "Title","Author","Language", "Review","Voters","Year","Url"};
            String[][] tableData = {
                    { name, Author,Language ,review1,voters1, year1,Url }
            };
            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }
        System.out.println("1. Back >>>\n2. Exit...");
        int x = sc.nextInt();
        if(x == 1){
            searchbook();
        }
        else if(x ==2){
            Library.library();
        }
        else{
            System.out.println("Wrong Input, You ar redirected...");
            Library.library();
        }
    }
}