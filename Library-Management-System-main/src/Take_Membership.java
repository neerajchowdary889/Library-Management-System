import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Take_Membership extends Main {

    static String[] array;
    static String garuda = "\033[0;1m" + "\u001B[33m" + "Garuda Library  " + "\u001B[0m";
    static int pass = 0;
    static String Membershipname;
    static String Password_Membershipcard;
    static String date;
    static String age;
    static String address;


    public static void Takemembership() throws Exception {
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line1;
        String[] array1;
        List l1 = new ArrayList();
        while ((line1 = file25.readLine()) != null) {
            array1 = line1.split(",", 2);
            l1.add(array1[0]);

        }


        String ignore = sc.nextLine();
        int numb = 0;
        while (numb == pass) {
            System.out.println("Username: ");
            Membershipname = sc.nextLine();
            if (Membershipname.equals("")) {
                System.out.println("\033[0;1m" + "Enter Username to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }

        pass = 0;
        if(!l1.contains(Membershipname)){
            while (numb == pass) {
                System.out.println("Password: ");
                Password_Membershipcard = sc.nextLine();
                if (Password_Membershipcard.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Password to continue \n" + "\u001B[0m");
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
            pass = 0;
            while (numb == pass) {
                System.out.println("Age: ");
//                String ignore1 = sc.nextLine();
                age = sc.nextLine();

                if (age.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Address to continue \n" + "\u001B[0m");
                    pass = 0;
                }

                else {
                    try {
                        int Age = Integer.parseInt(age);
                        if(Age > 0){
                            pass =1;
                        }else{
                            System.out.println("Invalid age");

                        }


                    } catch (Exception e) {
                        System.out.println("Invalid age");
                        pass =0;
                    }

                }
            }


            String ID = String.valueOf(Random1.random());
            System.out.println("Your ID is " + ID);


//            System.out.println("Your memebership will expire after 30 days i.e on "+DueDate.DueDate());
            System.out.println("\033[0;1m" + "\nPay 65/- to librarian and collect physical membership card");
/*
------------------------------------------------------------------------------------------------------------
|          System.out.println("\033[0;1m"+"\u001B[33m" + "Garuda Library: " + "\u001B[0m");                    |
------------------------------------------------------------------------------------------------------------
|                                                                                                                                                                 |
|  Name          = Menmbershipname;                                                                                                          |
|                                                                                                                                                                 |
|  Issued Date = date;                                                                                                                                 |
|                                                                                                                                                                 |
|                               valid upto 30days from date of issue                                                                          |
|                                                                                                                                                                 |
--------------------------------------------------------------------------------------------------------------
*/String Time = Current_dateTime.current_dateTime();
            System.out.println("------------------------------------------------------------------------------------------------------------\n" +
                    "|                                             " + garuda + "                                                              |\n" +
                    "------------------------------------------------------------------------------------------------------------\n" +
                    "|                                                                                                                         |\n" +
                    "|  Name         = " + Membershipname + "                                                                                  |\n" +
                    "|                                                                                                                         | \n" +
                    "|  Issued Date = " + Time + "                                                                                             |\n" +
                    "|                                                                                                                         |\n" +
                    "|                               valid upto 30days from date of issue                                                      |\n" +
                    "|                                                                                                                         |\n" +
                    "--------------------------------------------------------------------------------------------------------------");
            FileWriter file12 = new FileWriter("Membership.txt", true);
            BufferedWriter file23 = new BufferedWriter(file12);
            PrintWriter file34 = new PrintWriter(file23);

            String Valid_date = Current_dateTime.valid_date();
            file34.println(Membershipname + "," + Password_Membershipcard + "," +address+","+ Time + ","+Valid_date+"," + age + "," + ID);
            file34.close();
            FileReader file11 = new FileReader("Membership.txt");
            BufferedReader file22 = new BufferedReader(file11);
            String line;
            while ((line = file22.readLine()) != null) {
                array = line.split(",", 5);
            }
            FileWriter file02 = new FileWriter("Login.txt", true);
            BufferedWriter file33 = new BufferedWriter(file02);
            PrintWriter file44 = new PrintWriter(file33);
            file44.println(array[0] + "," + array[1]);
            file44.close();
            Mainpage.mainpage();




        }
        else{
            System.out.println("The username is aleady taken enter another one...");
            Takemembership();
        }
    }
}

