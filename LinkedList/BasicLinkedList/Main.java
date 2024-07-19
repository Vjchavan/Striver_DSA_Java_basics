package BasicLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LL ll = new LL(1);
        ll.appendLL(2);
        ll.appendLL(3);
        ll.appendLL(4);
        ll.appendLL(5);

//        for (int i=0;i<6;i++){
//            ll.appendLL(in.nextInt());
//        }

        ll.midOfLL();

//        ll.printLL();
//        ll.removeElement(1);
//        ll.printLL();
//        ll.RemoveLast();
//        System.out.println();
//        ll.printLL();
//        ll.prependLL(3);
//        ll.printLL();
//        ll.removeFirst();
//        ll.printLL();
    }
}
