package chapter08_problems;
import java.io.*;


public class Problem03 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");  //읽어들일 경로 설정
			int c;
			while ((c = fin.read()) != -1) { // 파일의 끝을 만나면 -1를 만나면 리턴
				System.out.print(Character.toUpperCase((char)c)); //한문자씩 읽어들이고 변환 함수를 
			}													  //사용해서 소문자를 대문자로 바꾼다.
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
