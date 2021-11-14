import java.util.Scanner;
 class Check_Divisibility
{
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=s.nextInt();
        if(n%7==0)
        {
            System.out.println(n+ "div by 7");
        }
        else
        {
            System.out.println(n+ "not div by 7");
        
        }
    }
}