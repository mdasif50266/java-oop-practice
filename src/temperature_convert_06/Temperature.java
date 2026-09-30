package temperature_convert_06;

public class Temperature {
    private double celsius;
    public double toFarenheit(double celsius)
    {
        this.celsius=celsius;
        return (celsius*9/5)+32;
    }
    public double tokelvin(double cel)
    {
        this.celsius=cel;
        return celsius+273;
    }
}
