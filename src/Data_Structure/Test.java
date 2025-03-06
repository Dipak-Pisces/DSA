package Data_Structure;

public class Test {

    public static void main(String[] args) {

        print(4);
    }

    public static void print(int n) {

        int count  = 1;

        for(int row=1; row<=n; row++) {

            if(row%2==0){
                count += n-1;

                for(int column=1; column<=n;column++){
                    System.out.print(count-- +" ");
                }
                count += n+1;
            } else {
                for(int column=1; column<=n;column++){
                    System.out.print(count++ +" ");
                }
            }
            System.out.println();

        }

    }
}
