public class student
{
    String name; double roll; double sub1; double sub2; double sub3; double sub4; double sub5;
    void init(String nam1, double roll1, double sub11, double sub22, double sub33, double sub44, double sub55)
    {
        name=nam1;
        roll=roll1;
        sub1=sub11;
        sub2=sub22;
        sub3=sub33;
        sub4=sub44;
        sub5=sub55;
    }
    void calcdisplay()
    {
        System.out.println("The name of the student is"+name);
        System.out.println("The roll number of student is"+roll);
        double totalmarks= sub1+sub2+sub3+sub4+sub5;
        double avgmarks=totalmarks/500*100;
        if((avgmarks>=90.0)&&(avgmarks<=100.0))
        {
            System.out.println("Science with computers");
        }
        else if((avgmarks>=80.0)&&(avgmarks<=89.0))
        {
            System.out.println("Science without computers");
        }
        else if((avgmarks>=70.0)&&(avgmarks<=79.0))
        {
            System.out.println("Commerce with Maths");
        }
        else if((avgmarks>=60.0)&&(avgmarks<=69.0))
        {
            System.out.println("Commerce without Maths");
        }
        else
        {
            System.out.println("No eligible stream");
        }
    }
}