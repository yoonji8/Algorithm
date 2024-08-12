import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int k = 0; k < M; k++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            for (int l = j; l > i; l--) {
                int temp = arr[l-1];
                arr[l-1] = arr[i-1];
                arr[i-1] = temp;
                i++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}