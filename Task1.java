import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Введите дробное число: ");
            try {
                Float number = Float.parseFloat(scanner.nextLine());
                System.out.printf("Введенное число %.2f\n" , number);
                flag = false;
            }
            catch (NumberFormatException e){
                System.out.println("Неверный ввод. Введите дробное число!");
            }
        }
    }
}
