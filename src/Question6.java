import java.util.Scanner;

public class Question6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도: ");
        int score = sc.nextInt();

        if (score % 4==0) {
            System.out.println("윤년");
        } else {
            System.out.println("걍 년");
        }
    }
}