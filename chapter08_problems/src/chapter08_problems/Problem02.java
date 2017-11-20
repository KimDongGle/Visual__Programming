package chapter08_problems;
import java.io.*;

public class Problem02 {
	public static void main(String[] args) {  //예제 8-1 참고
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\temp\\phone.txt");  //읽어들일 경로 설정
			int c;
			while ((c = fin.read()) != -1) { // 파일의 끝을 만나면 -1를 만나면 리턴
				System.out.print((char)c); //한 문자씩 읽어들임.
			}
			fin.close();	
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
