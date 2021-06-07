package LinkedList;

import java.util.NoSuchElementException;

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

    public void atTheBeginningOfDoublyLinkedList(int val){
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

    public void atTheEndOfDoublyLinkedList(int val){
        ListNode newNode = new ListNode(val);

        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode deleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }
        else{
            temp.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode deleteLastNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }
        else{
            temp.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {

        DoublyLinkedList obj = new DoublyLinkedList();
        obj.atTheBeginningOfDoublyLinkedList(4);
        obj.atTheBeginningOfDoublyLinkedList(3);
        obj.atTheEndOfDoublyLinkedList(5);
        obj.atTheEndOfDoublyLinkedList(6);
        obj.atTheBeginningOfDoublyLinkedList(2);
        obj.displayForward();
//        obj.displayBackward();
//        System.out.println(obj.deleteFirstNode().data);
//        System.out.println(obj.deleteLastNode().data);
//        obj.displayForward();
    }


}
