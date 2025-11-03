class Logic
{
    void printOddNumbers(int num)
    {
        int i=0;
        for(i=1; i<=num; i++)
        {
            if((i%2)!=0)
            {
                System.out.println(+i);
            }
        }
    }
}
class Program18_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}