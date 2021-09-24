public class CtoFTester {
    public static double celsiusToFahrenheit(double c) {
        return((c * (9/5)) + 32);
    }
    public static double fahrenheitToCelsius(double f) {
        return((f-32)*5/9);
    }
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(100));
        System.out.println(celsiusToFahrenheit(100));
    }

}
