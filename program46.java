import java.util.Scanner;

class program46
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

        Percentage  = ((float)Obtained / (float)Total) * 100;     //business logic

        System.out.println("Percentage is: %.2f%%\n"+Percentage);

    }
}
    
    