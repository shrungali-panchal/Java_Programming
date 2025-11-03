class Logic
{
    void printDigits(int num)
    {
        int i=0;
        int iDigit=0;
        while(num!=0)
        {
            for(i=1; i<=num; i++)
            {
                iDigit=num%10;
                num=num/10;
                System.out.println(+iDigit);
            }
        }
       
    }
}
class  Program19_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}