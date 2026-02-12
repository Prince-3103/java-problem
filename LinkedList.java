import java.util.Scanner;

public class LinkedList{

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void createList() {
        Scanner sc = new Scanner(System.in);

        Node temp = null;
        int choice = 1;

        while (choice == 1) {

            System.out.print("Enter data: ");
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            System.out.print("Do you want to continue (0/1)? ");
            choice = sc.nextInt();
        }
    }

    static void displayList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    static void reverse() {
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        head = prevNode;
    }

    
    public static void main(String[] args) {

        createList();

        System.out.print("Your list: ");
        displayList(head);

        reverse();

        System.out.print("Reverse list: ");
        displayList(head);
    }
}
