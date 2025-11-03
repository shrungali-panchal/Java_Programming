class Logic
{
    void printEvenNumbers(int num)
    {
        int i = 0;
        for(i=1; i<=num;  i++)
        {
            if((i%2)==0)
            {
                System.out.println(+i);
            }
        }
    }
}
class Program18_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}