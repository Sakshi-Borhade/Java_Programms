import java.util.Scanner;

class Digits
{
    public int SumEvenDigits(int iNo)
    {
        int iCnt = 0, iDigit =0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2)  == 0)           
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10; 
        }
        return iSum;
    }
}

class program72
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.SumEvenDigits(iValue);

        System.out.println("The Summation of even digits are: "+iRet);
    }
}