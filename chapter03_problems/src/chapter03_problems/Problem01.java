package chapter03_problems;

public class Problem01 {
	public static void DoWhileTest() {
		int sum = 0, i = 0;
		do {
			sum = sum + i;
			i += 2;
		}while(i < 100);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		DoWhileTest();
	}

}


(1) 2씩 커지는 i를 100이 될때 까지 더 해주는 while 문이다.
실행 결과는 2450이 나온다.

(2)
	public static void WhileTest() {
		int sum = 0, i = 0;
		while(i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		sum();
	}
	
(3) 
	public static void ForTest() {
		int sum = 0, i = 0;
		for(i = 0; i < 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		ForTest();
	}
	
(4)
	public static void DoWhileTest() {
		int sum = 0, i = 0;
		do {
			sum = sum + i;
			i += 2;
		}while(i < 100);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		DoWhileTest();
	}


*/