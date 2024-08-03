import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[9];
        int num = 0;
        int max = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) {
                max = arr[i];
                num = i;
            }
        }

        System.out.println(max);
        System.out.println(num+1);
    }
}