class StudentClass {
    public static class Student {
        String name;
        int rollNo;
        float percent;
    }

    static void printStudent(Student s) {
        System.out.println("Name: " + s.name + ", Roll No: " + s.rollNo + ", Marks Percentage: " + s.percent);
    }

    static void changeStudentName(Student s) {
        s.name = "Ram";
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Avhi";
        s1.rollNo = 17;
        s1.percent = 9.15f;
        // printStudent(s1);

        System.out.println(s1.name);
        changeStudentName(s1);
        System.out.println(s1.name);
    }
}