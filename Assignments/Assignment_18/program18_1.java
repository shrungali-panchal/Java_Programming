class Logic
{
    void checkPrime(int num)
    {
        int i =0;
        if(num<=1)
        {
            System.out.println(num+" is not prime");
            return;
        }
            for(i=2; i<num; i++)
            {
                if((num%i)==0)
                {
                    System.out.println(num+" is not prime");
                    
                }
            }
            System.out.println(num+" is prime");
    }
}
class Program18_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}