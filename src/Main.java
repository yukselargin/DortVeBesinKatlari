import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.print("\n");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + ",");
        }

    }
}