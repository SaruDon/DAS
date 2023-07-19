public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("sarvesh");
        System.out.println(s1.getName()); 
        s1.school_name ="JNU";
        System.out.println(s1.school_name);

        Student s2 = new Student();
        System.out.println(s2.school_name );
    }
}


class Student{
    String name;
    int roll_number;

    static String school_name;

    void setName(String name){
        this.name = name;
    }
    String getName (){
        return this.name;
    }
}