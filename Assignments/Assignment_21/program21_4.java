class Logic
{
    void countFactors(int num)
    {
        int i=0;
        int iCount=0;
        for(i=1; i<=num; i++)
        {
            if((num%i)==0)
            {
                iCount++;
            }
        }
        System.out.println("Count of Factors is "+iCount);
    }
}
class Program21_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}