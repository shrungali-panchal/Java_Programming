class  Logic
{
    void findMin(int a, int b, int c)
    {
        if((a<b)&&(a<c))
        {
            System.out.println(+ a);
        }
        else if((b<a)&&(b<c))
        {
            System.out.println(+ b);
        }
        else if((c<a)&&(c<b))
        {
            System.out.println(+ c);
        }
    }
}
class Program17_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMin(3 ,7, 2);
    }
}