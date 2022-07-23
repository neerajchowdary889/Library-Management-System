import java.sql.*;
import java.text.BreakIterator;
import java.time.Year;
import java.util.Formatter;
import java.util.Scanner;

class Science_Fiction {
    static String string;
    static String scifi;
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";

    public static void Science_fiction() throws Exception{
        System.out.println("\033[0;1m" + "Science Fiction Books: "+ "\u001B[0m");
        System.out.println("1. Aliens \n2. TimeTravel \n3. Alternate Universe \n4. Back <<<");
        int booktype = sc.nextInt();

        switch(booktype){
            case 1:
                Aliens();
                break;

            case 2:
                Timetravel();
                break;

            case 3:
                AlternateUniverse();
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

    public static void Aliens() throws SQLException, ClassNotFoundException{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM aliens_sifi LIMIT  0,45;";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();

        try{
            while(rs.next()){
                String name = rs.getString(1);
                String Author = rs.getString(2);
                String Language = rs.getString(3);
                float review = rs.getFloat(4);
                int voters = rs.getInt(5);
                int year = rs.getInt(6);
                String Url = rs.getString(8);

                System.out.println("Book TItle: "+name+"\n");
                System.out.println("Book Author: "+Author+"\n");
                System.out.println("Language: "+Language+"\n");
                System.out.println("Rating: "+review+"\n");
                System.out.println("Voters: "+voters+"\n");
                System.out.println("Publication Year: "+year+"\n");
                System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
                System.out.println("-----------------------------------------------------------------------------------");

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
        String query1 = "SELECT * FROM aliens_sifi LIMIT 45 OFFSET 46;";
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
            String name = rs.getString(1);
            String Author = rs.getString(2);
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
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
        String query2 = "SELECT * FROM aliens_sifi LIMIT 60 OFFSET 90;";
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
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
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
        String query3 = "SELECT * FROM aliens_sifi LIMIT 70 OFFSET 150;";
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
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("PRESS 1 TO RERUN \nPRESS 0 TO GO TO BACK");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Science_fiction();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }


    public static void Timetravel() throws ClassNotFoundException, SQLException{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM timetravel LIMIT  0,45;";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();

        try{
            while(rs.next()){
                String name = rs.getString(1);
                String Author = rs.getString(2);
                String Language = rs.getString(3);
                float review = rs.getFloat(4);
                int voters = rs.getInt(5);
                int year = rs.getInt(6);
                String Url = rs.getString(8);

                System.out.println("Book TItle: "+name+"\n");
                System.out.println("Book Author: "+Author+"\n");
                System.out.println("Language: "+Language+"\n");
                System.out.println("Rating: "+review+"\n");
                System.out.println("Voters: "+voters+"\n");
                System.out.println("Publication Year: "+year+"\n");
                System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
                System.out.println("-----------------------------------------------------------------------------------");

            }

            System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
            System.out.println("Type Number: ");
            int next = sc.nextInt();
            if(next == 1){
                next_tt();
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


    public static void next_tt() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query1 = "SELECT * FROM timetravel LIMIT 45 OFFSET 46;";
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
            String name = rs.getString(1);
            String Author = rs.getString(2);
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
        System.out.println("Type Number: ");
        int next = sc.nextInt();
        if(next == 1){
            next_tt2();
        }
        else if (next == 0){
            View_book_Genre.viewbookgenre();
        }
        else{
            System.out.println("Wrong entry");
            Library.library();
        }
    }

    public static void next_tt2() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query2 = "SELECT * FROM timetravel LIMIT 60 OFFSET 90;";
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
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
        System.out.println("Type Number: ");
        int next = sc.nextInt();
        if(next == 1){
            next_tt3();
        }
        else if (next == 0){
            View_book_Genre.viewbookgenre();
        }
        else{
            System.out.println("Wrong entry");
            Library.library();
        }
    }


    public static void next_tt3() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query3 = "SELECT * FROM timetravel LIMIT 70 OFFSET 150;";
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
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("PRESS 1 TO RERUN \nPRESS 0 TO GO TO BACK");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Science_fiction();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }


    public static void AlternateUniverse() throws ClassNotFoundException, SQLException{
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM alternate_universe LIMIT  0,45;";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();

        try{
            while(rs.next()){
                String name = rs.getString(1);
                String Author = rs.getString(2);
                String Language = rs.getString(3);
                float review = rs.getFloat(4);
                int voters = rs.getInt(5);
                int year = rs.getInt(6);
                String Url = rs.getString(8);

                System.out.println("Book TItle: "+name+"\n");
                System.out.println("Book Author: "+Author+"\n");
                System.out.println("Language: "+Language+"\n");
                System.out.println("Rating: "+review+"\n");
                System.out.println("Voters: "+voters+"\n");
                System.out.println("Publication Year: "+year+"\n");
                System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
                System.out.println("-----------------------------------------------------------------------------------");

            }

            System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
            System.out.println("Type Number: ");
            int next = sc.nextInt();
            if(next == 1){
                next_au();
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


    public static void next_au() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query1 = "SELECT * FROM alternate_universe LIMIT 45 OFFSET 46;";
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
            String name = rs.getString(1);
            String Author = rs.getString(2);
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
        System.out.println("Type Number: ");
        int next = sc.nextInt();
        if(next == 1){
            next_auau2();
        }
        else if (next == 0){
            View_book_Genre.viewbookgenre();
        }
        else{
            System.out.println("Wrong entry");
            Library.library();
        }
    }

    public static void next_auau2() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query2 = "SELECT * FROM alternate_universe LIMIT 60 OFFSET 90;";
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
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO GO TO NEXT SET \nPRESS 0 to EXIT");
        System.out.println("Type Number: ");
        int next = sc.nextInt();
        if(next == 1){
            next_auau3();
        }
        else if (next == 0){
            View_book_Genre.viewbookgenre();
        }
        else{
            System.out.println("Wrong entry");
            Library.library();
        }
    }


    public static void next_auau3() throws Exception {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String query3 = "SELECT * FROM alternate_universe LIMIT 70 OFFSET 150;";
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
            String Language = rs.getString(3);
            float review = rs.getFloat(4);
            int voters = rs.getInt(5);
            int year = rs.getInt(6);
            String Url = rs.getString(8);

            System.out.println("Book TItle: "+name+"\n");
            System.out.println("Book Author: "+Author+"\n");
            System.out.println("Language: "+Language+"\n");
            System.out.println("Rating: "+review+"\n");
            System.out.println("Voters: "+voters+"\n");
            System.out.println("Publication Year: "+year+"\n");
            System.out.println("Book URL: "+Url+" --->(Copy paste URL in google to get the book)\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("PRESS 1 TO RERUN \nPRESS 0 TO GO TO BACK");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Science_fiction();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }

}