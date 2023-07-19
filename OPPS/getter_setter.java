
public class getter_setter {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.gettip());
    }
}

class pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color = newColor;
    }

    int gettip(){
        return this.tip;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

