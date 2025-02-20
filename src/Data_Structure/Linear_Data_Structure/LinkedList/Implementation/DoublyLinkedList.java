package Data_Structure.Linear_Data_Structure.LinkedList.Implementation;

public class DoublyLinkedList {
    static DoublyNode head = null;
    static DoublyNode tail = null;

    static public void insertLast(int data){
        DoublyNode node = new DoublyNode(data);
        if(head == null){
            head = node;
            tail = node;
        } else {
            DoublyNode dummy = head;
            while(dummy.next != null){
                dummy = dummy.next;
            }

            node.previous = dummy;
            dummy.next = node;
            tail = node;
        }
    }

    static void insertFirst(int data){
        DoublyNode node = new DoublyNode(data);

        if (head == null){
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
    }

    static void deleteLast(){
        if( head == null) {
            System.out.println("List is Empty !!");
        } else {
            tail = tail.previous;
            tail.next = null;
        }
    }

    static void deleteFirst(){
        if( head == null) {
            System.out.println("List is Empty !!");
        } else {
            head = head.next;
            head.previous = null;
        }
    }

    static void deleteAt(int index){
        if( head == null) {
            System.out.println("List is Empty !!");
        } else {
            if(index==0){deleteFirst();return;}

            DoublyNode dummy = head;
            while(index-1 != 0 && dummy!= null){
                dummy = dummy.next;
                index--;
            }
            dummy.next = dummy.next.next;
            dummy.next.previous = dummy;
        }
    }

    static void display(){
        if (head == null ){
            System.out.println("List is Empty !!");
        }

        DoublyNode dummy = head;
        while(dummy != null){
            System.out.print(dummy.data + "   ");
            dummy = dummy.next;
        }
        System.out.println();
        System.out.println("---------------");
    }

    public static void main(String[] args) {

            for (int i=11; i<=20; i++){
                insertLast(i);
            }
            display();
            for ( int i=0; i<10;i++){
                insertFirst(i);
            }
            display();

            deleteLast();deleteLast();
            display();

            deleteFirst();deleteFirst();
            display();

            deleteAt(2);
            display();

            deleteAt(6);
            display();

            deleteAt(0);
            display();

        System.out.println("Head : "+head.data);
        System.out.println("tail : "+tail.data);
    }
}
