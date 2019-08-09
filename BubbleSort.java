import java.util.*;
import java.util.Scanner;

public class BubbleSort{
    void sort(int arr[])
    {
        int n = arr.length;
        for(int i= n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void printData(int arr[])
    {
        int n = arr.length;
        System.out.println("SORTED ARRAY: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    int[] getData()
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        return arr;

    }
    public static void main(String args[])
    {
        BubbleSort s = new BubbleSort();
        int arr[] = s.getData();
        s.sort(arr);
        s.printData(arr);

    }

}
