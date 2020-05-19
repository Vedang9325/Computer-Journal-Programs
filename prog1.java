public class prog1
{
    int num=1;
    void init()
    {
    }
    void calcdisplay()
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}