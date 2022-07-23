import java.sql.*;
import java.text.BreakIterator;
import java.util.Formatter;
import java.util.Scanner;
class Marvel_Comics {
    static Scanner sc = new Scanner(System.in);
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";
    public static void Marvel_comics() throws SQLException, ClassNotFoundException{
        System.out.println("\033[0;1m" + "Comic: "+ "\u001B[0m");
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM marvel_comics LIMIT  0,35;";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        try{
            while(rs.next()){
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

                System.out.println("Book Title: "+name+"\n");
                System.out.println("Book Issued Title: "+issuedtitle+"\n");
                System.out.println("Book Penciler: "+penciler+"\n");
                System.out.println("Book Writer: "+writer+"\n");
                System.out.println("Book CoverArtist: "+coverartist+"\n");
                System.out.println("Book Active Year: "+activeyear+"\n");
                System.out.println("Book Publish Year: "+publishedyear+"\n");
                System.out.println("Book Imprint: "+Imprint+"\n");
                System.out.println("Book Format: "+format+"                         "+"Rating: "+rating+"\n");
                System.out.println("------------------------------------------------------------------------------");
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
        String query1 = "SELECT * FROM marvel_comics LIMIT 40 OFFSET 36;";
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
            String issuedtitle = rs.getString(3);
            String penciler = rs.getString(5);
            String writer = rs.getString(6);
            String coverartist = rs.getString(7);
            String activeyear = rs.getString(2);
            String publishedyear = rs.getString(4);
            String Imprint = rs.getString(8);
            String format = rs.getString(9);
            String rating = rs.getString(10);

            System.out.println("Book Title: "+name+"\n");
            System.out.println("Book Issued Title: "+issuedtitle+"\n");
            System.out.println("Book Penciler: "+penciler+"\n");
            System.out.println("Book Writer: "+writer+"\n");
            System.out.println("Book CoverArtist: "+coverartist+"\n");
            System.out.println("Book Active Year: "+activeyear+"\n");
            System.out.println("Book Publish Year: "+publishedyear+"\n");
            System.out.println("Book Imprint: "+Imprint+"\n");
            System.out.println("Book Format: "+format+"                         "+"Rating: "+rating+"\n");
            System.out.println("------------------------------------------------------------------------------");
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
        String query2 = "SELECT * FROM marvel_comics LIMIT 60 OFFSET 77;";
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

            System.out.println("Book Title: "+name+"\n");
            System.out.println("Book Issued Title: "+issuedtitle+"\n");
            System.out.println("Book Penciler: "+penciler+"\n");
            System.out.println("Book Writer: "+writer+"\n");
            System.out.println("Book CoverArtist: "+coverartist+"\n");
            System.out.println("Book Active Year: "+activeyear+"\n");
            System.out.println("Book Publish Year: "+publishedyear+"\n");
            System.out.println("Book Imprint: "+Imprint+"\n");
            System.out.println("Book Format: "+format+"                         "+"Rating: "+rating+"\n");
            System.out.println("------------------------------------------------------------------------------");
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
        String query3 = "SELECT * FROM marvel_comics LIMIT 70 OFFSET 136;";
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

            System.out.println("Book Title: "+name+"\n");
            System.out.println("Book Issued Title: "+issuedtitle+"\n");
            System.out.println("Book Penciler: "+penciler+"\n");
            System.out.println("Book Writer: "+writer+"\n");
            System.out.println("Book CoverArtist: "+coverartist+"\n");
            System.out.println("Book Active Year: "+activeyear+"\n");
            System.out.println("Book Publish Year: "+publishedyear+"\n");
            System.out.println("Book Imprint: "+Imprint+"\n");
            System.out.println("Book Format: "+format+"                         "+"Rating: "+rating+"\n");
            System.out.println("------------------------------------------------------------------------------");
        }
        System.out.println("PRESS 1 TO RERUN \nPRESS 0 TO GO TO BACK");
        int back = sc.nextInt();
        switch (back){
            case 0:
                View_book_Genre.viewbookgenre();
                break;

            case 1:
                Marvel_comics();
                break;

            default:
                System.out.println("Error input....");
                Library.library();
                break;
        }
    }
}