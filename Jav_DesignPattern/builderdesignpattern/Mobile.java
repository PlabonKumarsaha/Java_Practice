/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

/**
 *
 * @author PKS
 */
public class Mobile {
    
    private String name;
    private String color;
    private String processor;
    private String ram;
    
   
    private Mobile(Build build) {
     this.name = build.name;
    this.color = build.color;
    this.processor = build.processor;
    this.ram = build.ram;
    }

    //only set the getter methods of the Mobile class
    
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getProcessor() {
        return this.processor;
    }

    public String getRam() {
        return this.ram;
    }

    @Override
    public String toString() {
        return "Mobile{" + "name=" + name + ", color=" + color + ", processor=" + processor + ", ram=" + ram + '}';
    }
    
    
    //take a inner static class name Build 
    public static class Build{
        
        //copy all the member from the outer class
    private String name;
    private String color;
    private String processor;
    private String ram;
    
    //this method will be called at last
    // like this : mob2 = new Mobile.Build("OnePlus").setProcessor("dual core")
              //  .setRam("octa core").build(); ... so the build method will be the one who creates the class
    public Mobile build(){
        return new Mobile(this);
    }
    
    //all the setter method ..first memebr must be constrator
    public Build(String name){
        this.name = name;
    }
    public Build setColor(String color){
        this.color = color;
        return this;
    }
    
    public Build setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    
    public Build setRam(String ram){
        this.ram = ram;
        return this;
    }

      
    
    
        
        
    }
}
