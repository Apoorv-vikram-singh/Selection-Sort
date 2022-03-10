//selection sort in java 
import java.util.*;
public class selectioSearch 
{
    public int[] selecSort(int arr[],int loop,int j,int i)
    {
        for(i=0;i<loop-1;i++)
        {
            int min=i;
            for(j=i+1;j<loop;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        selectioSearch obj=new selectioSearch();
        Scanner sc=new Scanner(System.in);
        int loop =sc.nextInt();
        int i=0;
        int j=0;
        int arr[]=new int[100];
        for(i=0;i<loop;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=obj.selecSort(arr, loop, j, i);
        for(i=0;i<loop;i++)
        {
            System.out.print(result[i]+"  ");
        }
    }

}