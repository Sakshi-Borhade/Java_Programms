import java.util.Scanner;

class Show
{
    public void DisplayClass(float fPerc)
    {
        if((fPerc < 0.0f) || (fPerc > 100.0f))
        {
            System.out.print("Unable to proceed as input is invalid\n");
            return;
        }

        if((fPerc >= 0.0f) && (fPerc < 35.0f))
        {
            System.out.print("You are fail\n");
        }
        else if((fPerc >= 35.0f) && (fPerc < 50.0f))
        {
            System.out.print("You have pass class\n");
        }
        else if((fPerc >= 50.0f) && (fPerc < 60.0f))
        {
            System.out.print("You have second class\n");
        }
        else if((fPerc >= 60.0f) && (fPerc < 70.0f))
        {
            System.out.print("You have first class\n");
        }
        else if((fPerc >= 70.0f) && (fPerc <= 100.0f))
        {
            System.out.print("You have first class with distinction\n");
        }
    }
}
class program48
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Show ssobj = new Show();

        ssobj.DisplayClass(iValue);        
    }
}