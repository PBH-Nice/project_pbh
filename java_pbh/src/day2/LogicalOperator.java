package day2;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리 연산자 예제
		//!연산자
		System.out.println("4는 짝수인가? " + (4 % 2 == 0));
		System.out.println("4는 홀수가 아닌가? " + !(4 % 2 != 0));
		//변수 num가 2의 배수이고 3의 배수이면 6의 배수이다.
		int num = 6;
		System.out.println(num + "는 6의 배수인가? : " + (num % 2 == 0 && num % 3 == 0));

		
		
		/*
		 * 청소년은 14세부터 19세까지이다
		 * 나이가 age인 학생은 청소년이 아닌지 확인하는 예제
		 * 
		 */
		int age = 19;
		System.out.println(age + "살인 학생은 청소년이 아닌가? " + (age < 14 || age > 19));
	
		//xor 연산자 예제
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
	}
}
