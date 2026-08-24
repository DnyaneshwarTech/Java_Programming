import java.util.Scanner;

class SumEvenNumbers_08
{
    public static void main(String A[])
    {
        int iNum = 0;
        int iCnt = 2;
        int iSum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNum = sobj.nextInt();

        while(iCnt <= iNum)
        {
            iSum = iSum + iCnt;
            iCnt = iCnt + 2;
        }

        System.out.println("Sum of even numbers = "+ iSum);

        sobj.close();
    }
}