/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author PKS
 */
public class SingleTon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SIngleton only allows one object per JVM
        //https://www.youtube.com/watch?v=a5GMYRG8J90&t=3s&ab_channel=ProgRank
        DatabaseLayer db = DatabaseLayer.getInstance();
        
        System.out.println(db); //returns singleton.DatabaseLayer@15db9742
        
            DatabaseLayer db2 = DatabaseLayer.getInstance();
        
        System.out.println(db2); //returns singleton.DatabaseLayer@15db9742
    }
    
}
