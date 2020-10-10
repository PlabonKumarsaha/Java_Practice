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
public class DatabaseLayer {
    
    private static volatile DatabaseLayer db = new DatabaseLayer() ;
    
    //prevents reflection API from creating an object
    private DatabaseLayer(){ //made private so that direct object creation is not possible
        try{
        if(db != null){
            
           // throws new Exception("can only get obj byi getInsance");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static DatabaseLayer getInstance(){
        if(db==null){ //if no object was crated earlier
              db = new DatabaseLayer();
              return db;
       }
        else {return db;} //returns refernce of previously created object
    }
}
