/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author PKS
 */
public class StrategyDesignPattern {

    /*
    Reference : https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
      In Strategy pattern, a class behavior or its algorithm can be changed at run time. 
      This type of design pattern comes under behavior pattern.
     keep in mind about two factors :
     * 1.avoid duplicate code
     * 2.One class must not effect another class.
    So first create an Interface that will have the common functionality.
    Then,implemnet the method in the other classes.
    After that,Create a context class that will insatntiate and call the desired method.
    Create the intsance like this  Context context = new Context(new OperationAdd()); to get the desired output acordingly.
    This method helps to use the right exact method object needed instead of  using inheritance .
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Context context = new Context(new OperationAdd());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        
    }
    
}
