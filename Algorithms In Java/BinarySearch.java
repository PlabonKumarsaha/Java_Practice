package searching;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author PKS
 */
public class Searching {
    
    public static int arr[] = new int[50];
    
    public void bubbleSort(int num){
        
        for(int i =0;i<num;i++){
            
            for(int j =i+1;j<num;j++){
                if(arr[i]>arr[j]){
                    
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                   // swap(arr[i],arr[j]);
                }
            }
        }
    }
    
    public void binarySearch(int num ,int value){
        
        int lowIndex =0;
        int highIndex = num -1; 
        
        while(lowIndex <highIndex){
            
            int midIndex =(lowIndex+highIndex)/2;
            
            if(arr[midIndex]< value){
                lowIndex = midIndex +1;
            }
            else if(arr[midIndex]>value){
                
                highIndex = midIndex-1;
            }
            else{
                System.out.print("Value at index"+ midIndex);
            }
        }
        
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        Searching sear = new Searching();
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        
        for(int i = 0;i<num;i++){
            
            arr[i]= sc.nextInt();
        }
        
        sear.bubbleSort(num);
        
        for(int i = 0;i<num;i++){
            
           System.out.print(" "+arr[i]);
        }
        int value = sc.nextInt();
        sear.binarySearch(num, value);
     
    }
    
}
