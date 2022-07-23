import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.bethecoder.ascii_table.ASCIITable;

public class Login_History {
    public static void login_history()throws IOException {
        FileReader file11 = new FileReader("Login History.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;


        System.out.println("-----------------------------------------------------");
        System.out.printf("%10s %33s","USERNAME","LOGIN TIME");
        System.out.println();
        System.out.println("-----------------------------------------------------");


        while ((line = file22.readLine()) != null) {
                System.out.format("%10s %40s",line.split(",")[0],line.split(",")[1]);

                System.out.println();

            System.out.println("-----------------------------------------------------");
        }
        }


}

