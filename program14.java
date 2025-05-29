import java.util.Scanner;

class Number
{
    public void SumFactors(int iNo)
    {
        int iCnt = 0, fSum = 0, nfSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                fSum = fSum + iCnt;
            }
            else
            {
                nfSum = nfSum + iCnt;
            }
        }
        System.out.println("Summation of factors is:"+fSum);
        System.out.println("Summation of non factors is:"+nfSum);
    }
}

class program64
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.SumFactors(iValue);
    }
}