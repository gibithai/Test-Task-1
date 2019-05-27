package ru.stqa.pft.sandbox;


public class Length {

    public static double distance(Point p1, Point p2){
        double result = Math.sqrt((p1.x - p1.y)*(p1.x - p1.y)+(p2.y-p2.x)*(p2.y-p2.x));
        return result;
    }


}
