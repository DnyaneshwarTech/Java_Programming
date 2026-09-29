import java.util.Scanner;

class AutomorphicNumber_21
{
    public static void main(String A []) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sobj.nextInt();

        int square = n * n;
        int temp = n;
        int divisor = 1;

        while (temp > 0) 
        {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if (square % divisor == n) 
        {
            System.out.println(n + " is an Automorphic Number");
        } else 
        {
            System.out.println(n + " is not an Automorphic Number");
        }

        sobj.close();
    }
}