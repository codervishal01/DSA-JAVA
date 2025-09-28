public class Static {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.school = "ST Thomas";
        System.out.println(s1.school);

        Student s2 = new Student();
        s2.name = "Jack";
        System.out.println(s2.school);

        Student s3 = new Student();
        s3.school = "Teresa";
        System.out.println(s3.school);
        System.out.println(s1.school);
    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int age;
    static String school;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}