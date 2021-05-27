package LinkedList;

import java.util.List;

/**
 * Author : Aditya
 * Created on : 8:42 AM , 24/05/21
 */

public class SinglyLInkedList {

        private ListNode head;

        private static class ListNode {
            private int data;
            private ListNode next;

            public ListNode(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void display(ListNode head){
            ListNode current = head;
            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }

        public void atTheBeginning(int val){
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
        }

        public void atTheEnd(int val){
            ListNode newNode = new ListNode(val);
            ListNode current = head;
            if(head == null){
                head = newNode;
                return;
            }
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        public void atGivenPosition(int pos, int val){
            ListNode newNode = new ListNode(val);
            int count = 1;
            if(pos == 1){
                newNode.next = head;
                head = newNode;
            }
            else{
                ListNode temp = head;
                while(count < pos - 1){
                    temp = temp.next;
                    count++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        public int lengthOfLinkedList(){
            ListNode current = head;
            int count = 0;
            if(head == null)
                return 1;
            else{
                while(current != null){
                    current = current.next;
                    count++;
                }
            }
            return count;
        }

        public ListNode deleteFirst(){
            if(head == null)
                return null;
            else{
                ListNode temp = head;
                head = head.next;
                return temp;
            }
        }

        public ListNode deleteLast(){
            if(head == null || head.next == null) {
                return head;
            }
            else{
                ListNode temp = head;
                while(temp.next.next != null){
                    temp = temp.next;
                }
                ListNode dnode = temp.next;
                temp.next = null;
                return dnode;
            }
        }

        public ListNode deleteAtGivenPosition(int pos){
            ListNode current = head;
            int count = 1;
            if(pos == 1){
                head = current.next;
                return current;
            }
            else{
                while(count < pos-1){
                    current = current.next;
                    count++;
                }
                ListNode temp = current.next;
                current.next = temp.next;
                return temp;
            }
        }

        public boolean searchAnElement(int key){
            if(head == null)
                return false;
            ListNode current = head;
            while(current !=null){
                if(current.data == key){
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public ListNode reverseLinkList(ListNode head){
            if(head == null)
                return head;
            ListNode current = head;
            ListNode previous = null;
            ListNode next = null;
            while(current != null){
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;
        }

        public ListNode middleElement(ListNode head){
            if(head == null){
                return null;
            }
            ListNode slowPtr = head;
            ListNode fastPtr = head;
            while(fastPtr != null && fastPtr.next != null){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            return slowPtr;
        }

        public ListNode nthNodeFromEnd(int n){
            if(head == null)
                return null;
            if(n <= 0)
                throw new IllegalArgumentException("Invalid value: n = " +n);

            int count = 0;
            ListNode mainPtr = head;
            ListNode refPtr = head;

            while(count < n){
                if(refPtr == null)
                    throw new IllegalArgumentException(n + "greater than the number of node in list");
                refPtr = refPtr.next;
                count++;
            }

            while(refPtr != null){
                mainPtr = mainPtr.next;
                refPtr = refPtr.next;
            }
            return mainPtr;
        }

        public void removeDuplicates(){
            if(head == null)
                return;

            ListNode current = head;

            while(current != null && current.next != null){
                if(current.data == current.next.data){
                    current.next = current.next.next;
                }
                else{
                    current = current.next;
                }
            }
        }

        public ListNode insertInSortedList(int val){
            ListNode newNode = new ListNode(val);

            ListNode current = head;
            ListNode temp = null;

            if(head == null)
                return newNode;

            while(current != null && current.data < newNode.data){
                temp = current;
                current = current.next;
            }

            newNode.next = current;
            temp.next = newNode;

            return head;
        }

        public static void main(String[] args) {
            SinglyLInkedList obj = new SinglyLInkedList();

//            Inset a node at the beginning or at end or at given position in link list

//            obj.atTheBeginning(3);              // 3 -> null
//            // obj.display(obj.head);
//            obj.atTheEnd(4);                    // 3 -> 4 -> null
//            // obj.display(obj.head);
//            obj.atTheBeginning(2);              // 2 -> 3 -> 4 -> null
//            // obj.display(obj.head);
//            obj.atTheEnd(5);                    // 2 -> 3 -> 4 -> 5 -> null
//            // obj.display(obj.head);
//            obj.atTheBeginning(1);              // 1 -> 2 -> 3 -> 4 -> 5 -> null
//            // obj.display(obj.head);
//            obj.atGivenPosition(1,6);      // 6 -> 1 -> 2 -> 3 -> 4 -> 5 -> null
//            obj.display(obj.head);

//            Delete first node of link list

//            System.out.println("Deleted node = " + obj.deleteFirst().data);         // 1 -> 2 -> 3 -> 4 -> 5 -> null
//            obj.display();

//            Delete last node of link list

//            System.out.println("Deleted node = " + obj.deleteLast().data);          // 1 -> 2 -> 3 -> 4 -> null
//            obj.display();

//            Length of linked list

//            System.out.println("Length of Linked List is " + obj.lengthOfLinkedList());

//            Insert a node at given position

//            obj.atGivenPosition(3,9);      // 6 -> 1 -> 9 -> 2 -> 3 -> 4 -> 5 -> null
//            obj.display();

//            Deleting an element at given position

//            System.out.println("Deleted node = " + obj.deleteAtGivenPosition(3).data);
//            System.out.println("Deleted node = " + obj.deleteAtGivenPosition(1).data);
//            obj.display();

//            Search an element in the list

//            if(obj.searchAnElement(9))
//                System.out.println("Key found !");
//            else
//                System.out.println("Key not found !");

//            reverse the same list

//            ListNode reverseList = obj.reverseLinkList(obj.head);
//            obj.display(reverseList);

//            Finding middle element of list

//            System.out.println("Middle node = " + obj.middleElement(obj.head).data);

//            Finding nth node from end of list

//            System.out.println("Nth node from end = " + obj.nthNodeFromEnd(2).data);

//            Removes duplicates element from sorted link list

//            obj.removeDuplicates();
//            obj.display(obj.head);

//            Insert a node in sorted link list

//            obj.atTheBeginning(6);
//            obj.atTheBeginning(4);
//            obj.atTheBeginning(3);
//            obj.atTheBeginning(2);
//            obj.atTheBeginning(1);
//            obj.display(obj.head);
//            obj.insertInSortedList(5);
//            obj.display(obj.head);
        }

    }


