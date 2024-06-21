/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


public class TestClass {

    public static void main(String args[]) {
        ComputeMethods compute = new ComputeMethods();
        double CelsiusTemp = compute.fToC(100.4);
        System.out.println("Temp in celsius is " + CelsiusTemp);
        double length = compute.hypotenuse(6, 9);
        System.out.println("Hypotenuse is " + length);
        int total = compute.roll();
        System.out.println("The sum of the dice values is " + total);
    }
}
