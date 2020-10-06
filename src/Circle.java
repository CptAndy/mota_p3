public class Circle extends Shape implements Area {
    public double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
