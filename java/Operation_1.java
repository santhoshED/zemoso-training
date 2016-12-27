/*Write a program that accepts two numbers and a operator like (+,-,*, /) as command line arguments and perform the appropriate operation indicated by the operator.*/
import java.util.Scanner;

public class Operation_1{
	double operand1;
	double operand2;
	String operator;
	double result;
	public Operation_1(
		double operand1,
		double operand2,
		String operator){
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	public void getResult(){
		switch(operator){
			case "+":
			 result = operand1 + operand2;
			break;
			case "-":
			 result = operand1 - operand2;
			break;
			case "/":
			 result = operand1 / operand2;
			break;
			case "*":
			 result = operand1 * operand2;
			break;
			default:
			System.out.println("not a valid operator");
		}
		System.out.println(result);
	} 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first operand");
		double operand1 = scanner.nextDouble();
		System.out.println("Enter second operand");
		double operand2 = scanner.nextDouble();
		System.out.println("Enter operator");
		String operator = scanner.next();
		Operation_1 op = new Operation_1(operand1,operand2,operator);
		op.getResult();

		
	}
}