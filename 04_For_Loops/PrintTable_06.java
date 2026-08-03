class PrintTable_06
{
    public static void main(String A [])
    {
        int iCnt = 0;
        int iNo = 5;
        int iMult = 0;

        System.out.println("Table of "+ iNo);

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {   
            iMult = iNo * iCnt;

            System.out.println(iMult);
        }
    }
}