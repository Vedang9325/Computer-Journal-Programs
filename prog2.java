public class prog2
{
    String name; double basesalary; double div; double totalsalary;
    void init(String nam1, double sal)
    {
        name=nam1;
        basesalary=sal;
    }
    void calc()
    {
        totalsalary=50.0/100.0*basesalary+basesalary;
    }
    void display()
    {
        System.out.println("The employee name is" +name);
        System.out.println("The salary with 50% HRA is" +totalsalary);
    }
    public static void main()
    {
        prog2 obj=new prog2();
        obj.init("Vedang", 80000.0);
        obj.calc();
        obj.display();
    }
}