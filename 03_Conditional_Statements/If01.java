import java.util.Scanner;

class If01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.print("Enter a number : ");
        iNo = sobj.nextInt();

        if(iNo > 0)
        {
            System.out.println(iNo + " is a Positive Number : ");
        }

        sobj.close();
    }
}