import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "";
        boolean toggle = false;
        
        // ✅ Corrected alphabet string
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        Queue<Character> q = new LinkedList<>();
        
        for (int i = 0; i < alphabets.length; i++)
            q.add(alphabets[i]);
        
        while (N > 0) {
            char ch = q.remove();
            if (toggle)
                s = s + ch;      // append at the end
            else
                s = ch + s;      // append at the beginning
            
            toggle = !toggle;
            
            q.add(ch);   // put character back into queue
            N = N - 1;
        }
        System.out.println(s);
    }
}
