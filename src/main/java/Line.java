import java.text.DecimalFormat;

public class Line implements Comparable<Line> {
    private int x1, x2, y1, y2;
    private double length;
    static DecimalFormat df = new DecimalFormat("#.00");
    Line(int x1 ,int y1,int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength(){
        length  = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return length;
    }
    @Override
    public int compareTo(Line l) {
        if(this.length > l.length){
            return 1;
        }else if(this.length < l.length){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "( " + x1 + ", " + x2 +
                " ), ( " + y1 +
                ", " + y2 +
                " ) length = " + df.format(length);
    }
}
