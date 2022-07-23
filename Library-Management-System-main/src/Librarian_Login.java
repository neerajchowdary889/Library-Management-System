class Librarian_Login extends Main {
    static String Librarian_username;
    static String Librarian_password;
    static int pass = 0;
    public static boolean librarian_login() {

        String Librarian_name1 = "Neeraj";
        String Librarian_name2 = "Sushanth";
        String Librarian_name3 = "Tejo";
        String Librarian_name4 = "Reddy";
        String Librarian_name5 = "Santhosh";
        String Librarian_name6 = "Narayana";
        String password_librarian = "Garuda123";
        String Libraian_number = "7093562964";

        String ignore = sc.nextLine();
        int numb = 0;
        while (numb == pass) {
            System.out.println("Username: ");
            Librarian_username = sc.nextLine();
            if (Librarian_username.equals("")) {
                System.out.println("\033[0;1m" + "Enter Username to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter your Password: ");
            Librarian_password = sc.nextLine();
            if (Librarian_password.equals("")) {
                System.out.println("\033[0;1m" + "Enter Password to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }

        if ((Librarian_username.equals(Librarian_name1)  || Librarian_username.equals(Librarian_name2) || Librarian_username.equals(Librarian_name3) ||Librarian_username.equals(Librarian_name4)
                || Librarian_username.equals(Librarian_name5) || Librarian_username.equals(Librarian_name6) )&& Librarian_password.equals(password_librarian)) {

            return true;

        }

        else {

            return false;

        }
    }
}