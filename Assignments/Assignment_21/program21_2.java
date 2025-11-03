class Logic
{
    void countEvenOddRange(int num)
    {
        int i=0;
        int iCountEven=0;
        int iCountOdd=0;
        for(i=1; i<=num; i++)
        {
             if((i%2)==0)
            {
                iCountEven++;
            }
            if((i%2)!=0)
            {
                iCountOdd++;
            }
        }
        System.out.println("Range of Even Num is "+iCountEven);
        System.out.println("Range of Even Num is "+iCountOdd);
    }
    
}
class Program21_2
{
    public static void main (String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}