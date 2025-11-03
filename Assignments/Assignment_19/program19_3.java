class Logic
{
    void checkDivisible(int num)
    {
        if(num%5==0 && num%11==0)
        {
            System.out.println(num+ " It is divsible by 5 and 11");
        }
        if(num%5==0)
        {
            System.out.println(num+ " It is divsible by 5");
        }
        else
        {
            System.out.println(num+ " It is not divsible by 5");
        }
        if(num%11==0)
        {
            System.out.println(num+ " It is divisible by 11");
        }
        else
        {
             System.out.println(num+ " It is not divsible by 11");
        }
    }
}
class Program19_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}