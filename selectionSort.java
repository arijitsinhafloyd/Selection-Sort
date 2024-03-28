import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++)
        {
            int index=i; //Assume the current index has the minimum value
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[index])
                    index=j; //Update the index of the minimum value
            }
            if(index!=i) //Swap only if the minimum value is not already at its correct position
            {
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
            }
        }
    }
}
