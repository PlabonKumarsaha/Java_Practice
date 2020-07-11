package searching;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PKS
 */
public class TheQueue {
    
    public static String queueArray[];
    public static int queueSize;
    public static int front,rear,numverOfItems = 0;
    
    TheQueue(int size){
        
        queueSize = size;
        queueArray = new String[50];
        
        //keeping negative value in the begining
        Arrays.fill(queueArray, "-1");
    }
    public void insert(String input){
        if(numverOfItems +1 <queueSize){
            
           //puting information on the back of the queue
            queueArray[rear] = input;
            rear++;
            numverOfItems++;
        }else{
            System.out.println("not enough size");
        }
       
        System.out.println(input + ": was inserted in the queue");
    }
    
    public void remove(){
     
        if(numverOfItems>0){
            
           
            
       System.out.println(queueArray[front]  + " : was removed from the queue");

       queueArray[front] = "-1";
       
       front++;
       numverOfItems--;
       
        }else{
        
        System.out.println("nothing to remove");
        //return "-1";

        }
       
    }
    
    public String peek(){
        
        
        System.out.println("peek at top is : "+ queueArray[front]);
        
        return queueArray[front];
           
    }
    

 public void displayTheQueue(){

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();
        for(int n = 0; n < queueSize; n++){

            System.out.format("| %2s "+ " ", n);
             
        }

        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){

            if(queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));

        }

        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();

        // Number of spaces to put before the F
        int spacesBeforeFront = 3*(2*(front+1)-1);

        for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");

        System.out.print("F");
        int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);
        for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
        System.out.print("R");
        System.out.println("\n");
}

public void priorityInsert(String input){
    
    int i;
    if(numverOfItems == 0){
        insert(input);
    } else{
        for(i = numverOfItems-1 ;i>=0;i--){
            //checking if inputted value is greater then previously inputted value in the queue
            if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){

                    queueArray[i+1] = queueArray[i];

                } else break; // Done shifting items in queue

        }
            queueArray[i+1] = input;
            rear++;
            numverOfItems++;

    }
}

   
    public static void main(String[] args) {
       
     
     TheQueue queue =  new TheQueue(10);
     queue.insert("AB");
     queue.insert("BC");
     queue.insert("CD");
     queue.insert("DE");
     queue.insert("EF");
     //queue.insert("AB");
     queue.displayTheQueue();
     queue.remove();
     queue.displayTheQueue();
     
     queue.peek(); 
     
     //to make the priority queue activated
     queue.priorityInsert("5");
     queue.priorityInsert("2");
     queue.priorityInsert("7");
     queue.priorityInsert("10");
     queue.priorityInsert("8");
     
     queue.displayTheQueue();
     queue.remove();
     queue.displayTheQueue();
     
     queue.peek();
     
     
     
     
 
    }
    
}
