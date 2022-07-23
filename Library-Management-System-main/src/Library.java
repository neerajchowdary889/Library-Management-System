import java.io.IOException;

class Library extends Login {
        class Node{
            String data;
            Node next;

            public Node(String data) {
                this.data = data;
                this.next = null;
            }
        }
        public Node head = null;
        public Node tail = null;
        public void addNode(String data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void display() {
            Node current = head;

            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    public static void library() throws Exception {
        System.out.println("\033[0;1m"+"Welcome to Garuda Library Main Page...\n"+ "\u001B[0m");
//        System.out.println("[1] Search Books \n[2] View Book Genre \n[3] View Account \n[4] Logout ");
        Library obj = new Library();
        obj.addNode("[1] Search Books\n");
        obj.addNode("[2] View Book Genre\n");
        obj.addNode("[3] View Account\n");
        obj.addNode("[4]Issue Book\n");
        obj.addNode("[5]Return book\n");
        obj.addNode("[6]Announcements\n");
        obj.addNode("[7] Logout");
        obj.display();

        int Library_input = sc.nextInt();

        switch (Library_input){
            case 1:
                Search_Books.searchbook();
                break;

            case 2 :
                View_book_Genre.viewbookgenre();
                break;

            case 3 :
                ViewUser_Account.viewuser_account();
                break;

            case 4 :
               Issue_Books.issuebook();
                break;
                case 5 :
                Return_Books.returnbook();
                break;
                case 6 :
                Announcements.View_Announcements();
                break;
                case 7 :
                    Logout.logout();
        }
    }
}
