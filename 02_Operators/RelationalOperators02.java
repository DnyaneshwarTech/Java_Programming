import java.util.Scanner;

class RelationalOperators02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        System.out.println();

        System.out.println("iNo1 > iNo2 : " + (iNo1 > iNo2));
        System.out.println("iNo1 < iNo2 : " + (iNo1 < iNo2));
        System.out.println("iNo1 >= iNo2 : " + (iNo1 >= iNo2));
        System.out.println("iNo1 <= iNo2 : " + (iNo1 <= iNo2));
        System.out.println("iNo1 == iNo2 : " + (iNo1 == iNo2));
        System.out.println("iNo1 != iNo2 : " + (iNo1 != iNo2));

        sobj.close();
    }
}