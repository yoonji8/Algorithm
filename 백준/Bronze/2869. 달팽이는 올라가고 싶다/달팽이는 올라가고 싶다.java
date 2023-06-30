import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        long count = (V-A)/(A-B);
        if((V-A)%(A-B)==0){
            System.out.println(count+1);
        }else{
            System.out.println(count+2);
        }
    }
}