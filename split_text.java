import java.util.*;
public class split_text
{
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       in.nextLine();
       String text=in.nextLine();
       StringBuilder text1=new StringBuilder(text);
      
       int index=0;
      
       while (index+n<text1.length() && (index=text1.lastIndexOf(" ",index+n)) !=-1){
       text1.replace(index,index+1,"\n");
       }
   String result=text1.toString();
  
   System.out.println(result);
      
   }
}