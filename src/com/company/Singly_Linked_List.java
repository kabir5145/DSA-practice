package com.company;

public class Singly_Linked_List {

    private ListNode head;

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){

        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Singly_Linked_List s = new Singly_Linked_List();
        s.head = new ListNode(1);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(13);
        ListNode fourth = new ListNode(14);

        s.head.next= second;
        second.next= third;
        third.next= fourth;
        s.display();
        System.out.println("The length of this singly linked list is :- "+s.length());
    }
}
