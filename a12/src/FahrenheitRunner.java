// Chinonye Richmond
// Temp conversion
// 4-16-2024
// Converts fahrenheit to celsius  

public class FahrenheitRunner {
    public static void main(String[] args) throws Exception {
        Fahrenheit test1 = new Fahrenheit();
        test1.setFahrenheit(98.6);
        test1.getCelsius();
        test1.printC();

        Fahrenheit test2 = new Fahrenheit();
        test2.setCelsius(37.0);
        test2.getFahrenheit();
        test2.printF();
    }
}
