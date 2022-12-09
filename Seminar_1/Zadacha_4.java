

// Реализовать простой калькулятор 
// ("введите первое число"... "Введите второе число"... "укажите операцию, 
// которую надо выполнить с этими числами"... "ответ: ...")

import java.util.Scanner;

class Zadacha4 {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        float num1 = getNumbers();
        float num2 = getNumbers();
        char operation = getOperation();
        float result = calc(num1,num2,operation);
        System.out.println("Результат действия " + " = " + result);
    }
 
    public static float getNumbers(){
        System.out.print("Введите число:  ");
        float num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не правильное значение. Попробуйте еще раз.");
            scanner.next();
            num = getNumbers();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.print("Введите операцию:  +  -  *  /  :  ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
 
    public static float calc(float num1, float num2, char operation){
        float result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция введена не правильновы. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}