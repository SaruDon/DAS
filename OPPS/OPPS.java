

public class OPPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color= "  red";
        System.out.println(p1.color);
        p1.tip =5;
        System.out.println(p1.tip);
    }
}

class pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
