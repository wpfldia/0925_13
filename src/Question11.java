import java.util.Scanner;
public class Question11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("첫번째 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int b = sc.nextInt();
        System.out.println("세번째 숫자를 입력하세요.");
        int c = sc.nextInt();

        if((a>b) && (a>c)) {
            System.out.println("가장 큰 값은 " + a);
        }
        else if ((b>a) && (b>c)) {
            System.out.println("가장 큰 값은 " + b);
        }
        else if ((c>a) && (c>b)) {
            System.out.println("가장 큰 값은 " + c);
        }
        else if ((a==b) && (a<c)) {
            System.out.println("가장 큰 값은 " + c);
        }
        else if ((a==b) && (a>c)) {
            System.out.println("가장 큰 값은 " + a);
        }
        else if ((c==b) && (a<c)) {
            System.out.println("가장 큰 값은 " + c);
        }
        else if ((c==b) && (a>c)) {
            System.out.println("가장 큰 값은 " + a);
        }
        else if ((a==c) && (a<b)) {
            System.out.println("가장 큰 값은 " + b);
        }
        else if ((a==c) && (a>b)) {
            System.out.println("가장 큰 값은 " + a);
        }
        else if ((a==b)&&(b==c)) {
            System.out.println("세 수가 같습니다.");
        }

    }
}
