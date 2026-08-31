import java.util.Scanner;

class Smallest_Digit_15
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0;
        int iDigit = 0;
        int iMin = 9;

        System.out.println("Enter number : ");
        iNum = sobj.nextInt();

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNum = iNum / 10;
        }

        System.out.println("Smallest digit : "+ iMin);

        sobj.close();
    }
}