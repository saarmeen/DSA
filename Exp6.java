import java.util.*;
class Exp6{
    class Node{
        int ele;
        Node next;
        Node(int ele){
            this.ele = ele;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void setdata(int ele){
        Node n = new Node(ele);
        if(head == null) {
            head = n;
            tail = n;
            tail.next = head;
        }
        else{
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }
    public void set_at_last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }
    void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {

            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

            if (newNode.next == head) {
                tail = newNode;
            }
        }
    }
    public void getdata(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while(current != null){
            System.out.print(current.ele+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void deleteAtLocation(int position) {
        if (position <= 0 || head == null) {
            System.out.println("Invalid position or list is empty. Cannot delete.");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position. Cannot delete.");
            return;
        }
        current.next = current.next.next;
    }
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        head = head.next;
    }
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = head;
    }


    public static void main(String[] args) {
        System.out.println("Saarmeen-");
        Exp6 pl = new Exp6();
        Scanner sc = new Scanner(System.in);
        String st = "n";
        String str="";
        System.out.println("enter the elements of linked list ");
        do{

            System.out.println("Options:");
            System.out.println("1 .insert at  first ");
            System.out.println("2. insert at pos ");
            System.out.println("3.insert at end ");
            System.out.println("4 .Delete from first ");
            System.out.println("5.Delete from end ");
            System.out.println("6.Delete from a speific position ");

            System.out.println("7. Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();
            sc.nextLine();


            switch(option){
                case 1:
                    int a = sc.nextInt();
                    pl.setdata(a);
                    System.out.println("Linked List after inserting from the beginning:");
                    pl.getdata();
                    break ;
                case 2:
                    int b = sc.nextInt();
                    System.out.println("enter pos");
                    int position = sc.nextInt();
                    pl.insertAtPos(b, position);
                    pl.getdata();
                    break;
                case 3:

                    System.out.print("Enter the element");
                    int c= sc.nextInt();
                    pl.set_at_last(c);
                    pl.getdata();
                    break;
                case 4:


                    pl.deleteAtBeginning();
                    System.out.println("Linked List after deleting from the beginning:");
                    pl.getdata();
                    break ;
                case 5:

                    pl.deleteAtEnd();
                    System.out.println("Linked List after deleting from the end:");
                    pl.getdata();
                    break;
                case 6:

                    System.out.print("Enter the position to delete: ");
                    int positionToDelete = sc.nextInt();
                    pl.deleteAtLocation(positionToDelete);
                    System.out.println("Linked List after deleting at position " + positionToDelete + ":");
                    pl.getdata();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please enter a valid option.");

            }
        }
        while(!str.equals(st));
        pl.getdata();
            }
}
