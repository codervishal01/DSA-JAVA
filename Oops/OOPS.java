package Oops;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(5);
    }
}

class Pen{

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;

    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
