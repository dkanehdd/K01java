package ex05method;

import java.util.Scanner;

/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
 */
public class QuTemperature {

	
	static double celsiusToFahrenheit(double cel) {
		return cel*1.8+32;
	}
	
	static double fahrenheitToCelsius(double fah) {
		return (fah-32)/1.8;
	}
	
	
	static double fahrenheit(double a) {
		double fahrenheit = a*1.8+32;
		return fahrenheit;
	}
	static double celsius(double b) {
		double celsius = (b-32)/1.8;
		return celsius;
	}
	public static void main(String[] args) {
		System.out.println("섭씨20도->화씨="+celsiusToFahrenheit(20));
		System.out.println("화씨98도->섭씨="+fahrenheitToCelsius(98));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("섭씨를 입력하세요:");
		double cel = scan.nextInt();
		System.out.println(fahrenheit(cel)+"'F");
		System.out.print("화씨를 입력하세요:");
		double fahren = scan.nextInt();
		System.out.printf("%.1f'C",celsius(fahren));
	}

}


