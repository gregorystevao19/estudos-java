import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura atual em Celsius: ");
        float tempCelsius = scanner.nextFloat();
        float tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.printf("A temperatura de %.2f graus Celsius é equivalente a %.2f graus Fahrenheit.", tempCelsius, tempFahrenheit);

    }
}