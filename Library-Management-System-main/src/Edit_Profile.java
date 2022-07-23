import java.io.*;

public class Edit_Profile extends ViewUser_Account{
    public static void edit_profile() throws Exception {
        System.out.println("[1]Edit Username");
        System.out.println("[2]Edit Password");
        System.out.println("[3]Edit Address");
        System.out.println("[4]Edit Age");
        System.out.println("[5]Back");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                edit_username();
                break;
            case 2 :
               edit_password();
                break;
            case 3 :
              edit_address();
                break;
            case 4 :
               edit_age();
                break;
            case 5 :
                Library.library();
                break;
            default:
                System.out.println("Wrong entry");
        }
    }
    public static void edit_username() throws Exception {
        System.out.println("ENTER YOUR NEW USERNAME");
        String ignore = Main.sc.nextLine();
        String new_username = Main.sc.nextLine();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line2;

        while ((line = file22.readLine()) != null) {

            if (line.contains(libraryusername)) {

                String[] arr = line.split(",", 5);
                arr[0] = new_username;
                String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
                remove_user.removeLineFromFile("USERNAME.txt", line);
                FileWriter file02 = new FileWriter("USERNAME.txt", true);
                BufferedWriter file03 = new BufferedWriter(file02);
                file03.write(new_line);
                file03.close();
libraryusername = new_username;




            }

            else{
                while ((line2 = file23.readLine()) != null) {
                    if (line2.contains(libraryusername)) {
                        String[] arr = line2.split(",", 6);
                        arr[0] = new_username;
                        String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5];
                        remove_user.removeLineFromFile("Membership.txt", line2);
                        FileWriter file62 = new FileWriter("Membership.txt", true);
                        BufferedWriter file63 = new BufferedWriter(file62);
                        file63.write(new_line);
                        file63.close();

                        libraryusername = new_username;

                    }

                }
            }

        }
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line3 = file25.readLine()) != null) {
            if (line3.contains(libraryusername)) {
                String[] arr = line3.split(",", 2);
                arr[0] = new_username;
                String new_line = arr[0] + "," + arr[1];
                remove_user.removeLineFromFile("Login.txt", line3);
                FileWriter file62 = new FileWriter("Login.txt", true);
                BufferedWriter file63 = new BufferedWriter(file62);
                file63.write(new_line);
                file63.close();

                System.out.println("Press any key to continue");
                Main.sc.nextLine();
                Library.library();
            }
        }
    }
    public static void edit_password() throws Exception {
        System.out.println("ENTER NEW PASSWORD");
        String ignore = Main.sc.nextLine();
        String new_password = Main.sc.nextLine();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line2;
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line = file22.readLine()) != null) {
            if (line.contains(libraryusername)) {
                String[] arr = line.split(",", 5);
                arr[1] = new_password;
                String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
                remove_user.removeLineFromFile("USERNAME.txt", line);
                FileWriter file02 = new FileWriter("USERNAME.txt", true);
                BufferedWriter file03 = new BufferedWriter(file02);
                file03.write(new_line);
                file03.close();



            }

            else{
                while ((line2 = file23.readLine()) != null) {
                    if (line2.contains(libraryusername)) {
                        String[] arr = line2.split(",", 6);
                        arr[1] = new_password;
                        String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5];
                        remove_user.removeLineFromFile("Membership.txt", line2);
                        FileWriter file62 = new FileWriter("Membership.txt", true);
                        BufferedWriter file63 = new BufferedWriter(file62);
                        file63.write(new_line);
                        file63.close();

                    }

                }
            }

        }
        while ((line3 = file25.readLine()) != null) {
            if (line3.contains(libraryusername)) {
                String[] arr = line3.split(",", 2);
                arr[1] = new_password;
                String new_line = arr[0] + "," + arr[1];
                remove_user.removeLineFromFile("Login.txt", line3);
                FileWriter file62 = new FileWriter("Login.txt", true);
                BufferedWriter file63 = new BufferedWriter(file62);
                file63.write(new_line);
                file63.close();

                System.out.println("Press any key to continue");
                Main.sc.nextLine();
                Library.library();
            }
        }



    }
    public static void edit_address() throws Exception {
        System.out.println("ENTER YOUR NEW ADDRESS");
        String ignore = Main.sc.nextLine();
        String new_address = Main.sc.nextLine();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line2;
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line = file22.readLine()) != null) {
            if (line.contains(libraryusername)) {
                String[] arr = line.split(",", 5);
                arr[4] = new_address;
                String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
                remove_user.removeLineFromFile("USERNAME.txt", line);
                FileWriter file02 = new FileWriter("USERNAME.txt", true);
                BufferedWriter file03 = new BufferedWriter(file02);
                file03.write(new_line);
                file03.close();

                System.out.println("Press any key to continue");
                Main.sc.nextLine();
                Library.library();

            }

            else{
                while ((line2 = file23.readLine()) != null) {
                    if (line2.contains(libraryusername)) {
                        String[] arr = line2.split(",", 6);
                        arr[2] = new_address;
                        String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5];
                        remove_user.removeLineFromFile("Membership.txt", line2);
                        FileWriter file62 = new FileWriter("Membership.txt", true);
                        BufferedWriter file63 = new BufferedWriter(file62);
                        file63.write(new_line);
                        file63.close();

                        System.out.println("Press any key to continue");
                        Main.sc.nextLine();
                        Library.library();
                    }

                }
            }

        }


    }
    public static void edit_age() throws Exception {
        System.out.println("ENTER YOUR NEW AGE");
        String ignore = Main.sc.nextLine();
        String new_age = Main.sc.nextLine();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line2;
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line = file22.readLine()) != null) {
            if (line.contains(libraryusername)) {
                String[] arr = line.split(",", 5);
                arr[3] = new_age;
                String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
                remove_user.removeLineFromFile("USERNAME.txt", line);
                FileWriter file02 = new FileWriter("USERNAME.txt", true);
                BufferedWriter file03 = new BufferedWriter(file02);
                file03.write(new_line);
                file03.close();

                System.out.println("Press any key to continue");
                Main.sc.nextLine();
                Library.library();

            }

            else{
                while ((line2 = file23.readLine()) != null) {
                    if (line2.contains(libraryusername)) {
                        String[] arr = line2.split(",", 6);
                        arr[4] = new_age;
                        String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5];
                        remove_user.removeLineFromFile("Membership.txt", line2);
                        FileWriter file62 = new FileWriter("Membership.txt", true);
                        BufferedWriter file63 = new BufferedWriter(file62);
                        file63.write(new_line);
                        file63.close();

                        System.out.println("Press any key to continue");
                        Main.sc.nextLine();
                        Library.library();
                    }

                }
            }

        }

    }


}
