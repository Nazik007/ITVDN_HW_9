import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        // Створюєм масив з користувачем
        System.out.print("Вкажіть розмір масиву: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];  // користувач вводить
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        // Шукаєм макс число із масиву
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max)
            max = input[i];
        }
        System.out.println("Найбільше значення з введеного масиу цифр є: " + max);

        // шукаєм мін число із масиву
        int min = input[0];
        for (int j = 0; j < input.length; j++) {
                if (input[j] < min)
                min = input[j];

            }
        System.out.println("Найменше значення з введеного масиу цифр є: " + min);

        // Шукаєм загальну суму всіх значень із масиву
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        System.out.println("Загальна сума всіх елементів масиву є: " + sum);

        // Шукаєм середнє арифметичне із масиу
        double average = 0;
        double sum1 = 0;
        for (int i = 0; i < input.length; i++) {
            sum1 += input[i];
        }
        average = sum1 / input.length;
        System.out.println("Середнє арифметичне всіх елементів є: " + average);

        // Виводим всі не парні значеня
        int unpair = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0){
                unpair = input[i];
                System.out.println("Непарне значення із масиву: " + unpair);
            }

        }

        }
    }

