// Input : 4 4
/* Output : 0 0 * 
            0 * * 
            * * *    */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return;
        }
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("0\t");
                }
            }
            System.out.println();    
        }
    }
}

class program113
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}                                                               