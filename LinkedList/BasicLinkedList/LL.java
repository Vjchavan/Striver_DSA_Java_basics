package LinkedList.BasicLinkedList;

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

//    void midOfLL(){
//        int mid = len/2;
//        int start=0;
//        System.out.println(mid+1);
//        while(len>mid){
//            System.out.println(head.value);
//            head = head.next;
//            len--;
//        }
//        System.out.println("mid "+head.value);
//    }

    void midOfLL(){
        Node p1 = head;
        Node p2 = head;
        while(p2 != null && p2.next != null){
            // In each iteration, we move p1 one node forward and we move p2 two nodes forward...
            p1 = p1.next;
            p2 = p2.next.next;
        }
    }

    void removeElement(int value){
        if (head==null){
            System.out.println("Empty LL");
            return;
        }
        Node temp = head;
        Node back = null;

        while(temp!=null){
            if (temp.value == value){
                back = temp.next;
                temp.next = null;

            }
            back = temp;
            temp = temp.next;
        }
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
            len=1;
        }
        else {
            tail.next = node;
            tail = node;
            len++;
        }
    }

    void prependLL(int value){
        System.out.println("PrePending "+value);
        Node node = new Node(value);
        if (len==0){
            head=node;
            tail=node;
            len=1;
        }
        else {
            Node temp = head;
            head = node;
            node.next = temp;
            len++;
        }
    }

    void RemoveLast(){
        System.out.println("Removing last node");
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

    void removeFirst(){
        System.out.println("Removing first node");
        if (len==0) return;

        Node temp = head;
        head = head.next;
        temp.next = null;
        len--;

        if (len==0){
            tail = null;
        }
    }
}
