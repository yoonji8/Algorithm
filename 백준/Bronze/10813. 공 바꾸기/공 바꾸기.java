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
        
        while (M > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            int temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;

            M--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}