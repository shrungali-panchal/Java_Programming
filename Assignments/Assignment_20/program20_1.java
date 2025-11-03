class Logic
{
    void sumEvenNumbers(int num)
    {
        int i=0;
        int sumEven=0;
        for(i=1; i<=num; i++)
        {
            if((i%2)==0)
            {
                sumEven += i;
            }
        }
         System.out.println(" Sum of Even numbers is " +sumEven);
    }
}
class Program20_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}