package com.company;

public class main_1 {
    private Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Displaying the Singly Linked List
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }
    //Counting the length of this list
    public int length_list(){
        if(head == null){
            return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    //Inserting first element in the Singly Linked List
    public void insertFirst_1(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        main_1 m = new main_1();
        m.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        //Connecting the data
        m.head.next = second;
        second.next = third;
        third.next = fourth;
        m.display();

        //Length of the Singly Linked List
        System.out.println("The Length of the Singly Linked List is : "+m.length_list());

        //Inserting node in the first of singly linked list
        m.insertFirst_1(100);
        m.display();
    }
}
