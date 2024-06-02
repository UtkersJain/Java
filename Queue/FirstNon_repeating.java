package Queue;
import java.util.* ;
public class FirstNon_repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Queue<Character> stream =  new LinkedList<>() ;
        String st = sc.nextLine() ;
        int freq[] = new int[26] ;
        for (int i = 0 ; i < st.length(); i++) {
            freq[st.charAt(i)-'a'] += 1 ;
            stream.add(st.charAt(i)) ;
            while(!stream.isEmpty()) {
                Character ch = stream.peek() ;
                if(freq[ch-'a']==1) {
                    System.out.print(ch + " "); 
                    break ;
                } else {
                    stream.remove() ;
                }
            }
            if(stream.isEmpty()) {
                System.out.print(-1 + " ");
            }

        }
    }
}
