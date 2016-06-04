/**
 * Created by Vadym on 04.06.2016.
 */
public class Temperature {

    public static void main (String[] args){

        String typeTemperature1 = "C to F";
        String typeTemperature2 = "F to C";


        double C = -25d;//ввести температуру по Цельсию
        double F = 105d;//ввести температуру по Фаренгейту

        double CtoF = C * 1.8 + 32;
        double FtoC = (F -32) / 1.8;

        System.out.println("Temperature from "+typeTemperature1+", where "+C+" by C is equal "+CtoF+" by F");
        System.out.println("Temperature from "+typeTemperature2+", where "+F+" by F is equal "+FtoC+" by C");

    }
}
