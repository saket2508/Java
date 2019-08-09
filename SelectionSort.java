import java.util.*;

public class SelectionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    int[] getdata()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements");
        for(int i = 0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }
        return arr;


    }
    void printdata(int arr[])
    {
        int n = arr.length;
        System.out.println("SORTED ARRAY: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[])
    {
       SelectionSort sort = new SelectionSort();
       int array[] = sort.getdata();
       sort.sort(array);
       sort.printdata(array);

    }
}
