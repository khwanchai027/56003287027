package khwanchai_027;
import java.util.Scanner;
public class khwanchai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float p, rp, dC, tax, fp, dCm, pay;
        int num;

        System.out.print("Enter name : ");
        String name = in.next();

        System.out.print("Enter Price : ");
        p = in.nextFloat();

        System.out.print("Enter Num : ");
        num = in.nextInt();

        System.out.print("Enter Discount : ");
        dC = in.nextFloat();

        fp = p * num;
        dCm = fp / dC;
        pay = fp - dCm;
        rp = (float) (fp / 1.07);
        tax = (float) (rp * 0.07);

        System.out.println("Name = " + name);
        System.out.println("Price = " + p);
        System.out.println("Number = " + num);
        System.out.println("The real Price = "+rp);
        System.out.println("Tax = " + tax);
        System.out.println("All Price = " + fp);
        System.out.println("Discount Price = " + dCm);
        System.out.println("Payment = " + pay);
    }

}
