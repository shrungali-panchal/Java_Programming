class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit=0;
        int iLarge=0;
        while(num!=0)
        {
            iDigit=num%10;
            num=num/10;
            if(iLarge<iDigit)
            {
                iLarge=iDigit;
            }
        }
        System.out.println("Largest Digit is "+iLarge);
    }
}
class Program20_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}