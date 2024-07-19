package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL(1);
        dll.appendDLL(2);
        dll.appendDLL(3);
        dll.appendDLL(4);
        dll.printDLL();
        System.out.println();
        dll.removeLast();
        dll.printDLL();
        System.out.println();
        dll.prependDLL(0);
        dll.printDLL();
        System.out.println();
        dll.removeFirst();
        dll.printDLL();
        System.out.println();
        System.out.println( dll.getNode(0).value);
        

    }
}
