/*******
* TempConvert
********
* asks the user a temperature value and converts from one scale to another using many different methods
*____________
* Miles Marshall
* 10/10/19
* CMSC 255 Section
*********/

import java.util.Scanner;
public class TempConvert {
	public static void main(String[] args) {
/*******		
* Create and Call processData
*******/
		processData();
	}
	
	
	

	public static void processData() {
		String numConversions = "yes";
		/**
		* create scanner object
		**/
		Scanner input = new Scanner(System.in);
		/**
		* create a while loop for the conversions so the user can keep making conversions until quit is answered
		**/
		while (!numConversions.equals("quit")) {
		/***
		* First prompt the user to enter a temperature value
		* Next prompt the user to enter the current scale they would like to user
		* Finally, prompt the user to enter the scale they would like to convert their temperature to 
		***/
			System.out.println("Enter the temperature to convert: ");
			double temp = input.nextDouble();
			input.nextLine();
			System.out.println("Enter the current scale of the temperature: ");
			String scale = input.nextLine();
			System.out.println("Enter the scale you want to convert the temperature to: ");
			String scaleTo = input.nextLine();
			boolean goodValue = checkValidity(temp, scale);
			/**
			* create if statements to call different conversion methods depending on what scales the user enters
			**/
			if(goodValue) {
				if(scale.equals("Fahrenheit") && scaleTo.equals("Celsius")) {
				double conversion1 = convertFahtoCel(temp);
					System.out.printf("%.2f degrees %s is %.2f degrees %s%n", temp, scale, convertFahtoCel(temp), scaleTo);	
				}
				if(scale.equals("Fahrenheit") && scaleTo.equals("Kelvin")) {
				double conversion2 = convertFahtoKel(temp);
					System.out.printf("%.2f degrees %s is %.2f degrees %s%n", temp, scale, convertFahtoKel(temp), scaleTo);
				}
				if(scale.equals("Celsius") && scaleTo.equals("Fahrenheit")) {
				double conversion3 = convertCeltoFah(temp);
					System.out.printf("%.2f degrees %s is %.2f degrees %s%n", temp, scale, convertCeltoFah(temp), scaleTo);
				}
				if(scale.equals("Celsius") && scaleTo.equals("Kelvin")) {
				double conversion4 = convertCeltoKel(temp);
					System.out.printf("%.2f degrees %s is %.2f degrees %s%n", temp, scale, convertCeltoKel(temp), scaleTo);
				}
				if(scale.equals("Kelvin") && scaleTo.equals("Celsius")) {
				double conversion5 = convertKeltoCel(temp);
					System.out.printf("%.2f degrees %s is %.2f degrees %s%n", temp, scale, convertKeltoCel(temp), scaleTo);
				}
				if(scale.equals("Kelvin") && scaleTo.equals("Fahrenheit")) {
				double conversion6 = convertKeltoFah(temp);
					System.out.printf("%.2f degrees %s is %.2f degrees %s%n", temp, scale, convertKeltoFah(temp), scaleTo);
				}
				else {
				System.out.println(temp +" degrees " + scale + " is " + temp + " degrees " + scale);
				}
			}
			/**
			* the else statement will ouput "is not a valid temperature" if the temperature entered does not meet the requirements in
			checkValidity
			***/
			else {
				System.out.println(temp +" degrees " + scale + "is not a valid temperaure");
			}
			System.out.println("Would you like to convert another temperature? Enter quit to exit.");
			numConversions = input.nextLine().trim();
		}
	
	}
	
	
	/**
	* this method will check the temperature value the user enters and check to make sure it is a valid temperature
	* if so, it will return true. If not, it will return false.
	***/
	public static boolean checkValidity(double temp, String scale) {
		if (scale.equals("Fahrenheit") && (temp >= -459.40 && temp <= 1000)) {
			return true;
		}
		else if (scale.equals("Celsius") && (temp >= -273 && temp <= 1000)) {
			return true;
		}	
		else if (scale.equals("Kelvin") && (temp >= 0 && temp <= 1000)) {
			return true;
		}
		else
			return false;
	
	}
	/**
	* this method converts Fahrenheit to celsius 
	**/
	public static double convertFahtoCel(double temp) { 
	double Celsius = (temp - 32) / (9.0/5);
	
	return Celsius;
	}
	/**
	*  this method converts Fahrenheit to Kelvin
	**/
	public static double convertFahtoKel(double temp) { 
	double intermediate = (temp - 32) / (9.0/5);
	double Kelvin = (intermediate + 273);
	
	return Kelvin;
	}
	/**
	* this method converts Celsius to Fahrenheit
	**/
	public static double convertCeltoFah(double temp) { 
	double Fahrenheit = (temp * (9.0 / 5) + 32);
	return Fahrenheit;
	}
	/**
	* this method converts Celsius to Kelvin
	**/
	public static double convertCeltoKel(double temp) { 
	double intermediate = temp;	
	double Kelvin = (intermediate + 273);
	return Kelvin;
	}
	/**
	* this method converts Kelvin to celsius
	**/
	public static double convertKeltoCel(double temp) { 
	double intermediate = (temp - 273);
	double Kelvin = (intermediate + 273);
	return intermediate;
	}	
	/**
	* this method converts Kelvin to Fahrenheit
	**/
	public static double convertKeltoFah(double temp) { 
	double intermediate = (temp - 273);
	double Fahrenheit = (intermediate * (9.0 / 5) + 32);
	return Fahrenheit;
	}
	
	
		}
	





