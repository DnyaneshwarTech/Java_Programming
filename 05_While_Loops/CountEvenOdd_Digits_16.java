import java.util.Scanner;

public class CountEvenOdd_Digits_15
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0;
        int iDigit = 0;
        int iEvne = 0;
        int iOdd = 0;

        System.out.println("Enter number : ");
        iNum = sobj.nextInt();

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if((iDigit % 2) == 0)
            {
                iEvne++;
            }
            else
            {
                iOdd++;
            }

            iNum = iNum / 10;
        }

        System.out.println("Even digits : " + iEvne);

        System.out.println("Odd digits : " + iOdd);

        sobj.close();
    }

}