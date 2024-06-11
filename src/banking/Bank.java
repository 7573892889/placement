/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author chavd
 */
public interface Bank {
    int     MIN_BAL=1000;
    int DEPOSYER_LIMIT=20000;
    int WITHDRAW_LIMIT=10000;
     void deposite(Account acc,int amt);
     void withdraw(Account acc,int amt);
     void totalAmt(Account acc);
}
