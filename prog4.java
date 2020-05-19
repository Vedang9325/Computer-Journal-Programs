public class prog4
{
    double p; double r; double n;
    void init(double p1, double r1, double n1)
    {
        p=p1;
        r=r1;
        n=n1;
    }
    void termdeposit()
    {
        double maturityvalue=p*Math.pow((1+r/100),n);
        System.out.println("The amount is"+maturityvalue);
    }
    void recurringdeposit()
    {
        double maturityvalue1=p*n+(n*(n+1))/2*r/100*1/12;
        System.out.println("The amount i"+maturityvalue1);
    }
    public static void main(double p1, double r1, double n1, int ch)
    {
        prog4 obj= new prog4();
        obj.init(p1, r1, n1);
        switch(ch)
        {
            case 1:
            obj.termdeposit();
            break;
            case 2:
            obj.recurringdeposit();
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
    }
}