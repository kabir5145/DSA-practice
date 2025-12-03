package com.company;

public class main_4 {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the Singly Linked List
    public void printList(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Finding the length of the singly linked list

    public int findLength(){
        if(head == null){
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Inserting the node at the beginning of the singly linked list
    public ListNode insertNodeAtFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return newNode;
    }

    //Inserting the node at the end of the singly linked list
    public void insertNodeAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String[] args) {
        main_4 m = new main_4();
        m.head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);

        //Connecting the Singly Linked List
        m.head.next = a;
        a.next = b;
        b.next = c;

        m.printList();
        System.out.println("The length of this singly linked list is : "+m.findLength());

        //Inserting a node at the beginning of singly linked list
        m.insertNodeAtFirst(199);
        m.printList();

        //Inserting a node at the end of the singly linked list
        m.insertNodeAtEnd(200);
        m.printList();
    }
}
