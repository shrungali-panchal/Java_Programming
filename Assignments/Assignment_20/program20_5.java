class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit=0;
        int iSmall=num%10;
        while(num!=0)
        {
            iDigit=num%10;
            num=num/10;
            if(iDigit<iSmall)
            {
                iSmall=iDigit;
            }
        }
        System.out.println("Smallest Digit is "+iSmall);
    }
}
class Program20_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}