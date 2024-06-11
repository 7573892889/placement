/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author chavd
 */
public class BelowSalaryException extends Exception {

    public BelowSalaryException() {
        System.out.println("your balance is less than 1000");
    }
    
}
