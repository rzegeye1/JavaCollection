package com.company.linkedlistimplimentation;

public class linkedlist {


    Node head;
    public void insertAtEnd(int data){

        Node node = new Node();
        node.data = data;

        if(head==null){
            head = node;
        }else{
           Node n = head;
           while(n.next!=null){
               n= n.next;
           }
           n.next = node;
        }



    }
    public void insertAtStart(int data){

        Node node = new Node();
        node.next = head;
        head = node;


    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;

        for(int i = 0; i< index-1; i++){
            
        }

    }


}
