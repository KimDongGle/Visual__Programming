package main; //main 패키지

import etc.Calc; //경로에 맞춰 Calc를 import

public class MainApp {
    public static void main(String[] args) {
        Calc c = new Calc(10, 20);
        System.out.println(c.sum());
    }
}
