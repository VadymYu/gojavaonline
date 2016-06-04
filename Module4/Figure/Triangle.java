/**
 * Created by Vadym on 04.06.2016.
 */
public class Triangle extends Figure {

    String nameFigure;
    int sideA;
    int sideH;
    int squareTriangle;

    Triangle(){
        nameFigure = "Triangle";

        sideA = 4;//ввести сторону треугольника
        sideH = 5;//ввести высоту треугольника


        squareTriangle = sideA/2*sideH;
    }
}