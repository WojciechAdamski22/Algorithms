package strings;

/**
 * 
 * Given a roman numeral, convert it to an integer.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 * 
 * @author Wojciech Adamski
 *
 */
public class RomanToInteger {

	public static void main(String[] args) {
		String romanNumber = "MMCDLXXXIV";
		System.out.println("Integer value of given roman number is = "+romanToInt(romanNumber));
	}
	
	private static int romanToInt(String romanNumber) {
		int sum = 0;
		if(romanNumber.indexOf("IV")!= -1) sum-=2;
		if(romanNumber.indexOf("IX")!= -1) sum-=2;
		if(romanNumber.indexOf("XL")!= -1) sum-=20;
		if(romanNumber.indexOf("XC")!= -1) sum-=20;
		if(romanNumber.indexOf("CD")!= -1) sum-=200;
		if(romanNumber.indexOf("CM")!= -1) sum-=200;
		
		char c[] = romanNumber.toCharArray();
		int count=0;
		for(;count<romanNumber.length();count++) {
			if(c[count] == 'M') sum+=1000;
			if(c[count] == 'D') sum+=500;
			if(c[count] == 'C') sum+=100;
			if(c[count] == 'L') sum+=50;
			if(c[count] == 'X') sum+=10;
			if(c[count] == 'V') sum+=5;
			if(c[count] == 'I') sum+=1;
		}
		return sum;
	}
}
