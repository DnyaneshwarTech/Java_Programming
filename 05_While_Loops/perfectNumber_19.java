import java.util.Scanner;

class perfectNumber_19 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        int cnt = 1;
        int sum = 0;

        System.out.println("Enter a number : ");
        num = sobj.nextInt();

        while(cnt < num)
        {
            if(num % cnt == 0)
            {
                sum = sum + cnt;
            }
            cnt++;
        }

        if(sum == num)
        {
            System.out.println(num + " is a Perfect number");
        }
        else
        {
            System.out.println(num + " is not a Perfect number");
        }

        sobj.close();
    }
}
