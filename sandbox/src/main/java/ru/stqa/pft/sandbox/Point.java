package ru.stqa.pft.sandbox;

public class Point {

    public static Object p2;
    public  double x;
    public  double y;

    public double distance(Point p2){
        double result = Math.sqrt((x - y)*(x - y)+(p2.y-p2.x)*(p2.y-p2.x));
        return result;
    }

}


