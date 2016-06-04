/**
 * Created by Vadym on 04.06.2016.
 */
public class Coordinates {

    public static void main (String[] args){


        int coordinateX1 = 3;   //ввести значение оси абсцисс точки А
        int coordinateY1 = 3;   //ввести значение оси ординат точки А
        int coordinateX2 = 12;  //ввести значение оси абсцисс точки В
        int coordinateY2 = 5;   //ввести значение оси ординат точки В

        double distance = Math.sqrt(((coordinateX2 - coordinateX1)*(coordinateX2 - coordinateX1)-(coordinateY2 - coordinateY1)*(coordinateY2 - coordinateY1)));


        System.out.println("Distance between point A("+coordinateX1+";"+coordinateY1+") and point B("+coordinateX2+";"+coordinateY2+") is "+distance);


    }
}
