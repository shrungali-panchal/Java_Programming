class Logic
{
    void printDivisibleBy2and3(int num)
    {
        int i=0;
        for(i=1; i<=num; i++)
        {
            if(((i%2)==0) && ((i%3)==0))
            {
             System.out.println(+i);
            }
        }
    }
}
class Program21_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}