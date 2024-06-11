/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function_Interface;

/**
 *
 * @author chavd
 */
public class test extends area {
    
    
    public static void main(String args[]){
        Ractangle r=new Ractangle();
        r.setB(45);
        r.setH(10);
        area a=new area();
        a.sayHello(r);
        
    }
}
