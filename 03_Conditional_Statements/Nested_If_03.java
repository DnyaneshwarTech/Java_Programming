import java.util.Scanner;

class Nested_If_03
{
    public static void main(String A[])
    {
        int iAge = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter your age : ");
        iAge = sobj.nextInt();

        if(iAge >= 18)
        {
            if(iAge >= 60)
            {
                System.out.println("You are a Seniour Citizen. ");
            }
            else
            {
                System.out.println("You are an Adult. ");
            }
        }
        else
        {
            System.out.println("You are a Minor. ");
        }

        sobj.close();
    }
}