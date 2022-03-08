
package com.tunckasik.math;

public class ClassMath implements IntMath {

    @Override
    public void total (int a, int b) {
        
        System.out.println("Result of total : " + (a + b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Result of subtraction ; " + (a - b));
    }

    @Override
    public void multiplication (int a, int b) {
        System.out.println("Result of multiplication : " + (a * b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Result of division : " + ((double)a / b));
    }
    
}
