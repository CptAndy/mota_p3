public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "sphere";
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * (radius * radius * radius);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * (radius * radius);
    }
}
