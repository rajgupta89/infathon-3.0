import java.util.Scanner;

public class guess_the_word {
    public static String guess(String s){
        if(s.length()==1)
          return s;
        char[] c=s.toCharArray();
        for (int i = 0; i <s.length()/2; i++) {
            char ch=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=ch;            
        }
        String s2=new String(c);
        return s2;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String[] s1=new String[3];
        if(s.length()<3)
        System.out.println("TANTRUM");
        else{
        if(s.length()%3==0){
            int len=s.length()/3;
            s1[0]=s.substring(0,len);
            s1[1]=s.substring(len,len*2);
            s1[2]=s.substring(len*2,len*3);
        }
        else{
            int len=(s.length()-s.length()%3)/2;
            int len1=s.length()%3;
            s1[0]=s.substring(0,len);
            s1[1]=s.substring(len,len+len1);
            s1[2]=s.substring(len+len1,len*2+len1);
        }
        String newstring="";
        for (int i = 0; i < 3; i++) {
            if(i==1)
            newstring+=s1[i];
            else
            newstring+=guess(s1[i]);          
        }
        System.out.println(newstring);
    }
}
}
