package BasicLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LL ll = new LL(4);

        for (int i=0;i<5;i++){
            ll.appendLL(in.nextInt());
        }

        ll.printLL();
        ll.RemoveLast();
        System.out.println();
        ll.printLL();
    }
}
