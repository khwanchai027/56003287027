package khwanchai_027;
import java.util.Scanner;
public class khwanchai8 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double ee,ep,h,pay;
        int day;
        System.out.print("Enter Electric_Power : ");
        ep = in.nextDouble();
        System.out.print("Enter Hour : ");
        h = in.nextDouble();
        ee = (ep / 1000)* h * 31;
        pay = ( ee * 2.50);
        System.out.println("Electric Energy = "+ee);
        System.out.println("Pay = "+pay+" Bath");
    }
}
