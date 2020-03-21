import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape("some text", "some material");
        System.out.println(myShape.toString());
        System.out.println(myShape.getSize());

        Triangle myTriangle = new Triangle("I reflect light","glass",4,6);
        System.out.println(myTriangle.toString());
        System.out.print("Triangle area: ");
        System.out.println(myTriangle.getSize());

        Rectangle myRectagle = new Rectangle("Yellow rectangle", "steel", 4,5);
        System.out.println(myRectagle.toString());
        System.out.print("Rectangle area: ");
        System.out.println(myRectagle.getSize());

        Triangle newTriangle = myTriangle;

        System.out.println(myRectagle.equals(myTriangle));
        System.out.println(newTriangle.equals(myTriangle));

        System.out.println(myRectagle.hashCode() == myTriangle.hashCode());
        System.out.println(newTriangle.hashCode() == myTriangle.hashCode());

        Shape firstShape = new Shape();
        Shape secondShape = new Shape("ceva", "altceva");

        Triangle firstTriangle = new Triangle("primul triunghi","lemn",3,6);
        Triangle secondTriangle = new Triangle("al doilea triunghi","lemn",3,2);

        Rectangle firstRactangle = new Rectangle("primul dreptunghi","lemn",4,4);
        Rectangle secondRactangle = new Rectangle("al doilea dreptunghi","lemn",4,2);

        ArrayList<Shape> myArr = new ArrayList<Shape>();
        myArr.add(firstShape);
        myArr.add(secondShape);
        myArr.add(firstTriangle);
        myArr.add(secondTriangle);
        myArr.add(firstRactangle);
        myArr.add(secondRactangle);

        for(int i=0; i<myArr.size(); i++){
            System.out.println(myArr.get(i).toString() + "\n");
        }

        for(int i=0; i<myArr.size(); i++){
            System.out.println(myArr.get(i).getSize() + "\n");
        }

        for(int i=0; i<myArr.size(); i++){
            if(myArr.get(i) instanceof Triangle){
                ((Triangle) myArr.get(i)).displayTriangleHeight();
            } else if(myArr.get(i) instanceof Rectangle){
                ((Rectangle) myArr.get(i)).displayRectangleHeight();
            }
        }
    }
}
