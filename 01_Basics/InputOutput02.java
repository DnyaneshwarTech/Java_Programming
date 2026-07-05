import java.util.*;

class InputOutput
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Entered number is : " + iNo);

        sobj.close();
    }
}