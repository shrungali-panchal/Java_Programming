class Logic
{
    void displayGrade(int marks)
    {
        if(marks>=90)
        {
            System.out.println(marks+ "\nGrade : A+");
        }
        else if(marks>=80)
        {
            System.out.println(marks+ "\nGrade : A");
        }
        else if(marks>=70)
        {
            System.out.println(marks+ "\nGrade : B");
        }
        else if(marks>=60)
        {
            System.out.println(marks+ "\nGrade : C");
        }
        else if(marks>=50)
        {
            System.out.println(marks+ "\nGrade : D");
        }
        else if(marks>=40)
        {
            System.out.println(marks+ "\nGrade : E");
        }
        else 
        {
            System.out.println(marks+ "\nFail");
        }
    }

}
class Program19_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}