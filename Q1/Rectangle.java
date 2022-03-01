public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = width;
        setColor(color);
        setFilled(filled);
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

    public double getArea(){
        return (this.width * this.height);
    }

    public double getPerimeter(){
        return (this.width * 2 + this.height * 2);
    }
}
