import java.util.Scanner;

class Number
{
    public int SumNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class program61
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumNonFactors(iValue);

        System.out.println("The summation of non Factors is:"+iRet);
    }
}