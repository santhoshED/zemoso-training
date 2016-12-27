/* Write a program that accepts a number in the range 1 to 50 from the Command Line. It then compares the number against a single dimension array of five integer elements ranging in value from 1 to 50. The program displays the message BINGO once the given input is found in the array */

import java.util.Scanner;
import java.util.*;

public class Bingo_1{
	public int[] thearray = {5,10,15,20,25};
	int number;
	public Bingo_1(int num){
		if (num >1 && num<50)
			this.number = num;
	}
	private void checkForNumber(){
		if(number==0)
			System.out.println("Invalid input");
		
		Arrays.sort(this.thearray);
		if(Arrays.binarySearch(thearray,number)>=0)
			System.out.println("BINGO");
	}
	public static void main(String[] args) {
		while(true){
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Bingo_1 bg = new Bingo_1(number);
		bg.checkForNumber();
		}
	}
} 