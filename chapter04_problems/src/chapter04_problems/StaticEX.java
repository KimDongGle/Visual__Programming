package chapter04_problems;


class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		/* 배열 a와 b를 연결한 새로운 배열 리턴 */
		int long1 = a.length;		//가져온 a,b의 각 배열 길이를 변환
		int long2 = b.length;
		int long3 = long1 + long2;	//가져온 두 배열 길이를 더함
		int arr[] = new int[long3]; //더해진 그 길이만큼 배열을 새롭게 생성;
		int indexB = 0;
		
		for(int i = 0; i < arr.length; i++) { //배열a만큼 데이터 삽입 후 배열 b 순서시 첫 배열 길이를 빼줌
			if(i < long1)
				arr[i] = a[i];
			else
				arr[i] = b[i-long1];
		}
		return arr;
	}
	public static void print(int[] a) {	//간단한 for문으로 print 메소드 구현
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
}
public class StaticEX {	
	public static void main (String[] args){
		int [] array1 = { 1, 5, 7, 8 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
