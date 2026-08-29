import java.util.Scanner;

class LargestDigit_14
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNum, iDigit, iLargest = 0;

        System.out.println("Enter number : ");
        iNum = sobj.nextInt();

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit > iLargest)
            {
                iLargest = iDigit;
            }

            iNum = iNum / 10;
        }

        System.out.println("Largest digit = " + iLargest);

        sobj.close();
    }
}