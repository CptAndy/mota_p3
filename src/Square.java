public class Square extends Shape implements Area {
    public double sides;

    public Square(double sides) {
        super();
        this.sides = sides;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getArea() {
        return sides * sides;
    }
}
