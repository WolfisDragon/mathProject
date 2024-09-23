import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, max, min;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a>b){
            max = a;
        }
        else {
            max = b;
        }

        if(c>max){
            max = c;
        }

        if (a<b) {
            min = a;
        }
        else min = b;

        if (c<min) {
            min = c;
        }

        System.out.print(max - min);
    }
}