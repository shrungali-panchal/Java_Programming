class Logic
{
    void checkPalindrome(int num)
    {
        int originalNum=num;
        int reverseNum=0;
        int iDigit=0;
        while(num!=0)
        {
            iDigit = num%10;
            num = num/10;  
            reverseNum = reverseNum * 10 + iDigit;
        }
        if(originalNum == reverseNum)
            {
                System.out.println(reverseNum +" is Palindrome");
            }
            else
            {
                System.out.println(reverseNum +" is not Palindrome");
            }
    }
}
class Program17_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}