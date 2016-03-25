package khwanchai_027;
import java.util.Scanner;
public class khwanchai1 
{
    public static  void main(String[] args) 
    {
        int a,b,c;
        float avg,av;
        Scanner in = new Scanner(System.in);
        System.out.println(" Num  1 " );
        a = in.nextInt();
        System.out.println(" Num  2 ");
        b = in.nextInt();
        System.out.println(" Num  3 ");
        c = in.nextInt();
        avg = a+b+c;
        av = avg/3;
        System.out.println(a+" + "+b+" + "+c+" /3"+" = "+av);
        
    }
}
