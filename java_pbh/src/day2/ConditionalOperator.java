package day2;

public class ConditionalOperator {
	public static void main(String[] args) {
		//조건선택연산자 예제
		int num = 5;
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "는 " + result);
	}
}
