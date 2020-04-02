package com.kodilla;

public class Kalkulator {
    public int addAtoB(int a, int b){
        return a + b;
    }
    public int substractAFromB(int a, int b){
        return a - b;
    }
    public static void main (String[] args){
    Kalkulator calc = new Kalkulator();
    int result = calc.addAtoB(5,7);
    System.out.println("Result of this equation is:" + result);
    }
}
