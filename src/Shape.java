import java.util.Objects;

public class Shape {
    private String text;
    private String material;

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public Shape() {
        this.text = "";
        this.material = "";
    }

    protected String getText() {
        return text;
    }

    protected String getMaterial() {
        return material;
    }

    public double getSize(){
        return -1;
    }

    @Override
    public String toString() {
        return "made of " + this.material + ", conains the text: \"" +
                this.text + "\".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(text, shape.text) &&
                Objects.equals(material, shape.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, material);
    }
}
