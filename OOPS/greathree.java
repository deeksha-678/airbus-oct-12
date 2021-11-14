import java.util.Scanner;
public class greathree
{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter firs numb:");
        x=sc.nextInt();
        System.out.println("enter second numb:");
        y=sc.nextInt();
        System.out.println("enter third numb:");
        z=sc.nextInt();
        if(x>y&&x>z)
        {
            System.out.println("largest numb is:"+x);
        }
        else if(y>z)
        {
            System.out.println("largest numb is:"+y);
        }
        else
        {
            System.out.println("Largest is"+z);
        }
    }
}

