package ru.stqa.pft.sandbox;

public class MyFirstTask {
   public static Point p1 = new Point();
   public static Point p2 = new Point();
public static void main (String[] args) {


    p1.x = 7;
    p2.y = 9;
    p2.x = 3;
    p1.y = 4;

System.out.println (distance(p1, p2));
System.out.println (p1.distance(p2));
}
    public static double distance(Point p1, Point p2){
        double  result = Math.sqrt((p1.x - p1.y)*(p1.x - p1.y)+(p2.y-p2.x)*(p2.y-p2.x));
        return  result;
    }
}
