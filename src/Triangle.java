import java.util.Objects;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    public void displayTriangleHeight() {
        System.out.println("Triangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        return (double)(this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: height is " + this.height + ", base is: " + this.base +
                ", made of " + this.getMaterial() + ", contains the text: \"" +
                this.getText() + "\".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return base == triangle.base &&
                height == triangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }
}
