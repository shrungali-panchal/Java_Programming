class Logic
{
    void displayFactors(int num)
    {
        int i=0;
        for(i=1;  i<=num; i++)
        {
            if((num%i)==0)
            {
                System.out.println(+i);
            }
        }
    }
}
class Program21_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}