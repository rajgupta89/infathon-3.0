import java.util.*;
class Main{
    public static List<String> transform(String src, String des,
        Set<String> dictionary) {
    Queue<String> Q = new LinkedList<String>();
    Set<String> visited = new HashSet<String>();
    Map<String, String> routes = new HashMap<String, String>();
    Q.add(src);
    visited.add(src);
    while (!Q.isEmpty()) {
        String t = Q.poll();
        if (t.equals(des)) {
            LinkedList<String> list = new LinkedList<String>();
            while (t != null) {
                list.add(0, t);
                t = routes.get(t);
            }
            return list;
        }
        for (String o : getAllTransformations(t, dictionary)) {
            if (!visited.contains(o)) {
                visited.add(o);
                Q.add(o);
                routes.put(o, t);
            }
        }
    }
    return null;
}
 
private static List<String> getAllTransformations(String src, Set<String> dictionary) {
    List<String> results = new LinkedList<String>();
    for (int i = 0; i < src.length(); ++i) {
        for (char c = 'A'; c <= 'Z'; ++c) {
            String newStr = src.substring(0, i) + c + src.substring(i + 1);
            if (!src.equals(newStr) && dictionary.contains(newStr))
                results.add(newStr);
        }
    }
    return results;
}
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String s1=in.next();
    int n=in.nextInt();
    Set<String> sss=new HashSet<String>();
    for (int i = 0; i < n; i++) {
        String s2=in.next();
        sss.add(s2);
    }
    System.out.println(transform(s, s1, sss));
}
}