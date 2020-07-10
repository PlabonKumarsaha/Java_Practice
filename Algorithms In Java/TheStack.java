package searching;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PKS
 */
public class TheStack {
    
    public static String stackArray[];
    public static int stackSize;
    public static int stackTop = -1;
    
    TheStack(int size){
        
        stackSize = size;
        stackArray = new String[50];
        
        //keeping negative value in the begining
        Arrays.fill(stackArray, "-1");
    }
    public void push(String input){
        if(stackTop +1 <stackSize){
            
            stackTop++;
            stackArray[stackTop] = input;
        }else{
            System.out.println("not enough size");
        }
       displayTheStack();
        System.out.println(input + ": was pushed in the stack");
    }
    
    public void pop(){
     
        if(stackTop>=0){
            
            displayTheStack();
            
       System.out.println(stackArray[stackTop]  + " : was poped from the stack");

       stackArray[stackTop] = "-1";
       
       stackTop--;
       // return stackArray[stackTop];
       
        }else{
        displayTheStack();
        System.out.println("nothing to pop");
        //return "-1";

        }
       
    }
    
    public String peek(){
        
        displayTheStack();
        System.out.println("peek at top is : "+ stackArray[stackTop]);
        
        return stackArray[stackTop];
           
    }
    
    public void pushMany(String multipleInput){
        String[] temp = multipleInput.split(" ");
        for(int i = 0;i<temp.length;i++){
            push(temp[i]);
        }
        
    }
    
    public void popAll(){
        for(int i = stackTop;i>=0;i--){
            pop();
        }
    }
 public void displayTheStack(){

            for(int n = 0; n < 61; n++)System.out.print("-");

            System.out.println();   

            for(int n = 0; n < stackSize; n++){
                System.out.format("| %2s "+ " ", n);

            }

            System.out.println("|");
   for(int n = 0; n < 61; n++)System.out.print("-");

             
            System.out.println();

            for(int n = 0; n < stackSize; n++){   

                if(stackArray[n].equals("-1")) System.out.print("|     ");

                else System.out.print(String.format("| %2s "+ " ", stackArray[n]));

            }

            System.out.println("|");

            for(int n = 0; n < 61; n++)System.out.print("-");

            System.out.println();
    

    }


   
    public static void main(String[] args) {
       
     TheStack theStack = new TheStack(5);
     theStack.push("AB");
     theStack.push("BC");
     theStack.push("CD");
     theStack.push("EF");
     theStack.push("GH");
     
     theStack.pop();
     
     theStack.peek();
     
     
     
     
    }
    
}
