package Capitulo11;

public class Square extends GeometricFigure {


    @Override
    public Double Area() {
        double area;
        area = width*4;
        return area;
    }

    @Override
    public Integer displaySides() {

    }
}
