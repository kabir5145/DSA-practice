package com.company;

public class main_2 {
    private ListNode head;

    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the list
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Printing Length of the list
    public int length(){
        if( head == null){
            return 0;
        }
        int count = 0;

        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Insert Node at the beginning
    public void insertAtFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Insert Node at the last
    public void insertAtLast(int value){
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
        main_2 m = new main_2();
        m.head = new ListNode(10);
        ListNode s = new ListNode(20);
        ListNode t = new ListNode(30);
        ListNode f = new ListNode(40);

        m.head.next = s;
        s.next = t;
        t.next = f;

        m.display();
        System.out.println("The Length of this list is : "+m.length());

        m.insertAtFirst(39);
        m.display();

        m.insertAtLast(39);
        m.display();
    }
}
