package OOPSinJAVA;

public class fraction {

    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;

    }

    public static Fraction subtract(Fraction f1, Fraction f2) {
        int numerator = f1.num*f2.den - f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        int numerator = f1.num*f2.den;
        int denominator = f1.den*f2.num;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for(int i=min ; i>=1 ; i--)
            if(num%i==0 && den%i==0)
                return i;
        return 1;
    }
    public static class Fraction {
        int num;
        int den;
        public Fraction(int num, int den) {
            int hcf = gcd(num, den);
            this.num = num/hcf;
            this.den = den/hcf;
        }

        public void printFraction() {
            System.out.println("Fraction is : " + num + " / " + den);
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        f1.printFraction();
        Fraction f2 = new Fraction(3, 30);
        f2.printFraction();

        Fraction f12sum = add(f1, f2);
        f12sum.printFraction();

        Fraction f12sub = subtract(f1, f2);
        f12sub.printFraction();

        Fraction f12mul = multiply(f1, f2);
        f12mul.printFraction();

        Fraction f12div = divide(f1, f2);
        f12div.printFraction();

    }
}
