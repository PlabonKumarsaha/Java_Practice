package searching;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author PKS
 */
public class Searching {

    int linearSearch (int arr[],int num){
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                return i+1;
            }
        }
        return -1;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Searching sear = new Searching();
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[50];
        
        for(int i = 0;i<10;i++){
            
            arr[i]= sc.nextInt();
        }
        
        int input;
        
        input = sc.nextInt();
        sear.linearSearch(arr, input);
        //linearSearch(input);
        
    }
    
}

