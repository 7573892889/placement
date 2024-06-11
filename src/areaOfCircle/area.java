/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaOfCircle;

import java.util.Scanner;

/**
 *
 * @author chavd
 */
public class area {
    public static void main(String args[]){
        final double pi=3.14;
        int r = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the r=");
        r=sc.nextInt();
        System.out.println(2*pi*r);
    }
    
}
