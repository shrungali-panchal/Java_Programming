class Logic
{
//////////////////////////////////////////////////////////////////////////
//
//Function name: calculateSum
//Description: It is used to calculate sum of no upto given no
//Input: Integer
//Output: Void (Displays sum)
//Author:Shrungali Shrikant Panchal
//Date: 1/11/2025
//
//////////////////////////////////////////////////////////////////////////
    void calculateSum(int n)
    {
        int i=0;
        int iSum=0;
        if(n<0)
        {
            n = -n;
        }
        for(i=1; i<=n; i++)
        {
                iSum += i;
        }
        System.out.println(+iSum);
    }
}   // End of calculateSum
//////////////////////////////////////////////////////////////////////////
//
//Entry point function of application
//
/////////////////////////////////////////////////////////////////////////
class program16_1
{
    public static void main (String A[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}   //End of program16_1
/////////////////////////////////////////////////////////////////////////
/////////////////
//
// Test Case successfully handled by the application
//
// Input : 10
// Output: 55
//
/////////////////////////////////////////////////////////////////////////
////////////////