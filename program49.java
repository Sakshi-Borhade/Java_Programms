import java.util.Scanner;

class Calculate
{
    public int CalculateTicket(int iAge)
    {   
        if(iAge < 0) 
        {
            return -1;
        }

        if((iAge >= 0) && (iAge <= 5))
        {
            return 0;
        }
        else if((iAge > 5) && (iAge <= 18))
        {
            return 700;
        }
        else if((iAge > 18) && (iAge <= 50))
        {
            return 999;
        }
        else if(iAge > 50)
        {
            return 500;
        }
    }
}

class program49
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Age: ");
        iValue = sobj.nextInt();

        Calculate cobj = new Calculate();

        cobj.CalculateTicket(iValue);   
    }
}