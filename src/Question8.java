import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("키 입력: ");
        double heightCm = scanner.nextDouble();
        System.out.print("몸무게 입력: ");
        double weight = scanner.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi <= 24.9) {
            System.out.println("정상");
        } else if (bmi <= 29.9) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }

        scanner.close();
    }
}