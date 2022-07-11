import Classes.Rational;

public class Lect07 {
    public static void main(String args[]){
        Rational frac1 = new Rational(2, -5);
        Rational frac2 = new Rational(-4, 12);

        System.out.println(frac1);
        System.out.println(frac2);
        
        System.out.println(Rational.multiply(frac1, frac2));
        
        System.out.println();
        System.out.println(frac1);
        System.out.println(frac2);
        
    }
}
