package khwanchai_027;
import java.util.Scanner;
public class khwanchai6 {
    public static void main(String[] args){
        int y,d,hour,minute;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Years : ");
        y = in.nextInt();
        d= y * 365;
        hour = y * 8760;
        minute = y * 525600;
        System.out.println(y+" Years "+" = "+d+" Day or "+hour+" Hour or "+minute+" Minute");
            
        }
    }
