import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add_Books {
    static String Genre;
    static String Pages;
    static String Type;
    static String Description;
  static  String Date;
  static String Imprint;
    static String Price;
    static String Format;
  static String Artist;
  static String Penciler;
    static  String Title;
    static String Comic;
    static  String Author;
    static  String Language;
    static  String Rating;
    static  String Voters;
    static  String Year;
    static final String url = "jdbc:mysql://localhost:3306/neerajdb";
    static final String username = "root";
    static final String password = "12345678";
    public static void add_books() throws Exception {
        System.out.println(" 1. Comics\n 2. Programming Books\n 3. Engineering Books\n 4. Best Sellers\n 5. Time Travel\n 6. Aliens Sifi\n 7. Bohemian Literature\n 8. Everyday Reads\n 9. Back <<<");
        int x1 = Main.sc.nextInt();
        switch (x1) {
            case 1:
                Comics();
                break;
            case 2:
                Programming_books();
                break;
            case 3:
                Engineering_books();
                break;
            case 4:
                Best_Sellers();
                break;
            case 5:
                Time_travel();
                break;
            case 6:
                Aliens_Scifi();
                break;
            case 7:
                Bohemian_literature();
                break;
            case 8:
                Everydayreads();
                break;
            case 9:
                Librarian.librarian();
            default:
                System.out.println("\033[0;1m" + "Wrong Entry.... " + "\u001B[0m");
                System.out.println("you are redireted to Mainpage....");
                Mainpage.mainpage();
                break;
        }

    }
    public static void Comics() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");

        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Comic Name: ");
            Comic = Main.sc.nextLine();
            if (Comic.equals("")) {
                System.out.println("\033[0;1m" + "Enter Name to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Issue Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Publish_date: ");
            Date = Main.sc.nextLine();
            if (Date.equals("")) {
                System.out.println("\033[0;1m" + "Enter Publish Date to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Penciler: ");
            Penciler = Main.sc.nextLine();
            if (Penciler.equals("")) {
                System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Writer: ");
            Author = Main.sc.nextLine();
            if (Author.equals("")) {
                System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Covered Artist: ");
            Artist = Main.sc.nextLine();
            if (Artist.equals("")) {
                System.out.println("\033[0;1m" + "Enter Artist to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the  Imprint: ");
            Imprint = Main.sc.nextLine();
            if (Imprint.equals("")) {
                System.out.println("\033[0;1m" + "Enter Imprint to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the  Format: ");
            Format = Main.sc.nextLine();
            if (Format.equals("")) {
                System.out.println("\033[0;1m" + "Enter Artist to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Rating: ");
            Rating = Main.sc.nextLine();
            if (Rating.equals("")) {
                System.out.println("\033[0;1m" + "Enter Rating to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Year: ");
            Year = Main.sc.nextLine();
            if (Year.equals("")) {
                System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Price: ");
            Price = Main.sc.nextLine();
            if (Price.equals("")) {
                System.out.println("\033[0;1m" + "Enter Price to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        String Insert = "INSERT INTO marvel_comics(Comic_Name, Active_year, Issue_title, Publish_date,Penciler,Writer,Cover_artist,Imprint,Format_,Rating,Price) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement a = connection.prepareStatement(Insert);
        a.setString(1,Comic);
        a.setString(2,Year);
        a.setString(3,Title);
        a.setString(4,Date);
        a.setString(5,Penciler);
        a.setString(6,Author);
        a.setString(7,Artist);
        a.setString(8,Imprint);
        a.setString(9,Format);
        a.setString(10,Rating);
        a.setString(11,Price);


        a.executeUpdate();
        System.out.println("Inserted....");
        Librarian.librarian();
    }
    public static void Programming_books() throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");

        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Description: ");
            Description = Main.sc.nextLine();
            if (Description.equals("")) {
                System.out.println("\033[0;1m" + "Enter Description to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Number of Pages: ");
            Pages = Main.sc.nextLine();
            if (Pages.equals("")) {
                System.out.println("\033[0;1m" + "Enter Pages to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Rating: ");
            Rating = Main.sc.nextLine();
            if (Rating.equals("")) {
                System.out.println("\033[0;1m" + "Enter Rating to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter number of Reviews: ");
            Voters = Main.sc.nextLine();
            if (Voters.equals("")) {
                System.out.println("\033[0;1m" + "Enter number of Reviews to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter Type: ");
            Type = Main.sc.nextLine();
            if (Type.equals("")) {
                System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        String Insert = "INSERT INTO programming_books(Rating, Reviews, Book_Title, Description_,Pages,Type_,Price) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement a = connection.prepareStatement(Insert);
        a.setString(1,Rating);
        a.setString(2,Voters);
        a.setString(3,Title);
        a.setString(4,Description);
        a.setString(5,Pages);
        a.setString(6,Type);
        a.setString(7,Price);
        a.executeUpdate();
        System.out.println("Inserted....");

    }
    public static void Engineering_books() throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");

        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Author: ");
            Author = Main.sc.nextLine();
            if (Author.equals("")) {
                System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Language: ");
            Language = Main.sc.nextLine();
            if (Language.equals("")) {
                System.out.println("\033[0;1m" + "Enter Language to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Publisher: ");
            Penciler = Main.sc.nextLine();
            if (Penciler.equals("")) {
                System.out.println("\033[0;1m" + "Enter Publisher to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter number of Pages: ");
            Pages = Main.sc.nextLine();
            if (Voters.equals("")) {
                System.out.println("\033[0;1m" + "Enter number of Pages to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter your Year: ");
            Year = Main.sc.nextLine();
            if (Year.equals("")) {
                System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the File Format: ");
            Format = Main.sc.nextLine();
            if (Format.equals("")) {
                System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        String Insert = "INSERT INTO engineering_books(Title, Author, Pages, Publisher,Year_,Languages,File_) VALUES(?,?,?,?,?)";
        PreparedStatement a = connection.prepareStatement(Insert);
        a.setString(1,Title);
        a.setString(2,Author);
        a.setString(3,Pages);
        a.setString(4,Penciler);
        a.setString(5,Year);
        a.setString(6,Language);
        a.setString(7,Format);
        a.executeUpdate();
        System.out.println("Inserted....");

    }
    public static void Best_Sellers() throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.cj.jdbc.Driver");

        int numb = 0;
        int pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Title: ");
            Title = Main.sc.nextLine();
            if (Title.equals("")) {
                System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Author: ");
            Author = Main.sc.nextLine();
            if (Author.equals("")) {
                System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Gerne: ");
            Genre = Main.sc.nextLine();
            if (Genre.equals("")) {
                System.out.println("\033[0;1m" + "Enter Gerne to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Rating: ");
            Rating = Main.sc.nextLine();
            if (Rating.equals("")) {
                System.out.println("\033[0;1m" + "Enter Rating to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter the Price: ");
            Price = Main.sc.nextLine();
            if (Price.equals("")) {
                System.out.println("\033[0;1m" + "Enter Price to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter number of Reviews: ");
            Voters = Main.sc.nextLine();
            if (Voters.equals("")) {
                System.out.println("\033[0;1m" + "Enter number of Reviews to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        while (numb == pass) {
            System.out.println("Enter your Year: ");
            Year = Main.sc.nextLine();
            if (Year.equals("")) {
                System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        String Insert = "INSERT INTO bestseller_withcategories(Name_, Author, UserRating,Reviews,Price,Years,Genre) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement a = connection.prepareStatement(Insert);
        a.setString(1,Title);
        a.setString(2,Author);
        a.setString(3,Rating);
        a.setString(4,Voters);
        a.setString(5,Price);
        a.setString(6,Year);
        a.setString(7,Genre);
        a.executeUpdate();
        System.out.println("Inserted....");



    }
public static void Time_travel() throws SQLException, ClassNotFoundException {
    Connection connection = DriverManager.getConnection(url, username, password);
    Class.forName("com.mysql.cj.jdbc.Driver");

    int numb = 0;
    int pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Title: ");
        Title = Main.sc.nextLine();
        if (Title.equals("")) {
            System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Author: ");
        Author = Main.sc.nextLine();
        if (Author.equals("")) {
            System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Language: ");
        Language = Main.sc.nextLine();
        if (Language.equals("")) {
            System.out.println("\033[0;1m" + "Enter Language to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Rating: ");
        Rating = Main.sc.nextLine();
        if (Rating.equals("")) {
            System.out.println("\033[0;1m" + "Enter Rating to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter number of voters: ");
        Voters = Main.sc.nextLine();
        if (Voters.equals("")) {
            System.out.println("\033[0;1m" + "Enter number of Voters to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter your Year: ");
        Year = Main.sc.nextLine();
        if (Year.equals("")) {
            System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }

    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Gerne: ");
        Genre = Main.sc.nextLine();
        if (Genre.equals("")) {
            System.out.println("\033[0;1m" + "Enter Gerne to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    String Insert = "INSERT INTO timetravel(Title, Author, Language_, Review,Voters,Year_,Genres) VALUES(?,?,?,?,?,?,?)";
    PreparedStatement a = connection.prepareStatement(Insert);
    a.setString(1,Title);
    a.setString(2,Author);
    a.setString(3,Language);
    a.setString(4,Rating);
    a.setString(5,Voters);
    a.setString(6,Year);
    a.setString(7,Genre);
    a.executeUpdate();
    System.out.println("Inserted....");


    }

public static void Aliens_Scifi() throws SQLException, ClassNotFoundException {
    Connection connection = DriverManager.getConnection(url, username, password);
    Class.forName("com.mysql.cj.jdbc.Driver");

    int numb = 0;
    int pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Title: ");
        Title = Main.sc.nextLine();
        if (Title.equals("")) {
            System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Author: ");
        Author = Main.sc.nextLine();
        if (Author.equals("")) {
            System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Language: ");
        Language = Main.sc.nextLine();
        if (Language.equals("")) {
            System.out.println("\033[0;1m" + "Enter Language to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Rating: ");
        Rating = Main.sc.nextLine();
        if (Rating.equals("")) {
            System.out.println("\033[0;1m" + "Enter Rating to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter number of voters: ");
        Voters = Main.sc.nextLine();
        if (Voters.equals("")) {
            System.out.println("\033[0;1m" + "Enter number of Voters to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter your Year: ");
        Year = Main.sc.nextLine();
        if (Year.equals("")) {
            System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    String Insert = "INSERT INTO aliens_sifi(Title, Author, Language_, Review,Voters,Year_) VALUES(?,?,?,?,?,?)";
    PreparedStatement a = connection.prepareStatement(Insert);
    a.setString(1,Title);
    a.setString(2,Author);
    a.setString(3,Language);
    a.setString(4,Rating);
    a.setString(5,Voters);
    a.setString(6,Year);
    a.executeUpdate();
    System.out.println("Inserted....");


    }
public static void Bohemian_literature() throws SQLException, ClassNotFoundException {
    Connection connection = DriverManager.getConnection(url, username, password);
    Class.forName("com.mysql.cj.jdbc.Driver");

    int numb = 0;
    int pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Title: ");
        Title = Main.sc.nextLine();
        if (Title.equals("")) {
            System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Author: ");
        Author = Main.sc.nextLine();
        if (Author.equals("")) {
            System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }

    String Insert = "INSERT INTO bohemian_literature(author, title) VALUES(?,?)";
    PreparedStatement a = connection.prepareStatement(Insert);
    a.setString(1,Author);
    a.setString(2,Title);

    a.executeUpdate();
    System.out.println("Inserted....");



    }
public static void Everydayreads() throws SQLException, ClassNotFoundException {
    Connection connection = DriverManager.getConnection(url, username, password);
    Class.forName("com.mysql.cj.jdbc.Driver");

    int numb = 0;
    int pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Title: ");
        Title = Main.sc.nextLine();
        if (Title.equals("")) {
            System.out.println("\033[0;1m" + "Enter Title to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Author: ");
        Author = Main.sc.nextLine();
        if (Author.equals("")) {
            System.out.println("\033[0;1m" + "Enter Author to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Language: ");
        Language = Main.sc.nextLine();
        if (Language.equals("")) {
            System.out.println("\033[0;1m" + "Enter Language to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Rating: ");
        Rating = Main.sc.nextLine();
        if (Rating.equals("")) {
            System.out.println("\033[0;1m" + "Enter Rating to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Publisher: ");
        Penciler = Main.sc.nextLine();
        if (Penciler.equals("")) {
            System.out.println("\033[0;1m" + "Enter Publisher to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter number of voters: ");
        Voters = Main.sc.nextLine();
        if (Voters.equals("")) {
            System.out.println("\033[0;1m" + "Enter number of Voters to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter your Date and Year: ");
        Year = Main.sc.nextLine();
        if (Year.equals("")) {
            System.out.println("\033[0;1m" + "Enter Year to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    while (numb == pass) {
        System.out.println("Enter the Number of Pages: ");
        Pages = Main.sc.nextLine();
        if (Pages.equals("")) {
            System.out.println("\033[0;1m" + "Enter Pages to continue \n" + "\u001B[0m");
            pass = 0;
        } else {
            pass = 1;
        }
    }
    pass = 0;
    String Insert = "INSERT INTO everybook(Title, Author, Rating, Voters,Publisher,Pages,Languages,Date_And_Year) VALUES(?,?,?,?,?,?,?,?)";
    PreparedStatement a = connection.prepareStatement(Insert);
    a.setString(1,Title);
    a.setString(2,Author);
    a.setString(3,Rating);
    a.setString(4,Voters);
    a.setString(5,Penciler);
    a.setString(6,Pages);
    a.setString(7,Language);
    a.setString(8,Year);
    a.executeUpdate();
    System.out.println("Inserted....");


    }

}
