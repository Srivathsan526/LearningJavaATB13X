package July4.Pak3Q7;



public class Student1 {
    public static void main(String[] args) {
    Student1 s1 = new Student1();
    s1.showInfo();
    }
    public void showInfo(){
        System.out.println("Public Access: Student Info");
    }
}

class Student1Sub{
    void student1Sub(){
        Student1 s2 = new Student1();
        s2.showInfo();
    }
}
