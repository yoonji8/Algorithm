import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> x_map = new HashMap<>();
        Map<String, Integer> y_map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            x_map.put(a, x_map.getOrDefault(a, 0) + 1);
            y_map.put(b, y_map.getOrDefault(b, 0) + 1);
        }

        for (String s : x_map.keySet()) {
            if (x_map.get(s) == 1) {
                System.out.print(s + " ");
            }
        }
        for (String s : y_map.keySet()) {
            if (y_map.get(s) == 1) {
                System.out.println(s);
            }
        }

    }
}