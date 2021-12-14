import java.util.*;  
 class list {  
 static int j=1;  
public static void main(String[] args) {  
        List<Character> list = new LinkedList<>();  
for (char i='a';i<='z';i++) {  
list.add(i);  
        }  
System.out.print("Alphabet : ");  
        Object[] a=list.toArray();  
System.out.println();  
for(int i=0 ;i<a.length;i++){  
System.out.println( j++ +": "+ a[i]);  
        }  
    }  
}
