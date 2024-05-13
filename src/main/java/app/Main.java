package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter App.");

        double f = 10;
        double celFromFar = convFarToCel(f) ;
        System.out.println("Result is " + celFromFar + " celsius.");

        double c = 12;
        double farFromCel = convCelToFar(c) ;
        System.out.println("Result is " + celFromFar + " farengates.");
    }

    public static double convFarToCel(double f) {
        return (f-32)/5*9;
    }

    public static double convCelToFar(double f) {
        return f * 9 / 5 + 32;
    }
}
