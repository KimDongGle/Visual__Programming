package app;

import base.Shape; //Shape import
import derived.Circle; //Circle Import

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle(); //import �Ѱ� �ȿ� �ִ� Ŭ������ ��ü����
        shape.draw();
    }
}