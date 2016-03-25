package khwanchai_027;
import java.util.Scanner;
public class khwanchai3 {
    public static void main(String[] args){
        float s,n,t;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter salary : ");
        s = in.nextFloat();
        t = (float) (s * 0.05);
        n = s - t;
        System.out.println(" Net " +n+ " Bath ");
    }
    
}
