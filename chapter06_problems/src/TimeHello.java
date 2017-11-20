import java.util.Calendar;

public class TimeHello {		
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();	//달력 객체 생성
		
		int hour = now.get(Calendar.HOUR_OF_DAY); //24로 표기되는 시
		int min = now.get(Calendar.MINUTE); //60으로 표기되는 분
		
		
		System.out.println("현재 시간은 " + hour + "시 " + min + "분입니다.");
		
		if((hour > 4) && (hour < 12)){  //24로 표기되는 분이니 시간범위 조건과 메세지 입력 
			System.out.println("Good Morning");
		}else if((hour >= 12) && (hour < 18)) { 
			System.out.println("Good Afternoon");
		}else if(hour >= 18 && hour < 22) { 
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
	}
}
