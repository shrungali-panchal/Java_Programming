class Logic
{
    void checkPerfect(int num)
    {
        int i=0;
        int iSum=0;
        int iSumT=0;
        for(i=1; i<=num/2; i++)
        {
            if(num%i==0)
            {
                iSumT=(iSum += i);
            }
        }
         if(iSumT==num)
            {
                System.out.println(num+ " is Perfect Num");
            }
            else if(iSumT!=num)
            {
                System.out.println(num+ " is not Perfect Num");
            }
        
    }
}
class Program20_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}