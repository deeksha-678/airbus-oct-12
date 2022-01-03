import java.util.Scanner;
class interview{
    public static void main(String[] args)
    {
        int n,i;
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                n=i/2;
            }
            else{
                n=i*3+1;
            }
            System.out.println(n);
        }
    }
}