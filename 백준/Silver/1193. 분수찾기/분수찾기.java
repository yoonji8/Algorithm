import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt = 0;

        while (sum < X) {
            cnt++;
            sum += cnt;
        }
        int diff = sum - X;
        
        if (cnt % 2 == 0) {
            System.out.println((cnt - diff) + "/" + (1 + diff));
        } else {
            System.out.println((1 + diff) + "/" + (cnt - diff));
        }

    }
}