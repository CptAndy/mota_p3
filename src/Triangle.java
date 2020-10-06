public class Triangle extends Shape implements Area {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "triangle";
    }


    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
