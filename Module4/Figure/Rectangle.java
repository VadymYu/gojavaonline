/**
 * Created by Vadym on 04.06.2016.
 */
public class Rectangle extends Figure {

    String nameFigure;
    int sideA;
    int sideB;
    int squareRectangle;

Rectangle(){
    nameFigure = "Rectangle";

    sideA = 5;//ввести сторону А прямоугольника
    sideB = 4;//ввести сторону Б прямоугольника

    squareRectangle = sideA*sideB;
}

}
