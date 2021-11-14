import java.util.Scanner;
class codecracker
{
    public static void main(String[] args){
        int a,b,big;
        Scanner scan=new Scanner(System.in);
        System.out.println("ent 2 numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        big=(a>b) ? a:b;
        System.out.println("\n largest=" +big);
    }
}