import java.util.*;
public class Exp5 {
    class Node{
        public int ele;
        public Node next;
        public Node prev;
        Node(int ele){
            this.ele = ele;
            this.prev = null;
            this.next = null;
        }
    }
    public Node head = null;
    public void setdata(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;
        if(head != null){
            head.prev = new_node;
        }
        head = new_node;
    }
    public void set_at_pos(int n, int data) {
        int len = getLength(head);

        if (n == 0) {
            setdata(data);
            return;
        }

        if (n == len) {
            set_at_last(data);
            return;
        }
        if (n < 1 || len > n) System.out.println("Invalid position");
        else { Node new_node = new Node(data);

            new_node.next = null;
            new_node.prev = null;
            Node t = head;
            while (--n > 0) {
                t = t.next;
            }
            Node nextNode = t.next;
            nextNode.prev = new_node;
            new_node.next = nextNode;
            new_node.prev = t;
            t.next =  new_node;
        }
    }
    public int getLength(Node node) {
        int size = 0;

        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }
    public void set_at_last(int data){
        Node new_node = new Node(data);
        Node last = head;
        new_node.next = null;
        if(head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
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
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        head = head.next;
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
        current.next = null;
    }
    public static void main(String[] args) {
        System.out.println("Saarmeen-");
        Exp5 pl = new Exp5();
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
                    pl.set_at_pos(position,b);
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
        while(!str.equals(st));}}

