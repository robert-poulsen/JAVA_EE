package valerij.task5.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
    }
}
