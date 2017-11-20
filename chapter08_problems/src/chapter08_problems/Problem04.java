package chapter08_problems;

import java.io.FileReader;
import java.io.IOException;

public class Problem04 {
	public static void start() {		//처음 출력을 지정해둔 메소드
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
		System.out.printf("%4d", 1);
		System.out.print(": 1");
		System.out.print("1");
	}
	
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");  //읽어들일 경로 설정
			int c;
			int line = 1;
			
			char changeLine = '\n';
			int changeLineInt = (int)changeLine;
			
			start();  //처음 출력을 지정해준 메소드 실행
			
			while ((c = fin.read()) != -1) { // 파일의 끝을 만나면 -1를 만나면 리턴
				if(c == changeLineInt) {	// 만약 \n과 만난경우
					line++;		// 라인번호를 추가
					System.out.printf("%4d", line);		//라인 번호 출력
					System.out.print(": ");
				} else {
					System.out.print((char)c); //이외 \n이 아닐시 한문자씩 문자 출력
				}
			}													  
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
