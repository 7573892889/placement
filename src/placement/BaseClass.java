/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

/**
 *
 * @author chavd
 */
public class BaseClass {
    private int admount;

    @Override
    public String toString() {
        return "BaseClass{" + "admount=" + admount + '}';
    }

    public int getAdmount() {
        return admount;
    }

    public void setAdmount(int admount) {
        this.admount = admount;
    }
    
}
