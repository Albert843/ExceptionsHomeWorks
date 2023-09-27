import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любой текст, кроме пустой строки: ");
        try {
            String result = br.readLine();
            System.out.println(result);
            if(result.equals("")) {
                throw new RuntimeException("Надо ввести слово!");
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
