/*
Пользователь вводит трехзначное число. Найдите:
Число единиц, десятков. 
Сумму цифр
Для решения можно использовать арифметический 
оператор % остаток от деления
Aleksandr Egorov JPTV20
*/
package three;
import java.util.Scanner;

public class Three {
  
    public static void main(String[] args) {
        System.out.print("Введите трёхзначное число: ");
        int x = new Scanner(System.in).nextInt();
        int e = x%10; // единицы
        int d = x / 10 % 10;  // десятки
        int summ = e+d; // сумма цифр
        System.out.println("\nЕдиницы: " + e + "\nДесятки: " + d + "\nСумма всех цифр: " + summ);
    }
    
}