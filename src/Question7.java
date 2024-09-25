import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("달(month) 을 입력하세요.: ");
        int season = sc.nextInt();

        if (season == 12 || season == 1 || season == 2) {
            System.out.println("겨울입니다");
        }
        else if (season == 3 || season == 4 || season == 5) {
            System.out.println("봄입니다");
        }
        else if (season == 6 || season == 7 || season == 8) {
            System.out.println("여름입니다");
        }
        else if (season == 9 || season == 10 || season == 11) {
            System.out.println("가을입니다");
        }
        else {
            System.out.println("잘못된 값입니다.");
        }

    }
}
