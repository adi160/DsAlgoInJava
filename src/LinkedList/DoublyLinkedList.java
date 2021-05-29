package LinkedList;

/**
 * Author : Aditya
 * Created on : 12:31 PM , 27/05/21
 */

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;         // or head == null;
    }

    public int length(){
        return length;
    }

    public void atTheBeginning(int val){
        ListNode newNode = new ListNode(val);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void displayForward(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode current = tail;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.atTheBeginning(4);
        obj.atTheBeginning(3);
        obj.displayForward();
        obj.displayBackward();
    }


}
