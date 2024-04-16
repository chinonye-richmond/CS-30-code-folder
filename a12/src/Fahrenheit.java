public class Fahrenheit {
    private double fahrenheit;
    private double celsius;


	public void setFahrenheit(double fahren){
        fahrenheit = fahren;
    }
    public void setCelsius(double cel){
        celsius = cel;
    }
	
	public double getCelsius()
	{
        // this formula converts celsius to fahrenheit
		double celsius = (fahrenheit - 32.0)*(5.0/9.0);
		return celsius;
	}

    public double getFahrenheit(){
        double fahrenheit = (celsius *(9.0/5.0))+ 32.0;
        return fahrenheit;

    }

	public void printC(){
		System.out.println(getCelsius() + " Celsius");
	}

    public void printF(){
		System.out.println(getFahrenheit() + " Fahrenheit");
	}
}

