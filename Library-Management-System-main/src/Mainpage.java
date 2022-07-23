import java.io.IOException;

class Mainpage extends Main{

    public static void mainpage() throws Exception {

        System.out.println("\033[0;1m"+"\u001B[33m" + "                                            LIBRARY MANAGEMENT SYSTEM (LMS) " + "\u001B[0m"+"\n");
        System.out.println("\033[0;1m"+"\u001B[44m"+ "\u001B[30m"+"Garuda Library: " + "\u001B[0m"+"\n");

        System.out.println("[1] New User \n[2] Login User \n[3] Logout \n[4] Librarian Login");
        int login = sc.nextInt();

        switch (login){
            case 1 :
                Newuser.newuser();
                break;

            case 2 :
                Login.login();
                break;

            case 3 :
                Logout.logout();
                break;

            case 4 :
                if(Librarian_Login.librarian_login()){
                    Librarian.librarian();
                }
                else{
                    System.out.println("Wrong Details");
                    break;
                }
                break;

            default:
                System.out.println("Wrong entry");
        }
    }


}