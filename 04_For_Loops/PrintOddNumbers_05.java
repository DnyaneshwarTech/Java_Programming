class PrintOddNumbers_05
{
    public static void main(String A[])
    {
        int iCnt = 0;

        System.out.println("Odd Numbers from 1 to 100");

        for(iCnt = 1; iCnt <= 100; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}