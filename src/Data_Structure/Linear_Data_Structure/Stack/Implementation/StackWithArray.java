package Data_Structure.Linear_Data_Structure.Stack.Implementation;

public class StackWithArray {
    static int[] stack = new int[10];
    static int top =-1;

    static void push(int n){
        if(top+1 == 10){
            System.out.println("Full !!");
            return;
        }
        stack[++top]=n;
        System.out.println("Pushed "+n);
    }

    static void pop(){
        if(top==-1) {
            System.out.println("Empty !!");
            return;
        }
        top--;
    }

    static void dislay(){
        if(top==-1){
            System.out.println("Empty !!");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        dislay();
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        push(10);
        pop();
        dislay();
        push(9);
        dislay();
    }

}
