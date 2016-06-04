/**
 * Created by Vadym on 04.06.2016.
 */
public class Circle extends Figure  {

    String nameFigure;
    double pi;
    int sideR;
    double squareCircle;

    Circle(){
        nameFigure = "Circle";

        sideR = 100;//ввести радиус


        pi = 3.14d;
        squareCircle = pi*sideR*2;

            }
}
