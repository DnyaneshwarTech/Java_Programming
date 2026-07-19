import java.util.Scanner;

class if_Else02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;

        System.out.print("Enter your marks : ");
        Marks = sobj.nextInt();

        if(Marks >= 35)
        {
            System.out.println("Congratulations! You are Pass.");
        }
        else
        {
            System.out.println("Sorry! You are Fail.");
        }

        sobj.close();
    }
}