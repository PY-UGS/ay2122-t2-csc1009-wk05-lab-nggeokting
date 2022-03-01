import java.lang.Math;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }

    public double getPerimeter(){
        return (2 * Math.PI * this.radius);
    }

    public double getDiameter(){
        return (this.radius * 2);
    }

    public void printCircle(){
        System.out.println("Circle");
    }
}