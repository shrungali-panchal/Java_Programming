class Logic
{
    void printReverse(int num)
    {
        int i=0;
        for(i=num; i>=1; i--)
        {
            System.out.println(+i);
        }
    }
}
class Program20_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}