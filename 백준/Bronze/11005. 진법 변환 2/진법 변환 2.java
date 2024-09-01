import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int tmp = N % B;
            if (tmp >= 10) {
                char c = (char)(tmp + 55);
                sb.append(c);
            } else {
                sb.append(tmp);
            }
            N /= B;
        }
        
        System.out.println(sb.reverse());
    }
}