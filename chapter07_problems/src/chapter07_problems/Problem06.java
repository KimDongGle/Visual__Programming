package chapter07_problems;
import java.util.*;

class Location{
	//���� ���� ������
	String city;
	String x;
	String y;
	
	//������
	public Location(String city, String x, String y) {
		this.city = city;
		this.x = x;
		this.y = y;
	}
	
	//set�޼ҵ� ����
	public void setCity(String city) {
		this.city = city;
	}
	public void setX(String x) {
		this.x = x;
	}
	public void setY(String y) {
		this.y = y;
	}

	//get�޼ҵ� ����
	public String getCity() {
		return this.city;
	}
	public String getX() {
		return this.x;
	}
	public String getY() {
		return this.y;
	}
}

public class Problem06 {
	HashMap<String, Location> cityData = new HashMap<String, Location>();
	Scanner scanner = new Scanner(System.in);
	
	public void firstSet() {
		System.out.println("����, �浵, ������ �Է��ϼ���(4��).");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			StringTokenizer filter = new StringTokenizer(input, ",");
			String city = filter.nextToken().trim();
			String x = filter.nextToken().trim();
			String y = filter.nextToken().trim();	
			Location location = new Location(city, x, y);
			//���� ��Ű���� ���� Problem05���� ���
			cityData.put(city, location);
		}
	}
	
	//�Է� ���� ���� ����Ʈ�ϴ� �޼ҵ�
	public void printCity() {
		Set<String>key = cityData.keySet();	//�콬���� Ű�� ��ƿ�
		Iterator<String> it = key.iterator();	//Ű�� ���� �����
		System.out.println("----------------------");
		while(it.hasNext()) {
			String cityName = it.next();
			Location forPrint = cityData.get(cityName);
			//printf�� ����� ���� ������
			System.out.printf("%s", forPrint.getCity());
			System.out.printf("%5s", forPrint.getX());
			System.out.printf("%5s\n", forPrint.getY());
		}
		System.out.println("----------------------");
	}
	
	//�˻� �޼ҵ�
	public void search () {
		while(true) {
			System.out.print("���� �̸� >> ");
			String check = scanner.nextLine();
			check.trim();
			if(check.equals("�׸�")) break; //�Է� �ް� '�׸�'���� Ȯ��
			Location getCity = cityData.get(check);
			if(getCity == null) {
				System.out.println(check + "�� �����ϴ�.");
			}else {
				System.out.printf("%s", getCity.getCity());
				System.out.printf("%5s", getCity.getX());
				System.out.printf("%5s\n", getCity.getY());
			}
		}
	}
	
	//���ι�
	public static void main(String[] args) {
		Problem06 problem06 = new Problem06();
		problem06.firstSet();
		problem06.printCity();
		problem06.search();
	}
}