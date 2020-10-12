/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

/**
 * @author PKS
 * 
 */

/*
Key consideration: The builder pattern might seem similar to the ‘abstract factory’
pattern but one difference is that the builder pattern creates an object step by step whereas
the abstract factory pattern returns the object in one go.
*/
public class BuilderDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Mobile mob;
        mob = new Mobile.Build("OnePlus").setColor("blue").setProcessor("dual core")
                .setRam("octa core").build();
        
        System.out.println(mob.toString());
        
         Mobile mob2;
        mob2 = new Mobile.Build("OnePlus").setProcessor("dual core")
                .setRam("octa core").build();
        
        System.out.println(mob2.toString());
        
    }
    
}
