import java.util.Scanner;

public class JavaRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int pizza = scan.nextInt();
        int count = 1;
        for (int i = 0; i > 0; i--) {
            if ((pizza % people) == 0) {
                System.out.println(count);
            } else {
                count++;
                pizza = pizza + pizza;
            }
        }
    }
}