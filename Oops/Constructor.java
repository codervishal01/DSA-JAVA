public class Constructor {
    public static void main(String args[]){
        Student s1= new Student("Vishal");
        System.out.print(s1.name);
    }
}

class Student{
    String name;
    int age;

    Student(String name){
        this.name = name;
    }
}