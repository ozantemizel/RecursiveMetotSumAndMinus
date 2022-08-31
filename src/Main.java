import java.util.Scanner;

public class Main {
    static void sumAndMinus(int a){

        int b = a;
        while (a > 0) {
            System.out.print(a + " ");
           a-=5;
        }
        while (a <= b) {
            System.out.print(a + " ");
            a+=5;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int a = input.nextInt();
        sumAndMinus(a);
    }
}
