package Classes;
import java.lang.Math;

public class Rational{

    //Data
    private int num, denom; //Numerator and denominator

    //Constructor
    public Rational(int num, int denom){
        this.num = num;

        if(denom != 0){
            this.denom = denom;
        }
        else{
            this.denom = 1;
        }

        fixNegative();
        reduce();
    }


    //Static Methods
    public static Rational multiply(Rational frac1, Rational frac2){
        return new Rational(
            frac1.num * frac2.num,
            frac1.denom * frac2.denom
        );
    }



    //Public Methods
    public void add(Rational frac){
        // 1/5   5*7=35
        // 3/7

        // 1 + 3 = 7  + 15  = 22
        // 5   7   35   35    35
        
        int newDenom = denom * frac.denom;
        int newNum = num*frac.denom + frac.num*denom;

        this.num = newNum;
        this.denom = newDenom;
        
        reduce();
    }
    public void add(int num, int denom){
        add(new Rational(num, denom));
    }


    public void multiply(Rational frac){
        this.num *= frac.num;
        this.denom *= frac.denom;

        reduce();
    }
    public void multiply(int num, int denom){
        multiply(new Rational(num, denom));
    }


    public boolean equals(Rational frac){
        return this.num == frac.num && this.denom == frac.denom;
    }

    //Private Methods
    private void reduce (){
        int gcd = gcd(num, denom);

        num /= gcd;
        denom /= gcd;
    }

    private int gcd (int a, int b){

        int result = Math.abs(a);

        while (result != 0){
            if(a%result == 0 && b%result == 0){
                return result;
            }
            result--;
        }

        return 0;
    }

    private void fixNegative(){
        if(num < 0 && denom < 0){
            num = Math.abs(num);
            denom = Math.abs(denom);
        }
        else if(denom < 0){
            num *= -1;
            denom = Math.abs(denom);
        }
    }

    //ToString
    public String toString(){
        return num + "/" + denom;
    }

}