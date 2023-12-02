package BasicLinkedList;

import java.util.Scanner;

public class LL {

    Node head;
    Node tail;
    int len;
    public LL(int value) {
        Node newNode = new Node(value);
        head =newNode;
        tail = newNode;
        len = 1;
    }

    void printLL(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
