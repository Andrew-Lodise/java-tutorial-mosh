// Reference Types
import java.util.Date;
import java.awt.*;

public class ReferenceTypes{

    public static void main(String[] args){
        Date today = new Date();
        today.getTime();
        //System.out.println(today);

        byte x = 1;
        byte y = x;
        x = 2;
        //System.out.println(y);

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
