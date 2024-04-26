public class test {
    static void changeString(String s) {
        s = "Rup";
    }

    public static class Student {
        String name;
        int rollNo;
        float percent;
    }

    public static void main(String[] args) {
        String s = "Avhi";
        System.out.println(s);
        changeString(s);
        System.out.println(s);
        Student s1 = new Student();
        s1.name = "AC";
        System.out.println(s1.name);
    }
}
