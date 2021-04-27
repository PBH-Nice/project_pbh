package day2;

import java.util.Scanner;

public class Test2_8 {

	public static void main(String[] args) {
		/*
		 * 두 정수와 산술 연산자를 입력받아
		 * 입력받은 연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 예시
		 * 두 정수와 연산자를 입력하세요 : 1 + 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		System.out.print(num1 + " " + op + " " + num2 + " = ");
		if(op == '+') {
			System.out.println(num1 + num2);
		} else if(op == '-') {
			System.out.println(num1 - num2);
		} else if(op == '*') {
			System.out.println(num1 * num2);
		} else if(op == '/') {
			System.out.println(num1 / num2);
		} else if(op == '%') {
			System.out.println(num1 % num2);
		}
		
		
		sc.close();
	}

}
