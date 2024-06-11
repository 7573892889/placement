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
public class bank {
    private int balance;
    private String accName;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    
     public void withdraw(int amount){
         int salary=balance-amount;
         try{
             if(salary<1000){
                 throw new BelowSalaryException();
             }else
             {
                 this.balance=salary;
             }
         }catch(BelowSalaryException ex){
             System.out.println(ex.getMessage());
         }
     }
     @Override
    public String toString() {
        return "bank{" + "balance=" + balance + ", accName=" + accName + '}';
    }
}
