class Logic
{
    void countDigits(int num)
    {
    int iDigit=0;
    int iCount=0;
    while(num!=0)
    {
        iDigit = num%10;
        {
            iCount++;
        }
        num = num/10;
    }
    System.out.println(+ iCount);
    }
}
class Program16_5
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.countDigits(7865);

    }
}