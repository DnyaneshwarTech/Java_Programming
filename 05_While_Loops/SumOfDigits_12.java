import java.util.Scanner;

class SumOfDigits_12
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0;
        int iDigit = 0;
        int iSum = 0;

        System.out.print("Enter the number : ");

        iNum = sobj.nextInt();

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Sum of digits = "+ iSum);
    }
}