package Capitulo11;

public class Triangle extends GeometricFigure {



    @Override
    public Double Area() {
        double area;
        area = (width*height)/2;
        return area;
    }
}
