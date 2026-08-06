class SumOfNumbers_07
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Sum of numbers from 1 to 10 is : "+ iSum);
    }
}