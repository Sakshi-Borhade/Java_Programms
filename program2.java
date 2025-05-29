import java.util.Scanner;

class program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sobj.nextLine();

        System.out.println("Enter the Age:");
        int Age = sobj.nextInt();

        System.out.println("Enter the marks:");
        float marks = sobj.nextFloat();

        System.out.println("Name is: "+name);
        System.out.println("Age is: "+Age);
        System.out.println("Marks is: "+marks);
    }
}