import java.util.Scanner;

class Fibonacci_Series_24
{
    public static void main(String A[])
    {
        int iCnt = 1;
        int iTerms = 0;
        int iFirst = 0;
        int iSecond = 1;
        int iNext = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        iTerms = sobj.nextInt();

        if (iTerms <= 0)
        {
            System.out.println("Please enter a positive number.");
            sobj.close();
            return;
        }

        while (iCnt <= iTerms)
        {
            System.out.print(iFirst + " ");

            iNext = iFirst + iSecond;
            iFirst = iSecond;
            iSecond = iNext;

            iCnt++;
        }

        System.out.println();

        sobj.close();
    }
}