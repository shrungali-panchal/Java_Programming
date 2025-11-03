class Logic
{
    void sumEvenOddDigits(int num)
    {
        int i=0;
        int iDigit=0;
        int sumEven=0;
        int sumOdd=0;
        while(num!=0)
        {
            iDigit = num%10;
            num = num/10;
            if((iDigit%2)==0)
            {
                sumEven += iDigit;
            }
            else
            {
                sumOdd += iDigit;
            }
        }
        System.out.println(sumEven +" is sum of even digits");
        System.out.println(sumOdd +" is sum of odd digits");        
    }
}
class Program18_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}