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
public class member {
    private String name,Address;
    private int phone_no,salary,age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "emp{" + "name=" + name + ", Address=" + Address + ", phone_no=" + phone_no + ", salary=" + salary + ", age=" + age + '}';
    }

    public member(String name, String Address, int phone_no, int salary, int age) {
        this.name = name;
        this.Address = Address;
        this.phone_no = phone_no;
        this.salary = salary;
        this.age = age;
    }
    
}
