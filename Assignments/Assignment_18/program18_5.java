class Logic
{
    void checkSign(int num)
    {
        if(num==0)
        {
            System.out.println(+num+ "\nIt is Zero");
        }
        else if(num>0)
        {
            System.out.println(+num+ "\nIt is Positive");
        }
        else if(num<0)
        {
            System.out.println(+num+ "\nIt is Negative");
        }
    }
}
class Program18_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);

    }
}