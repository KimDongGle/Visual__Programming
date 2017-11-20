package chapter04_problems;


class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		/* �迭 a�� b�� ������ ���ο� �迭 ���� */
		int long1 = a.length;		//������ a,b�� �� �迭 ���̸� ��ȯ
		int long2 = b.length;
		int long3 = long1 + long2;	//������ �� �迭 ���̸� ����
		int arr[] = new int[long3]; //������ �� ���̸�ŭ �迭�� ���Ӱ� ����;
		int indexB = 0;
		
		for(int i = 0; i < arr.length; i++) { //�迭a��ŭ ������ ���� �� �迭 b ������ ù �迭 ���̸� ����
			if(i < long1)
				arr[i] = a[i];
			else
				arr[i] = b[i-long1];
		}
		return arr;
	}
	public static void print(int[] a) {	//������ for������ print �޼ҵ� ����
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