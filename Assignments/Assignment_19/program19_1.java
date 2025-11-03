class Logic
{
    void checkLeapYear(int yr)
    {
        int leapYear = 0;
        if((yr%400==0) || (yr%4==0) && (yr%100!=0))
        {
            System.out.println(yr+ " is Leap Year");
        }
        else
        {
            System.out.println(yr+ " is not Leap Year");
        }
    }
}
class Program19_1
{
    public static void main(String A [])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}