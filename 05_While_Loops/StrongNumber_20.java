import java.util.Scanner;

class StrongNumber_20 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int num, temp, digit;
        int sum = 0;
        int fact, cnt;

        System.out.println("Enter a number : ");
        num = sobj.nextInt();

        temp = num;

        while(temp > 0)
        {
            digit = temp % 10;

            fact = 1;
            cnt = 1;

            while(cnt <= digit)
            {
                fact = fact * cnt;
                cnt++;
            }

            sum = sum + fact;

            temp = temp / 10;
        }

        if(sum == num)
        {
            System.out.println(num + " is a Strong number");
        }
        else
        {
            System.out.println(num + " is not a Strong number");
        }

        sobj.close();
    }
}
