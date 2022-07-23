import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Create_Account extends Main{
    static String[] array;
    static String username;
    static int pass =0;
    static String password;
    static String age;
    static String address;



    public static void create() throws Exception {
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line1;
        String [] array1;
        List l1 = new ArrayList();
        while((line1=file25.readLine())!=null){
            array1 = line1.split(",",2);
            l1.add(array1[0]);

        }


        String ignore = sc.nextLine();
        Random1.random();
        int numb = 0;
        while (numb == pass) {
            System.out.println("Username: ");
            username = sc.nextLine();
            if (username.equals("")) {
                System.out.println("\033[0;1m" + "Enter Username to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;

        if(!l1.contains(username)) {
            while (numb == pass) {
                System.out.println("Password: ");
                password = sc.nextLine();
                if (password.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Password to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }
            pass = 0;
            while (numb == pass) {
                System.out.println("Age: ");
                age = sc.nextLine();
                if (age.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Age to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }
            pass = 0;

            while (numb == pass) {
                System.out.println("Address: ");
                address = sc.nextLine();
                if (address.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Address to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }
            System.out.println("Account on " + username + " has been created successfully...");
            System.out.println("Your ID is " + Random1.b);
            String ID = String.valueOf(Random1.b);


            FileWriter file1 = new FileWriter("USERNAME.txt", true);
            BufferedWriter file2 = new BufferedWriter(file1);
            PrintWriter file3 = new PrintWriter(file2);
            file3.println(username + "," + password + "," + ID + "," + age + "," + address);
            file3.close();
            FileReader file11 = new FileReader("USERNAME.txt");
            BufferedReader file22 = new BufferedReader(file11);
            String line;
            while ((line = file22.readLine()) != null) {
                array = line.split(",", 5);
            }
            FileWriter file12 = new FileWriter("Login.txt", true);
            BufferedWriter file23 = new BufferedWriter(file12);
            PrintWriter file34 = new PrintWriter(file23);
            file34.println(array[0] + "," + array[1]);
            file34.close();




            Mainpage.mainpage();


        }
        else{
            System.out.println("\033[0;1m" + "The username is aleady taken enter another one... \nPress Enter"+ "\u001B[0m");
            create();
        }
    }

}