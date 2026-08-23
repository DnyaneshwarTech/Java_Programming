class SumOnetoTen_07
{
    public static void main(String A[])
    {
        int iCnt = 1;
        int iSum = 0;

        while(iCnt <= 10)
        {
            iSum = iSum + iCnt;
            iCnt++;
        }
        System.out.println("Sum = " + iSum);
    }
}