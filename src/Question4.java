import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = sc.nextInt();

        System.out.print("연산자를 입력하시오 : ");
        char num3 = sc.next().charAt(0);

        int result=0;
        switch (num3) {
            case '+' :
                result = num1 + num2 ;
            case '-' :
                result = num1 - num2 ;
            case '*' :
                result = num1 * num2 ;
            case '/' :
                result =num1 / num2 ;

        }
    }
}
