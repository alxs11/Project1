package com.csc205.project1;

public class Point {

    //declares private variables for Point class
    private double x;
    private double y;

    //constructor for Point class, initialized to 0.0
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    //constructor with double parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //method to calculate distance between two points
    public double distance(Point p2) {
        double d = (Math.sqrt((Math.pow((p2.x - x), 2) + Math.pow((p2.y - y), 2))));
        return d;
    }

    //getter for x
    public double getX() {
        return x;
    }

    //setter for x
    public void setX(double newX) {
        this.x = newX;
    }

    //getter for y
    public double getY() {
        return y;
    }

    //setter for y
    public void setY(double newY) {
        this.y = newY;
    }

    //method setPoint, sets a point with values (#, #)
    public void setPoint(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    //method shiftX, shifts x a certain amount
    public double shiftX(double n) {
        return this.x + n;
    }

    //method shiftY, shifts y a certain amount
    public double shiftY(double n) {
        return this.y + n;
    }

    //rotate method, rotates the coordinates by a certain degree
    public void rotate(double angle) {
        this.x = (this.x * Math.cos(angle) - this.y * Math.sin(angle));
        this.y = (this.x * Math.sin(angle) + this.y * Math.cos(angle));
    }

    //method toString, outputs and formats the new coordinates
    public String toString() {
      String point = "Point{x = " + this.x + ", y = " + this.y + "}";

      return point;
    }


}
