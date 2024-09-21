package Tugasprak3;

public class DemoKonversiSuhu {
	public static void main(String[] args) {
     
        KonversiSuhu2 konversi = new KonversiSuhu2();
        

        double celcius = 25.0;
        double fahrenheit = 77.0;

    
        System.out.println("Konversi Celcius ke Fahrenheit: " + celcius + "°C = " + konversi.celciusToFahrenheit(celcius) + "°F");
        System.out.println("Konversi Celcius ke Reamur: " + celcius + "°C = " + konversi.celciusToReamur(celcius) + "°R");
        System.out.println("Konversi Fahrenheit ke Reamur: " + fahrenheit + "°F = " + konversi.fahrenheitToReamur(fahrenheit) + "°R");
    }
}
