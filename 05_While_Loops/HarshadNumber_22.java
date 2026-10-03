import java.util.Scanner;

class HarshadNumber_22
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sobj.nextInt();

        int temp = num;
        int sum = 0;

        while(temp > 0) 
        {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        if(num % sum == 0) 
        {
            System.out.println(num + " is a Harshad Number");
        } else 
        {
            System.out.println(num + " is not a Harshad Number");
        }

        sobj.close();
    }
}