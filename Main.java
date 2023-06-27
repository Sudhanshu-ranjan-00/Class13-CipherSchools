interface Shape{
    double pi=3.14;
    double getSquare(double r);
}

class Circle implements Shape{
    public double getSquare(double r)
    {
        return r*r;
    }
}

interface M{
    int x=12;
    void fun();
}
interface N{
    int x=13;
    void  fun();
}

class Z implements M,N{  //Multiple inheritance with interfaces
    public void fun()
    {
        System.out.println("Fun in Z.");
    }
}

public class Main{
    public static void main(String args[])
    {
        Circle c=new Circle();
        double res=c.getSquare(3.3);
        System.out.println(res);

        Z z=new Z();
        z.fun();
    }
}