//Passing and Returning Objects in Java

package Basic;
import java.util.Scanner;
public class ObjectR 
{
    int length, breadth, area;
    ObjectR area1(ObjectR object1)
    {
        object1 = new ObjectR();
        object1.length = this.length;
        object1.breadth = this.breadth;
        object1.area = object1.length * object1.breadth;
        return object1;
    }
    ObjectR area2(ObjectR object2)
    {
        object2 = new ObjectR();
        object2.length = this.length + 5;
        object2.breadth = this.breadth + 6;
        object2.area = object2.length * object2.breadth;
        return object2;
    }
    public static void main(String[] args) 
    {
         ObjectR obj = new ObjectR();
         Scanner s = new Scanner(System.in);
         System.out.print("Enter length:");
         obj.length = s.nextInt();
         System.out.print("Enter breadth:");
         obj.breadth = s.nextInt(); 
         ObjectR a = obj.area1(obj);
         ObjectR b = obj.area2(obj);
         System.out.println("Area:"+a.area);
         System.out.println("Area:"+b.area);
    }
}
