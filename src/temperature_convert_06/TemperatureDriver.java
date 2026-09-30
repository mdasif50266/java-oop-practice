package temperature_convert_06;

import java.util.Scanner;

public class TemperatureDriver {
    public static void main(String[] args) {
        Temperature t=new Temperature();
        Scanner p=new Scanner(System.in);
        System.out.print("Enter temp in celsius : ");
        double celsius=p.nextDouble();
        System.out.println("To farenheit : "+t.toFarenheit(celsius));
        System.out.println("To kelvin : "+t.tokelvin(celsius));


    }
}
