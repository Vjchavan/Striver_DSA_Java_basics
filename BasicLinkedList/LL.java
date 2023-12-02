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
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println("Length - "+len);
    }

    void appendLL(int value){
        Node node = new Node(value);
        if (len==0){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
            len++;
        }
    }

    void RemoveLast(){
        if(len==0){
            return;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        len--;
        if (len==0){
            head = null;
            tail = null;
        }
    }
}
