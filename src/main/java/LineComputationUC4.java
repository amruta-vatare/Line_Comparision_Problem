import java.text.DecimalFormat;
import java.util.Scanner;
public class LineComputationUC4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the co-ordinate X1 and Y1 for line one");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the co-ordinate X2 and Y2 for line one");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Line line1 = new Line(x1,y1,x2,y2);

        System.out.println("Enter the co-ordinate X3 and Y3 for line Two");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the co-ordinates X4 and Y4 for line Two");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        Line line2 = new Line(x3,y3,x4,y4);

        double lengthOfLine1 = line1.getLength();
        double lengthOfLine2 = line2.getLength();

        System.out.println("Length of the line 1 is : "+df.format(lengthOfLine1));
        System.out.println("Length of the line 2 is : "+df.format(lengthOfLine2));

        if(line1.compareTo(line2) == 1){
            System.out.print("Line 1 co-ordinate with "+line1.toString()+" is greater than line 2 co-ordinate with "+line2.toString());
        }else if(line1.compareTo(line2) == -1){
            System.out.println("Line 2 co-ordinate with "+line2.toString()+" is greater than line 1 co-ordinate with "+line1.toString());
        }else if(line1.compareTo(line2) == 0){
            System.out.print("Line 1 co-ordinate with "+line1.toString()+" is equal to line 1 co-ordinate with "+line2.toString());
        }
    }
}
