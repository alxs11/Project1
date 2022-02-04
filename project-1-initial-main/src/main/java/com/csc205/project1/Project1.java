package com.csc205.project1;

/**
 * Driver class used to test Point implementation for Project 1.
 *
 * @author Ray Hedgecock
 * @version 1.1
 */
public class Project1 {

    public static void main(String[] args) {

        System.out.println("Project 1 : Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);

        Point b2 = new Point(b.getX(), b.getY());

        //I did change this, I couldn't get it to work otherwise
        //thank you!!
        b2.setPoint(b.shiftX(4), b.shiftY(-2));
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b2);

    }
}
/*Output
Project 1 : Point Tester

Point 1: Point{x = 3.0, y = 1.0}
Point 2: Point{x = 6.0, y = 5.0}

Distance: 5.0

Rotated a 1.5707963267948966: Point{x = -0.9999999999999998, y = -0.9999999999999997}
Shifted b 4.47213595499958 away from original position: Point{x = 10.0, y = 3.0}
 */
