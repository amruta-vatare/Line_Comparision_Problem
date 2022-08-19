import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComputationUC2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate X1 and Y1 for line one");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the co-ordinate X2 and Y2 for line one");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter the co-ordinate X3 and Y3 for line Two");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the co-ordinates X4 and Y4 for line Two");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        Double lengthOfLineOne = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of given line co-ordinate ("+x1+","+y1+") ("+x2+","+y2+") is: "+df.format(lengthOfLineOne));

        Double lengthOfLineTwo = Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println("Length of given line co-ordinate ("+x3+","+y3+") ("+x4+","+y4+") is: "+df.format(lengthOfLineTwo));

        if(lengthOfLineOne.equals(lengthOfLineTwo)){
            System.out.println("Both lines are equals");
        }else{
            System.out.println("Both lines are different");
        }
    }
}
