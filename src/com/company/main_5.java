package com.company;


public class main_5 {
    private ListNode head;

    private static class ListNode{
        private double data;
        private ListNode next;

        public ListNode(double data){
            this.data = data;
            this.next = null;
        }
    }
    //Printing the singly linked list
    public void printLL(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Finding the length of the singly linked list
    public int length(){
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

    //Searching an element from the given singly linked list
    public boolean searchElement(double searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Finding the middle of the list
    public ListNode findMiddleNum(){
        if(head == null){
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    //Removing a duplicate in the sorted list
    public void removeDuplicate() {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;   // skip duplicate
            } else {
                current = current.next;
            }
        }
    }

    //Reversing the list
    public void reverse(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String[] args) {
        main_5 f = new main_5();
        f.head = new ListNode(9.9);
        ListNode g = new ListNode(8.9);
        ListNode h = new ListNode(7.0);
        ListNode i = new ListNode(7.0);

        f.head.next = g;
        g.next= h;
        h.next = i;

        f.printLL();
        System.out.println("The length of the singly linked list is : "+f.length());

        System.out.println("Does the list contains the cgpa of 7.0 ? ");
        System.out.println(f.searchElement(7.0));

        System.out.println("The middle node of this list is :- "+f.findMiddleNum().data);

        System.out.println("The original list");
        f.printLL();
        System.out.println("new reformed list");

        f.removeDuplicate();
        f.printLL();

        //Reversing the list
        f.reverse();
        f.printLL();
    }
}
