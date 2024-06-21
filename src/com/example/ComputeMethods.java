
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;


public class ComputeMethods {
    
     public double fToC(double degreesF) {
        double degreesC = 5.0 / 9.0 * (degreesF - 32);
        return degreesC;
    }


    public  double hypotenuse(int a, int b) {
        double length = Math.sqrt(a * a + b * b);
        return length;
    }

    public int roll() {
        int sum;
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        sum = roll1 + roll2;
        return sum;
}
}
