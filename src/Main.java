import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Привет, напиши сколько прошло секунд с начала суток: ");
            int s;
            try {
                s = scanner.nextInt();

            int h = (s - s % 3600) / 3600;
            int m = ((s - h * 3600) - (s - h * 3600) % 60) / 60;
            System.out.println("Прошло: Часов: " + h);
            System.out.println("        Минут: " + m);
            System.out.println("        Секунд: " + (s - h * 3600 - m * 60));
            } catch (Exception ex) {
                System.out.println("Ты ввёл что то не так");
            }
        }
}