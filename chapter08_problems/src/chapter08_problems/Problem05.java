package chapter08_problems;
import java.io.*;
import java.util.Scanner;

public class Problem05 {
	static String fileOne;
	static String fileTwo;
	
	public static void start () {	//코드가 시작하며 두 파일의 이름을 입력받음.
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		fileOne = scanner.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		fileTwo = scanner.nextLine();
		System.out.println(fileOne + "와 " + fileTwo + "를 비교합니다.");
		scanner.close();
	}
	
	private static void checkFile(FileInputStream one, FileInputStream two) throws IOException {	
		//파일을 비교하고 결과값 메세지를 출력해줌.
		byte[] oneBuf = new byte[1024];
		byte[] twoBuf = new byte[1024];		
		int oneC, twoC, checkNum = 0;
		
		while(checkNum == -1) { //같지 않으면 while문 탈출
			oneC = one.read(oneBuf, 0, oneBuf.length);
			twoC = two.read(twoBuf, 0, twoBuf.length);		
			if(oneC != twoC) 	//같지 않는 경우
				checkNum = -1;
			if(oneC == -1)		//파일 검사완료 후 break로 탈출
				break;		
			for (int i = 0; i < twoC; i++) {
				if (oneBuf[i] != twoBuf[i])
					checkNum = -1;
			}
		}		
		if(checkNum != -1)
			System.out.println("파일이 같습니다");
		else
			System.out.println("파일이 다릅니다");
	}
	
	public static void main(String[] args) {	
		FileInputStream one = null;
		FileInputStream two = null;			
		start();
		
		try {
			one = new FileInputStream(fileOne);
			two = new FileInputStream(fileTwo);			
			checkFile(one, two);
            one.close();
            two.close();			
		}		
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
