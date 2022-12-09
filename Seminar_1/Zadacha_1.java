//  Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

class Zadacha_1 {
    public static void main(String[] args) {
        numbers();

    }
    public static void numbers(){

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 0;i <= n; i++) {
                sum += i;
            }
            System.out.printf("The sum of the numbers from 1 to %d = %d%n", n, sum);
        }else {
            System.out.println("You didn't enter an integer.");
        }
    }
}