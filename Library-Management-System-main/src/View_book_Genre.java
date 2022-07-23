import java.util.Scanner;
public class View_book_Genre extends Library {
    static class Node {
        String data;
        Node previous;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + "\n ");
            current = current.next;
        }
    }

    public static void viewbookgenre() throws Exception {
        Scanner sc = new Scanner(System.in);
        View_book_Genre dList = new View_book_Genre();
        dList.addNode(" 1. Best Sellers\n");
        dList.addNode("2. Bohemian_litreature\n");
        dList.addNode("3. Engineering Books\n");
        dList.addNode("4. Everyday Reads\n");
        dList.addNode("5.  Famous people Recommendations\n");
        dList.addNode("6. Comics\n");
        dList.addNode("7. Programming Books\n");
        dList.addNode("8.  Science Fiction\n");
        dList.display();
        System.out.println("\nSelect the number: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Best_sellers.Best_Sellers();
                break;
            case 2:
                bohemian_literature.Bohemian_literature();
                break;
            case 3:
                Engineeringbooks.Engineering_books();
                break;
            case 4:
                everydayreads.Everydayreads();
                break;
            case 5:
                Famouspep_recommend.Famouspeople_recommends();
                break;
            case 6:
                Marvel_Comics.Marvel_comics();
                break;
            case 7:
                Programming_Books.Programming_books();
                break;
            case 8:
                Science_Fiction.Science_fiction();
                break;


            default:
                System.out.println("\033[0;1m" + "Wrong Entry.... " + "\u001B[0m");
                View_book_Genre.viewbookgenre();
        }
    }
}
