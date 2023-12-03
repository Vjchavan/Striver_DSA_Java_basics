package DoublyLinkedList;

public class DLL {
    Node head;
    Node tail;
    int len;

    DLL(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
    }

}
