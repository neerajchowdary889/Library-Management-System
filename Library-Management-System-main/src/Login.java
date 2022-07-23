import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Login extends Main{
    static int pass = 0;
    static String libraryusername;
    static String librarypassword;
    static String backkey = "03#";
    public static void login() throws Exception {
        Create_Account c = new Create_Account();
        String ignore = sc.nextLine();
        FileReader file11 = new FileReader("Login.txt");
        BufferedReader file22 = new BufferedReader(file11);
        int numb = 0;
        while (numb == pass) {
            System.out.println("Enter your Username: ");
            libraryusername = sc.nextLine();
            if (libraryusername.equals("")) {
                System.out.println("\033[0;1m" + "Enter Username to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        String line;
        List l = new ArrayList();

        HashMap<String, String> map = new HashMap<String, String>();
        String[] arr;
        while((line=file22.readLine())!=null){
            arr = line.split(",",2);
            l.add(arr[0]);
            map.put(arr[0],arr[1]);
        }


        while (true) {
            while (numb == pass) {
                System.out.println("Enter your Password: (Enter 03# to exit to Mainpage...)");
                librarypassword = sc.nextLine();
                if (librarypassword.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Password to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }
            pass=0;
            if (libraryusername.equals(backkey) || librarypassword.equals(backkey)) {

                Mainpage.mainpage();
            }
            String pass =  map.get(libraryusername);
            if (l.contains(libraryusername) && pass.equals(librarypassword)){
                FileWriter file12 = new FileWriter("Login History.txt", true);
                BufferedWriter file23 = new BufferedWriter(file12);
                PrintWriter file34 = new PrintWriter(file23);
                String Time = Current_dateTime.current_dateTime();
                file34.write(libraryusername + "," +Time+ "\n");
                file34.close();
                FileReader file13 = new FileReader("GuestDetails.txt");
                BufferedReader file20 = new BufferedReader(file13);
                String line1;

                while((line=file22.readLine())!=null){
               if (line.contains(libraryusername)){
                     remove_user.removeLineFromFile("Login.txt", line);
                    }
                }
                while ((line1=file20.readLine())!=null){
                    if (line1.contains(libraryusername)){
                        remove_user.removeLineFromFile("GuestDetails.txt", line1);
                    }
                }

                try {
                    Library.library();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                wrong();
            }
            break;
        }
    }
    public static void wrong() throws Exception {
        System.out.println("\033[0;1m" + "Incorrect Credentials.... TryAgain \nPress Enter"+ "\u001B[0m");
        login();
    }
}