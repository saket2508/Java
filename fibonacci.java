import java.util.*;

public class fibonacci {
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter n: ");
        n = s.nextInt();
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a + " ");
        }

    }
}
