import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComputationUC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Enter X1 and Y1 co-ordinate for line");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter X2 and Y2 co-ordinate for line");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2-y1),2));
        System.out.println("Length of given line co-ordinate ("+x1+","+y1+") ("+x2+","+y2+") is: "+df.format(length));
    }
}