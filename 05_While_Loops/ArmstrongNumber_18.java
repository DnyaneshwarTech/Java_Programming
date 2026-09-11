import java.util.Scanner;

class ArmstrongNumber_18
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int number = sobj.nextInt();

        int original = number;
        int sum = 0;
        
        while(number > 0)
        {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if(original == sum)
        {
            System.out.println(original+" is an Armstrong number ");
        }
        else
        {
            System.out.println(original+" is Not  an armstrong number");
        }

        sobj.close();
    }
}