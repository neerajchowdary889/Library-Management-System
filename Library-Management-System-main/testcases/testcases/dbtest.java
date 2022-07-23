
package testcases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql. ResultSet;
import java.sql.Statement;

public class dbtest {

            public static void main(String[] args) throws Exception {
                String url = "jdbc:mysql://localhost:3306/neerajdb";

                String uname = "root";
                String pass = "12345678";
                Class. for Name("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();
                String query = "SELECT * FROM neerajdb.engineering_books";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    System.out.println(rs.getInt(columnIndex:1));
                }
                st.close();
                con.close();
            }
        }

