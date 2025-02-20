package Data_Structure.Linear_Data_Structure.LinkedList.Implementation;

public class CircularLinkedList {

    static SinglyNode head = null;

    static void insert(int n){
        SinglyNode node = new SinglyNode(n);

        if(head==null){
            head = node;
            head.next = node;
        } else{
            SinglyNode dummy = head;
            while(dummy.next != head){
                dummy = dummy.next;
            }
            node.next = head;
            dummy.next = node;
        }
    }
    static void remove(int n){
        if(head==null){
            System.out.println("EMPTY LIST !!");
        } else {
            SinglyNode dummy = head;
            while(dummy.next.data != n){
                dummy = dummy.next;
                if(dummy==head){
                    System.out.println("Not Found");
                    break;
                }
            }
            dummy.next = dummy.next.next;
        }
    }

    static void display(){
        if(head==null){
            System.out.println("EMPTY LIST !!");
        } else {
            SinglyNode dummy = head;
            while(dummy.next !=head){
                System.out.print(dummy.data+" ");
                dummy = dummy.next;
            }
            System.out.println(dummy.data);
        }
    }
    public static void main(String[] args) {
        display();
        insert(10);
        display();
        insert(20);
        insert(30);
        display();
        remove(34);
        display();
    }
}
