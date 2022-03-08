
package com.tunckasik.math;

public class ClassMath implements IntMath {

    @Override
    public void sum(int a, int b) {
        
        System.out.println("Result of total : " + (a + b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Result of subtraction ; " + (a - b));
    }

    @Override
    public void times(int a, int b) {
        System.out.println("Result of multiplication : " + (a * b));
    }

    @Override
    public void divide(int a, int b) {
        System.out.println("Result of division : " + ((double)a / b));
    }
    
}
