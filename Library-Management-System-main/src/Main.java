import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws Exception {
       Mainpage.mainpage();
    }
    static int b;
    static Scanner sc = new Scanner(System.in);

   static String garuda = "\033[0;1m"+"\u001B[33m" + "Garuda Library: " + "\u001B[0m" ;


    public static void Logout() throws IOException {

        System.out.println("\033[0;1m"+"Have a Good day, Bye...");
        Slogans.main(null);
    }
}
