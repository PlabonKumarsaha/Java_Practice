/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.util.Scanner;

/**
 *
 * @author PKS
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d,e,f,g,h;
        float ans =0;
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter first four number \n");
            a= in.nextInt();
            b= in.nextInt();
            c= in.nextInt();
            g= in.nextInt();
            
            System.out.print("next first four number \n");
            d= in.nextInt();
            e= in.nextInt();
            f= in.nextInt();
            h= in.nextInt();
            
            
            ans = (float) Math.sqrt((a-d)*(a-d)+((b-e)*(b-e))+((c-f)*(c-f))+((g-h)*(g-h)));
            System.out.println("ANs is : "+ans);
                
            
        }
        
        
        
        
    }
    
}
