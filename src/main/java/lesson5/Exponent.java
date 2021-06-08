package lesson5;

public class Exponent {
    public static double exponentiation (double digit, int i){
        if (digit == 0){
            if (i > 0) return 0;
            else  throw new IllegalArgumentException();
        }
        if (i < 0){
            return 1 / (digit * exponentiation(digit, -i - 1));
        }
        else if (i > 0){
            return digit * exponentiation(digit, i - 1);
        }
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println(Exponent.exponentiation(5,2));
        System.out.println(Exponent.exponentiation(5,-2));
    }
}
