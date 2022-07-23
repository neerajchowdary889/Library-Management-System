import java.util.Random;
public class Random1 extends Main {
    static int a;
    static  int b;
    public static int random() {
            int min = 1000;
            int max = 9999;
             b = (int)(Math.random()*(max-min+1)+min);
            return b;
        }

        public static String Username(){
        String Username = "GuestReader"+b;
        return Username;
        }
    public static String password(){
    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    int length = 10;
    for(int i = 0; i < length; i++) {
        int index = random.nextInt(alphaNumeric.length());
        char randomChar = alphaNumeric.charAt(index);
        sb.append(randomChar);
    }

    String randomString = sb.toString();
    return randomString;
}

    }


