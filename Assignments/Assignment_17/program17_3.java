class Logic
{
    void findMax(int a , int b)
    {
        if(a>b)
        {
            System.out.println(+ a);
        }
        else if(b>a)
        {
            System.out.println(+ b);
        }
    }
}
class Program17_3
{
    public static void main (String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20 , 15);
    }
}