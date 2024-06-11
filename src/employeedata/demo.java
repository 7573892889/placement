/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

/**
 *
 * @author chavd
 */
public class demo {
    public static void main(String args[]){
        Employee e=new Employee("chavda kishan","muli",123456789,100000,20,"afa");
        System.out.println(e);
        manager m=new manager("chavda kishan","muli",123456789,100000,20,"afa");
        System.out.println(m);
    }
}
