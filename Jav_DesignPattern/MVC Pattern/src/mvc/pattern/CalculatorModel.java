/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.pattern;

/**
 *
 * @author PKS
 */
public class CalculatorModel {
    
    private int calcuationValue;
    public void addTwoNumbers(int firstNum,int SecondNumber){
        calcuationValue = firstNum+SecondNumber;
    }
    public int getCalculationValue(){
        return calcuationValue;
    }
    
}
