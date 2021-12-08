
import java.io.*;
  
class GetSet {
  
   
    private int num;
  
   
    public void setNumber(int number)
    {
  
       
        if (number < 1 || number > 10) {
  
            throw new IllegalArgumentException();
        }
        number = num;
    }
  
   
    public int getNumber() { return num; }
}
  

class GFG {
  
   
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
  
        obj.setNumber(5);
  
        
        System.out.println(obj.getNumber());
    }
}