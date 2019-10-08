import java.util.Scanner;

class GFG
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int arr[] = { 2, 3, 4, 10, 40 };

        for(int i = 0;i<num;i++)
        {
          arr[i]=input.nextInt();
        }
        System.out.println("Enter input");
        int x = input.nextInt();
        int result = search(arr, x);
        if(result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + (result+1));
    }
} 