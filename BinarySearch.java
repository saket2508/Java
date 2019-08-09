import java.util.*;

public class BinarySearch {
    int[] sort()
    {
        System.out.println("enter the size of the array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;



    }
    int binarySearch(int arr[],int l,int r, int x)
    {
        if(r>=l)
        {
            int mid = l + (r-l)/2;
            if(arr[mid]== x)
            {
                return mid;
            }
            if(arr[mid]> x)
            {
                return binarySearch(arr,l,mid-1,x);
            }
            return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch obj = new BinarySearch();
        int arr[] = obj.sort();
        System.out.println("enter the element you want to search");
        Scanner s  = new Scanner(System.in);
        int x = s.nextInt();
        int res = obj.binarySearch(arr,0,arr.length-1,x);
        if(res== -1){
            System.out.println("ELEMENT NOT FOUND");
        }
        else{
            System.out.println("ELEMENT FOUND");
        }

    }
}
