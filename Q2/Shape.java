public abstract class Shape {
    protected double dim1;
    protected double dim2;
    protected double PI;

    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = 3.14;
    }

    public abstract double area();

    public static void main(String[] args){
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);
        Shape figref; //this is OK, no object is created
        figref = r;
        System.out.println("Inside Area for Rectangle.");
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Inside Area for Triangle.");
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Inside Area for Circle.");
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Inside Area for Ellipse.");
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Inside Area for Square.");
        System.out.println("Area is " + figref.area());
    }
}
