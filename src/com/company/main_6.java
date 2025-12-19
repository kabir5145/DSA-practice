package com.company;

public class main_6 {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Printing the singly linked list
    public void printLL() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Reversing the singly linked list
    public void reverse() {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    //Find the middle node in the singly linked list
    public void middle() {
        if(head == null) {
            return;
        }
        ListNode current = head;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        System.out.println("The middle node in the singly linked list is : "+slowPtr.data);
    }

    //Find the length of singly linked list
    public void findLength() {
        ListNode current  = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        System.out.println("The length of the singly linked list is : "+count);
    }

    //Deleting first Node in singly linked list
    public ListNode deleteFirstNode(){
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //Inserting a node in a singly linked list at given position
    public ListNode insert(int data , int position) {
        ListNode node = new ListNode(data);
       if(position == 1){
           node.next = head;
           head = node;
       }else{
           ListNode previous = head;
           int count = 1;
           while (count < position -1 ) {
               previous = previous.next;
               count++;
           }
           ListNode current = previous.next;
           node.next = current;
           previous.next = node;
       }
       return node;
    }

    //Deleting middle node of singly linked list
    public ListNode deleteMiddleNode() {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        main_6 obj = new main_6();
        obj.head = new ListNode(1);
        obj.head.next = new ListNode(2);
        obj.head.next.next = new ListNode(3);
        obj.head.next.next.next = new ListNode(4);
        obj.head.next.next.next.next = new ListNode(5);

        //Printing the singly linked list
        obj.printLL();

        //Reversing the linked list
        System.out.println("The reversed linked list is:");
        obj.reverse();
        obj.printLL();

        obj.middle();

        //Finding the length of singly linked list
        obj.findLength();

        //Deleting the first node of singly linked list
        obj.deleteFirstNode();
        obj.printLL();

        //Inserting a node at the given position
        obj.insert(200,3);
        obj.printLL();

        //Deleting the middle node of singly linked list
        obj.deleteMiddleNode();
        obj.printLL();
    }
}
