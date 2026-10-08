import java.util.Scanner;

class PrimeNumber_23
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo, iCnt;
        boolean bPrime = true;
        
        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        if(iNo <= 1)
        {
            bPrime = false;
        }
        else
        {
            for(iCnt = 2; iCnt <= iNo / 2; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    bPrime = false;
                    break;
                }
            }
        }

        if(bPrime)
        {
            System.out.println(iNo + " is Prime Number");
        }
        else
        {
            System.out.println(iNo + " is not Prime Number");
        }

        sobj.close();
    }
}