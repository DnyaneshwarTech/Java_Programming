import java.util.Scanner;

class If_Else_If_Ladder04
{
    public static void main(String A[])
    {
        int Marks = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        Marks = sobj.nextInt();

        if(Marks >= 75)
        {
            System.out.println("Distinction");
        }
        else if(Marks >= 60)
        {
            System.out.println("First Class");
        }
        else if(Marks >= 50)
        {
            System.out.println("Second Class");
        }
        else if(Marks >= 35)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        sobj.close();
    }
}