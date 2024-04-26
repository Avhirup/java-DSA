package OOPSinJAVA;

class Student {
    public String name;
    private int rollNo;
    float percent;
    final String schName = "DPS";
    private static int count;

    // CONSTRUCTOR FUNCITON
    public Student() {
        count++;
    }
    Student(String name, int rollNo, float percent) {
        this.name = name;
        setRollNo(rollNo);
        this.percent = percent;
        count++;
    }

    // GETTER METHOD FOR COUNT
    static int getCount() {
        return count;
    }

    // GETTER METHOD
    public int getRollNo() {
        return rollNo;
    }

    // SETTER METHOD
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /* main function may or may not be there, it doesn't make any error
    public static void main(String[] args) {
        System.out.println("Hey Check");
    }
    */

}


