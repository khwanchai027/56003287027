package khwanchai_027;
import java.util.Scanner;
public class khwanchai5 {
    public static void main(String[] args){
        float cm,m,km;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Km : ");
        km = in.nextFloat();
        cm = km * 100000;
        m = km * 1000;
        System.out.println(km+" Km "+" = "+cm+" Cm "+" or "+m+" M ");
    }
}
