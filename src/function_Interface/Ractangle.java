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
public class Ractangle {
    private int h,b;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Ractangle() {
        this.h = h;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Ractangle{" + "h=" + h + ", b=" + b + '}';
    }
    
}
