package khwanchai_027;
import java.util.Scanner;
public class khwanchai9 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double r,i,p,t,rb,time;
        float v;
        System.out.print("Enter Principle : ");
        p = in.nextDouble();
        System.out.print("Enter Interest_Rate : ");
        r = in.nextDouble();
        System.out.print("Enter Time : ");
        time = in.nextDouble();
        t = time * 12;
        i = (r/100)*(1/12.0);
        v = (float)Math.pow((1/(1+i)),t);
        rb = (i/(1-v)) * p;
        System.out.println("annuity = "+rb+" Bath");
    }
}
