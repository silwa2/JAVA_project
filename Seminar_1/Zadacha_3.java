// Вывести все простые числа от 1 до 1000 
// (простые числа - это числа которые делятся только на себя и на единицу без остатка. 
// Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице).




public class Zadacha_3 {
    public static void main(String args[]){
        numbers();
    }

    public static void numbers(){
        int number = 1000;
        for (int i = 2; i <= number; i++){
            boolean prime_number = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    prime_number = false;
                    break; 
                }
            }
            if (prime_number){
                System.out.println(i);
            }
        }
    }
}




    
