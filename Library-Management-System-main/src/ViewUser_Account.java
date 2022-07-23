import com.bethecoder.ascii_table.ASCIITable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class ViewUser_Account extends Library {
    public static void viewuser_account() throws Exception {

        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;

        while((line=file22.readLine())!=null){
            if(line.split(",")[0].equals(libraryusername)){
                String [] tableHeaders = { "USERNAME","Password", "ADDRESS", "ID", "AGE"};
                String[] arr = line.split(",",5);
                String[][] tableData = {
                        {  arr[0],arr[1] ,arr[4], arr[2], arr[3] }


                };

                ASCIITable.getInstance().printTable(tableHeaders, tableData);


            }

            else{
                FileReader file12 = new FileReader("Membership.txt");
                BufferedReader file23 = new BufferedReader(file12);
                String line1;
                while((line1=file23.readLine())!=null){
                    if(line1.split(",")[0].equals(libraryusername)){

                        String [] tableHeaders = { "USERNAME","Password", "ADDRESS", "VALID FROM", "VALID TO", "ID", "AGE"};
                        String[] arr = line1.split(",",7);
                        String[][] tableData = {
                                {  arr[0],arr[1], arr[2], arr[3], arr[4], arr[5], arr[6] }


                        };

                        ASCIITable.getInstance().printTable(tableHeaders, tableData);

                    }


                }



            }

        }
        System.out.println("[1]Edit Profile");
        System.out.println("[2]Back");
        int choice = sc.nextInt();
        if(choice==1){
            Edit_Profile.edit_profile();
        }
        else if(choice==2){
            Library.library();
        }
        else{
            System.out.println("Invalid Input");
            viewuser_account();
        }

    }


}
