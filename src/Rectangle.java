import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material, int width, int height) {
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight(){
        System.out.println("Rectangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle: height is " + this.height + ", width is : " + this.width +
                ", made of " + this.getMaterial() + ", contains the text: \"" +
                this.getText() + "\".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
