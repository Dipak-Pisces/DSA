package Data_Structure.Linear_Data_Structure.LinkedList.Implementation;

import java.util.*;

public class SinglyLinkedList {

    static SinglyNode head=null;


    static void insertFirst(int data){
        SinglyNode node = new SinglyNode(data);

        if (head == null) {
            head = node;
        } else{
            node.next = head;
            head = node;
        }
    }


    static void insertLast(int data){
        SinglyNode node = new SinglyNode(data);

        if (head == null) {
            head = node;
        } else {
            SinglyNode dummy = head;
            while(dummy.next != null){
                dummy =  dummy.next;
            }
            dummy.next = node;
        }
    }


    static void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty !!");
        }else{
            head = head.next;
        }
    }


    static void deleteEnd(){
        if(head == null){
            System.out.println("List is Empty !!");
        }else{
            SinglyNode node = head;
            while(node.next.next != null){
                node = node.next;
            }
            node.next = null;
        }
    }


    static void display(){
        if (head == null ){
            System.out.println("List is Empty !!");
        }

        SinglyNode dummy = head;
        while(dummy != null){
            System.out.print(dummy.data + "   ");
            dummy = dummy.next;
        }
        System.out.println();
        System.out.println("---------------");
    }


    public static void main(String[] args) {

        display();
        insertFirst(12);
        insertFirst(11);
        insertFirst(10);
        display();
        insertLast(13);
        insertLast(14);
        insertLast(15);
        display();
        deleteEnd();
        display();
        deleteFirst();
        display();
    }
}
