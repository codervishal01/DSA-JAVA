public class Constructor {
    public static void main(String args[]){
        Student s1= new Student("Vishal");
        Student s2 = new Student("20");
        System.out.print(s1.name);
        System.out.print(s2.age);
    }
}

class Student{
    String name;
    int age;

    Student(String name){    //parameterized constructor
        this.name = name;
    }

    Student(){  //non parameterized constructor
        System.out.println("this is non parameterized constructor,,,");
    }

    Student(int age){    //parameterized constructor
        this.age = age;
    }
}