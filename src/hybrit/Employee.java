/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybrit;

/**
 *
 * @author chavd
 */
public class Employee extends person {
    private String dpt;
    static String name="chavda";
    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    @Override
    public String toString() {
        return "Employee{" + "dpt=" + dpt + '}';
    }

    public Employee(String name,String city,String dpt) {
        super(name,city);
        this.dpt = dpt;
    }
    
    
}
