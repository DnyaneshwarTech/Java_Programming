import java.util.Scanner;

class FactorsDescending_25
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iCnt = 0;

        System.out.print("Enter number: ");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid input.");
            sobj.close();
            return;
        }

        iCnt = iNo;

        System.out.print("Factors in descending order: ");

        while(iCnt >= 1)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + " ");
            }

            iCnt--;
        }

        System.out.println();

        sobj.close();
    }
}