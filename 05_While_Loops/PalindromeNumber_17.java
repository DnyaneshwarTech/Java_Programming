import java.util.Scanner;

class PalindromeNumber_17
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");

        int number = sobj.nextInt();

        int original = number;
        int reverse = 0;

        while(number > 0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if(original == reverse)
        {
            System.out.println(original+" is a Palindrome Number");
        }
        else
        {
            System.out.println(original+" is Not a Palindrome Number");
        }

        sobj.close();
    }
}