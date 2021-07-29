package LinkedList;

import java.util.NoSuchElementException;

/**
 * Author : Aditya
 * Created on : 8:54 AM , 07/06/21
 */

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next = null;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertAtBeginning(int data){
        ListNode newNode = new ListNode(data);

        if(isEmpty()){
            last = newNode;
        }
        else{
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertAtEnd(int data){
        ListNode newNode = new ListNode(data);

        if(isEmpty()){
            last = newNode;
            last.next = newNode;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void display(){
        ListNode temp = last.next;
        while(temp != last){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }

    public ListNode removeFirstNode(){

        if(isEmpty()){
            throw new NoSuchElementException("Already list is empty");
        }

        ListNode temp = last.next;

        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertAtBeginning(4);
        csll.insertAtBeginning(3);
        csll.insertAtBeginning(2);
        csll.insertAtBeginning(1);
//        csll.display();
        csll.insertAtEnd(5);
        csll.insertAtEnd(6);
//        System.out.println(csll.removeFirstNode().data);
//        System.out.println(csll.removeFirstNode().data);
//        System.out.println(csll.removeFirstNode().data);
//        System.out.println(csll.removeFirstNode().data);
        csll.display();
    }
}
