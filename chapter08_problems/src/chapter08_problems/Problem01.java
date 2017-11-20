package chapter08_problems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		FileWriter fileWriter;
		File temp = new File("c:\\temp\\phone.txt");
		try {
			Scanner input = new Scanner(System.in);
			fileWriter = new FileWriter(temp);
						
			System.out.println("전화번호 입력 프로그램입니다.");
			
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = input.nextLine(); // 한 라인 저장
				if(line.equals("그만"))	// 그만을 equals 로 비교하고 있을 경우 break; 시켜서 while문 탈출
						break;
				fileWriter.write(line+"\r\n"); 
			}			
			System.out.println(temp.getPath()+"에 저장하였습니다.");	
			
			fileWriter.close(); // 파일 라이터를 닫아주지 않으면 데이터가 저장이 안됨
		} catch (IOException e) { // 예외처리
			e.printStackTrace();
		}
	}

}
