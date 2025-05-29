import java.util.Scanner;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo / 10; 
        }
        return iCnt;
    }
}

class program65
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDigits(iValue);

        System.out.println("The Number of Digits are:"+iRet);
    }
}