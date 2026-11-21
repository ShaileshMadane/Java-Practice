class car
{
    engine e1;
    car()
    {
        e1=new engine();
        e1.start();
    }

    void drive()
    {
        System.out.println("Car is driving.......");
    }

}
class engine
{
    void start()
    {
        System.out.println("Engine is starting......");
    }
}
public class A {
    public static void  main(String[]args)
    {
        car c1=new car();
        c1.drive();
    }
}
