import java.util.Scanner;

class Factorial_10
{
    public static void main(String A[])
    {
        int iNum = 0;
        int iCnt = 1;
        int iFact = 1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");

        iNum = sobj.nextInt();

        while(iCnt <= iNum)
        {
            iFact = iFact * iCnt;
            iCnt = iCnt + 1;
        }

        System.out.println("Factorial = " + iFact);

        sobj.close();
    }
}