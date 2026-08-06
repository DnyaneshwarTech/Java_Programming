class Factorial_10 
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        System.out.println("Factorial of 5 is : " + iFact);
    }
}
