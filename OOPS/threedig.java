import java.util.*;
class ThreeD
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        num=sc.nextInt();
        if(num>99 && num<1000)
        {
            System.out.println("is a 3 dig num");

        }
        else{
            System.out.println("not a 3 dig num");
        }
    }
}