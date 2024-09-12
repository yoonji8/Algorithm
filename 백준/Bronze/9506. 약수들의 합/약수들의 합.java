import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if (sum == n) {
                System.out.print(n + " = 1");
                for (int j = 1; j < list.size(); j++) {
                    System.out.print(" + " + list.get(j));
                }
            } else {
                System.out.print(n + " is NOT perfect.");
            }
            System.out.println();
        }
    }
}