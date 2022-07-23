import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Guest_Reader extends Main {
    static String[] array1;

    static String Phone_Number;
    static int pass = 0 ;
    static HashMap<String, String> map1 = new HashMap<>();

    public static void Guestreader() throws Exception {
        FileReader file11 = new FileReader("GuestDetails.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        Scanner sc = new Scanner(System.in);
        Random1.random();

        int numb = 0;




            while (numb == pass) {
                System.out.println("Phone Number: ");
                Phone_Number = sc.nextLine();
                if (Phone_Number.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Phone Number to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }
            pass = 0;


            System.out.println("Welcome " +  "\nAccount  is created Temporarily For one time use\n");
            String username = Random1.Username();
            String password = Random1.password();
            int ID = Random1.random();
            System.out.println("Your ID is " + ID);
        System.out.println("Your Username is " +username);
        System.out.println("Your Password is " + password);
         while((line=file22.readLine())!=null){
            while(line.contains(username)){
              username = Random1.Username();
              }

          }

            FileWriter file1 = new FileWriter("GuestDetails.txt", true);
            BufferedWriter file2 = new BufferedWriter(file1);
            PrintWriter file3 = new PrintWriter(file2);
            file3.println( username+","+password+ "," + Phone_Number+","+ID);
            file3.close();
            FileWriter file15 = new FileWriter("Login.txt", true);
            BufferedWriter file26 = new BufferedWriter(file15);
            PrintWriter file35 = new PrintWriter(file26);
            file35.println(username + "," + password);
            file35.close();
            Mainpage.mainpage();

        }

    }
