
import java.util.Scanner;
public class nodeAddress {
    static Scanner sc = new Scanner(System.in);
    Node head;
    static nodeAddress llist = new nodeAddress();
    static class Node{
        int data;
        Node next;
        Node prev;
        Node (int d){
            data = d;
            next = null;
            prev = null;
        }
    }
    static void insert(int d){
        Node new_Node = new Node(d);
        if (llist.head == null){
            llist.head = new_Node;
        }
        else {
            Node currNode = llist.head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = new_Node;
            new_Node.prev = currNode;
        }
    }


    static void print(){
        Node currNode = llist.head;
        while(currNode != null){
            System.out.println(" Prev Add: " + currNode.prev + " Curr Add: " + currNode + " Data: " + currNode.data + " Next Add: " + currNode.next );
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        insert(8);

        print();
    }

}


