import java.util.Scanner;

class CountDigits_11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0;
        int iCnt = 0;

        System.out.println("Enter the number : ");
        
        iNum  = sobj.nextInt();

        while(iNum != 0)
        {
            iNum = iNum / 10;
            iCnt++;
        }

        System.out.println("Number of digits = "+ iCnt);
    }
}