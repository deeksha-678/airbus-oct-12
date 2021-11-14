import java.util.Scanner;
 class evenorodd
{
public static void main(String[] args)
{
    Scanner reader=new Scanner(System.in);
    System.out.println("ent a num");
    int num=reader.nextInt();
    if(num%2==0)
    System.out.println(num + "is even");
    else
    System.out.println(num + "is odd");
}
}