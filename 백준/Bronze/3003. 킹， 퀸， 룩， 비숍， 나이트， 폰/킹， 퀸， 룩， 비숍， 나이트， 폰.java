import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] chess = {1,1,2,2,2,8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < chess.length; i++) {
            int a = Integer.parseInt(st.nextToken());
            chess[i] -= a;
            System.out.print(chess[i] + " ");
        }
    }
}