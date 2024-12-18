import java.util.*;
class SortingOfArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                
                }
                
            }
            System.out.print(arr[i]+" ");
            
    }
    System.out.println();
    System.out.println("Maximum element " + arr[n-1]);
}
}
/*
 6
7 2 3 6 1 4
1 2 3 4 6 7      
Maximum element 7
 */

