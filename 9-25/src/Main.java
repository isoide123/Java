import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上界：");
        int a = sc.nextInt();
        System.out.println("请输入下界：");
        int b = sc.nextInt();
        Equality equality = new Equality();
        equality.verification(a,b);
    }
}
