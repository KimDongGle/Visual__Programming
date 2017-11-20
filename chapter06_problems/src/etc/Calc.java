package etc; //etc 패키지

public class Calc {  //public으로 변경
    private int x, y;
    public Calc(int x, int y) { this.x = x; this.y = y; }
    public int sum() { return x+y; }
}