package com.khrushchev.rectangle.entity;

public class Rectangle extends Point{

    private int id;
    private Point pointOne;
    private Point pointTwo;
    private Point pointThere;
    private double width;
    private double height;
    private double area;
    private double square;

    public Rectangle(){}

    public Rectangle(int id, Point pointOne, Point pointTwo, Point pointThere, double width, double height, double area, double square) {
        this.id = id;
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThere = pointThere;
        this.width = width;
        this.height = height;
        this.area = area;
        this.square = square;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Point getPointThere() {
        return pointThere;
    }

    public void setPointThere(Point pointThere) {
        this.pointThere = pointThere;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
