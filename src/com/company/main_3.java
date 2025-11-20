package com.company;

public class main_3 {
    private ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the list

   public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
       System.out.println("null");
   }

   //Printing length of the list
    public int length(){
        if(head == null){
            return 0;
        }else {
            ListNode current = head;
            int count = 0;
            while (current != null){
                count++;
                current = current.next;
            }
            return count;
        }
    }

    //Inserting node at the beginning of the list
    public void insertNodeAtSart(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Inserting Node at the end of the list
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

    //Delete first node in this list
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head= head.next;
        temp.next = null;
        return temp;
    }

    //Delete last node in this list
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    //Inserting Node in this list
    public void insertNode(int position, int data){
        ListNode node = new ListNode(data);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;
            while (count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
    public static void main(String[] args) {
        main_3 m = new main_3();
        m.head = new ListNode(90);
        ListNode s = new ListNode(80);
        ListNode t = new ListNode(70);
        ListNode f = new ListNode(60);

        m.head.next = s;
        s.next = t;
        t.next = f;

        m.printList();
        System.out.println("The length of this list is : "+m.length());

        m.insertNodeAtSart(300);
        m.printList();

        m.insertNodeAtEnd(400);
        m.printList();

        //Deleting first node in this list
        m.deleteFirst();
        m.printList();

        //Deleting last node in this list
        m.deleteLast();
        m.printList();

        //Inserting Node in the list
        m.insertNode(3,1000);
        m.printList();
    }
}
