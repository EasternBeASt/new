import java.math.BigInteger;
import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        String fact = facto(num);
        System.out.print(+num+"! = "+fact);
    }
    public static String facto(int n){
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }
}