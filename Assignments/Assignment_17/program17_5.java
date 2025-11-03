class Logic
{
    void printTable(int num)
    {
        int iMulti=0;
        int i =0;
        for(i=1;i<=10;i++)
        {
            iMulti = num * i;
            System.out.println(+ iMulti);
        }
    }
}
class Program17_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}