package OOPSinJAVA;
public class StudentClass {
    static void printStudent(Student s) {
        System.out.println("Name: " + s.name + ", Roll No: " + s.getRollNo() + ", Marks Percentage: " + s.percent);
    }

    public static void main(String[] args) {

        // will target the default constructor in the class
        Student s = new Student();
        s.name = "Sourav";
        s.setRollNo(100);
        s.percent = 8.0f;
        printStudent(s);
        System.out.println(s.schName);
        System.out.println(s.getCount());

        // will target the parameterized constructor in the class
        Student s1 = new Student("Avile", 117, 9.15f);
        s1.name = "Avhi";
        printStudent(s1);
        System.out.println(s1.schName);
        System.out.println(s1.getCount());

        System.out.println(Student.getCount());
    }

}
