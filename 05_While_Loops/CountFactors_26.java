
import java.util.Scanner;

public class CountFactors_26
{
    public static int CountFactors(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        if(iNo <= 0)
        {
            return 0;
        }

        iCnt = 1;

        while(iCnt <= iNo)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }

            iCnt++;
        }

        return iCount;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.print("Enter number: ");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid input.");
        }
        else
        {
            iRet = CountFactors(iNo);

            System.out.println("Total factors: " + iRet);
        }

        sobj.close();
    }
}
