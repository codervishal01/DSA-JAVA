public class Copy_Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Vishal";
        s1.age = 20;
        s1.password = "abcd";
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;
        Student s2 = new Student(s1);
        s2.password = "efgh";
        s1.marks[2] = 90;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    // shallow copy
    // Student(Student s1){
    // this.name = s1.name;
    // this.age =s1.age;
    // this.marks=s1.marks;
    // }

    // Deep copy
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Student(String name) {
        marks = new int[3]; // parameterized constructor
        this.name = name;
    }

    Student() { // non parameterized constructor
        marks = new int[3];
        System.out.println("this is non parameterized constructor,,,");
    }

    Student(int age) { // parameterized constructor
        marks = new int[3];
        this.age = age;
    }
}