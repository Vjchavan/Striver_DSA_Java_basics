package LinkedList.DoublyLinkedList;

public class DLL {
    Node head;
    Node tail;
    int len;

    DLL(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        len = 1;
    }

    void printDLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    void appendDLL(int value){
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        len++;
    }

    void prependDLL(int value){
        Node node = new Node(value);
        head.prev = node;
        node.next = head;
        head = node;
        len++;
    }

    void removeFirst(){
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        len--;
    }

    void removeLast(){
        Node temp = tail.prev;
        tail.prev = null;
        tail = temp;
        tail.next = null;
        len--;

    }

    Node getNode(int index){
        if (index<0 && index>len){
            return null;
        }
        Node temp=head;
        if (index<len/2){
            System.out.println("From Head");
            for (int i=0;i<index;i++){
                temp = temp.next;
            }
        }
        else {
            temp = tail;
            System.out.println("From Tail");
            for (int i=len-1;i>index;i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

}
