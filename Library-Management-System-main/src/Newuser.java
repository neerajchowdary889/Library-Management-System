import java.io.IOException;

class Newuser extends Main{
    public static void newuser() throws Exception {
        System.out.println("Welcome to Garuda Library ");
        System.out.println("[1] Guest Reader \n[2] Create Account \n[3] Take Membership \n[4] Back \n[5] Exit");
        int newuser = sc.nextInt();

        switch (newuser){
            case 1 :
                Guest_Reader.Guestreader();
                break;

            case 2 :
                Create_Account.create();
                break;

            case 3 :
                Take_Membership.Takemembership();
                break;

            case 4 :
                Mainpage.mainpage();
                break;

            case 5 :
                Logout();
                break;

            default:
                System.out.println("Wrong entry...");
        }
    }
}
