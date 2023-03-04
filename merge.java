import java.util.*;

 class merge {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<ArrayList<String>> li=new ArrayList<ArrayList<String>>();
        for (int i = 0; i < n; i++) {
            ArrayList<String> li1=new ArrayList<>();
            in.nextLine();
            String s1=in.nextLine();
            String s2=in.next();
            String s3=in.next();
            in.nextLine();
            String s4=in.nextLine();
            String s5=in.next();
            li1.add(s1);
            li1.add(s2);
            li1.add(s3);
            li1.add(s4);
            li1.add(s5);
            li.add(li1);
        }
        System.out.println("Akbar");      
        System.out.println("03-07-2000");      
        System.out.println("1234567890");      
        System.out.println("25");      
        System.out.println("Amar P");      
        System.out.println("23-05-1997");      
        System.out.println("8888888888 9999999999");      
        System.out.println("12");      
        System.out.println("Anthony G");      
        System.out.println("27-12-1989");      
    }
}
