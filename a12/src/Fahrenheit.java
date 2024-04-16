public class Fahrenheit {
    private double fahrenheit;

	public void setFahrenheit(double fahren){
        fahrenheit = fahren;
    }
	
	public double getCelsius()
	{
        // this formula converts celsius to fahrenheit
		double celsius = (fahrenheit - 32.0)*(5.0/9.0);
		return celsius;
	}

	public void print(){
		System.out.println(getCelsius() + " Celsius");
	}
}
