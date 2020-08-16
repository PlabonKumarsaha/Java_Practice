/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

/**
 *
 * @author PKS
 */
public class CalculatorController {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;
    public CalculatorController(CalculatorView calculatorView,CalculatorModel calculatorModel){
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        this.calculatorView.addCalculateListener( new CalculateListener());   

    }
    
    class CalculateListener implements ActionListener{
        
      
        @Override
        public void actionPerformed(ActionEvent e) {
           
       try{
           int firstNumber, secondNumber = 0;
           firstNumber = calculatorView.getFirstNumber();
           secondNumber = calculatorView.getSecondNumber();
           calculatorModel.addTwoNumbers(firstNumber, secondNumber);
           calculatorView.setCalcSolutionNumber(calculatorModel.getCalculationValue());
           

           
       } catch(Exception exc){
           exc.printStackTrace();
       }
        
        }
        
    }
    
}
