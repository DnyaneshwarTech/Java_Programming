import java.util.Scanner;

class ReverseNumber_13
{
    public static void main(String A[])
    {
        int iNum = 0;
        int iDigit = 0;
        int iRev = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        iNum = sobj.nextInt();

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iRev = iRev * 10 + iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Reverse number = "+ iRev); 
    }
}