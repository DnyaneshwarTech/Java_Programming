class SumOfEvenNumbers_08 
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of even numbers from 1 to 10 is : " + iSum);
    }
}
