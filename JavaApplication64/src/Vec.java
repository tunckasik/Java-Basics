
import java.util.Scanner;


public class Vec {
    
        private String name;
        private int a;
        private int b;
        private int c;
   
    public Vec (String name) {
        
        this.name = name;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(name + "Vektorun a, b, ve c degerlerini girin; ");
        System.out.println("a : ");
        this.a = sc.nextInt();
        System.out.println("b : ");
        this.b = sc.nextInt();
        System.out.println("c : ");
        this.c = sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}

