package main; //main ��Ű��

import etc.Calc; //��ο� ���� Calc�� import

public class MainApp {
    public static void main(String[] args) {
        Calc c = new Calc(10, 20);
        System.out.println(c.sum());
    }
}