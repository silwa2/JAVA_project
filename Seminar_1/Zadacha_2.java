// Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Zadacha_2 {
    public static void main(String[] args) {
        multi();

    }
    public static void multi(){

        System.out.println("Enter a number n: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int multiplication = 1;
            for (int i = 1;i <= n; i++) {
                multiplication *= i;
            }
            System.out.printf("The factorial of the number is %d = %d%n", n, multiplication);
        }else {
            System.out.println("You didn't enter an integer.");
        }
    }
}
