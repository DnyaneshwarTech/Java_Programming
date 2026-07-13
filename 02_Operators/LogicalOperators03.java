import java.util.Scanner;

class LogicalOperators03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;

        System.out.println("Enter the first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        iNo2 = sobj.nextInt();

        System.out.println();

        System.out.println("Logical Operators Result : ");
        
        System.out.println("Logical AND (&&) : "+ ((iNo1 > 0) && (iNo2 > 0)));
        System.out.println("Logical OR (||) : "+ ((iNo1 > 0) || (iNo2 > 0)));
        System.out.println("Logical NOT (!) : "+ !(iNo1 > 0));

        sobj.close();

    }
}