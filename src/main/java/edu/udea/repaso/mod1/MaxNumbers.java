package edu.udea.repaso.mod1;

public class MaxNumbers {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int maxNum = Math.max(num1,Math.max(num2, num3));
        int minNum = Math.min(num1,Math.min(num2, num3));
        int midNum = num1 + num2 + num3 - (maxNum + minNum);
        System.out.println("Numeros ordenados: " + maxNum + " - " + midNum + " - " + minNum);
    }
}
