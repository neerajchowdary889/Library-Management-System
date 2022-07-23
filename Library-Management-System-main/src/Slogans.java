import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Slogans extends Main {
    public static void main(String[]args) throws IOException {
        Queue<String> Slogans = new LinkedList<>();
        FileReader file11 = new FileReader("Slogans.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        while((line=file22.readLine())!=null){
            Slogans.add(line);

        }
      String remove =  Slogans.remove();
        FileReader file12 = new FileReader("Slogans.txt");
        BufferedReader file24 = new BufferedReader(file12);
        String line1;
        while((line1=file24.readLine())!=null)
        {

            if(line1.equals(remove))
            {

                remove_user.removeLineFromFile("Slogans.txt",remove);
            }
        }
        FileWriter file16 = new FileWriter("Slogans.txt",true);
        BufferedWriter file21 = new BufferedWriter(file16);
        PrintWriter file23 = new PrintWriter(file21);
        file23.println(remove);
        file23.close();
        System.out.println(remove);


    }
}
