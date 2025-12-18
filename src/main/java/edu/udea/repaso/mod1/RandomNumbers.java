package edu.udea.repaso.mod1;

public class RandomNumbers {
    public static void main(String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();
        double num5 = Math.random();
        double prom = (num1 + num2 + num3 + num4 + num5)/5;
        double minNum = Math.min(num5, Math.min(num4,Math.min(num3,Math.min(num2,num1))));
        double maxNum = Math.max(num5, Math.max(num4,Math.max(num3,Math.max(num2,num1))));
        System.out.println("Numeros: " + 
                            num1 + " - " + 
                            num2 + " - " + 
                            num3 + " - " + 
                            num4 + " - " + 
                            num5);
        System.out.println("Promedio: " + prom);
        System.out.println("Minimo: " + minNum);
        System.out.println("Maximo: " + maxNum);        
    }
}
