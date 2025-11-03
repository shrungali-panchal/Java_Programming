class Logic
{
    void calculatePower(int base ,  int exponent)
    {
        int result=1;
        int i=0;
        for(i=1; i<=exponent; i++)
        {
            result = result*base;
        }
        System.out.println(base+ " raised to " +exponent+ " is " +result);
    }
}
class Program19_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}