package app;

import base.Shape; //Shape import
import derived.Circle; //Circle Import

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle(); //import 한것 안에 있는 클래스로 객체생성
        shape.draw();
    }
}
