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
public class Employee extends member {
    private String specialization;
    
    public Employee(String name, String Address, int phone_no, int salary, int age,String specialization) {
        super(name,Address,phone_no,salary,age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +"name="+ getName()+ "  Address="+ getAddress()+"  phone_no=" +getPhone_no()+ "  salary="+ getSalary()+ " age=" + getAge()+ "    specialization=" + specialization + '}';
    }
    
    
}
