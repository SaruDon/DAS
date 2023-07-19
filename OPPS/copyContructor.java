public class copyContructor{
    public static void main(String[] args) {
    Student s1 = new Student();    
    s1.name ="sarvesh";
    s1.roll_no =5020124;    
    s1.password ="abcd";

    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;

    Student s2 = new Student(s1);
    s2.password="xyz";
    s1.marks[2]=100;    // we are doing change in s1 which has already copied it self in s2 soo the chnage should'nt be visible
    for( int i=0;i<3 ;i++){
        System.out.println(s2.marks[i]);
    }
    }
}

class Student{
    String name;
    int roll_no;
    String password;
    int marks[];

 /*    Student(Student s1){  //copy constructor
        marks = new int[3];
        this.name =s1.name;
        this.roll_no =s1.roll_no;
        this.marks = s1.marks;
    }
*/

//deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name =s1.name;
        this.roll_no =s1.roll_no;
        for(int i=0; i<3 ;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    Student(){   ////non-parameteriezed constructor
        marks = new int[3];
        System.out.println("Non parameterized constructor is called");
    }
    Student(String name){  //parameteriezed constructor
        marks = new int[3];
        this.name = name;
    }
    Student(int roll_no){
        marks = new int[3];
        this.roll_no = roll_no;
    }   
}