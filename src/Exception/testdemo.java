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
public class testdemo {
    public static void main(String args[]){
        bank b=new bank();
        b.setAccName("chavda");
        b.setBalance(1000);
        b.withdraw(40000);
        System.out.println(b);
    }
    
}
