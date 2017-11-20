package derived;

import base.Shape; //Shape를 상속받기 위해 import 시킨다.

public class Circle extends Shape { //public으로 변경
    public void draw() { System.out.println("Circle"); }
}