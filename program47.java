import java.util.Scanner;

class Calculate
{
    public float CalculatePercentage(int iTotalMarks, int iObtainedMarks)
    {
        float fPercentageValue = 0.0f;
        fPercentageValue = ((float)iObtainedMarks / (float)iTotalMarks) * 100;
        return fPercentageValue;
    }
}

class program47
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Total = 0;
        int Obtained = 0;
        float Percentage = 0.0f;

        System.out.println("Enter your total marks: ");
        Total = sobj.nextInt();

        System.out.println("Enter your obtained marks: \n");
        Obtained = sobj.nextInt();

        Calculate cobj = new Calculate();

        Percentage = cobj.CalculatePercentage(Total,Obtained);

        System.out.println("Percentage is: %.2f%%\n"+Percentage);

    }
}
