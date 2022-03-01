public class Circle extends Shape{
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (PI * dim1 * dim2);
    }
}
