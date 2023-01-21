import java.util.Scanner;
class Wall
{
    private double length,height;
public Wall(double length, double height)
{
    this.length=length;
    this.height=height;
}
public double Area()
{
    return length*height;
}
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double length1=sc.nextDouble();
        double height1=sc.nextDouble();
        Wall wall1 = new Wall(length1,height1);
        double length2=sc.nextDouble();
        double height2=sc.nextDouble();
        Wall wall2 = new Wall(length2,height2);
        double aw1=wall1.Area();
        double aw1=wall1.Area();
        System.out.println("Area of Wall 1: "+wall1.Area());
        System.out.println("Area of Wall 2: "+wall2.Area());
    }
}

