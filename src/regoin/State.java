/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regoin;

/**
 *
 * @author chavd
 */
public class State extends Contry{
    private String StateName;

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String StateName) {
        this.StateName = StateName;
    }

    @Override
    public String toString() {
        return "State{" + "StateName=" + StateName + '}';
    }
    

   
    
    
}
