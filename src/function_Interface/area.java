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
public class area implements Greetinterface {

    @Override
    public void sayHello(Ractangle a) {
        System.out.println("Ans="+a.getB()*a.getH());
    }

       
}
