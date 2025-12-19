package edu.udea.repaso.hw1;

public class GreatCircle {
    public static void main(String[] args) {
        final double R = 6371.0; 
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double t1 = Math.pow(Math.sin(Math.toRadians((x2 - x1)/2)),2);
        double t2 = Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.pow(Math.sin(Math.toRadians((y2 - y1)/2)),2);
        double distance = 2*R*Math.asin(Math.sqrt(t1 + t2));
        System.out.println(distance + " kilometers");
    }
}
