package khwanchai_027;
import java.util.Scanner;
public class khwanchai4 {
    public static void main(String[] args){
        float t,p,s,tax;
        Scanner in = new Scanner(System.in);
        System.out.println("Price : ");
        p = in.nextFloat();
        t = (float) (p / 1.07);
        tax = (float) (t * 0.07);
        s = t + tax;
        System.out.println("Total price "+" = "+t);
        System.out.println("Sale "+" = "+s);
    }
}
