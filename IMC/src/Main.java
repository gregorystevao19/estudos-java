import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static  double calcIMC(double peso, double altura){
        return peso / (Math.pow(altura, 2));
    }

    public  static void printIMC(double imc){
        if (imc <= 18.5) {
            System.out.printf("O resultado do seu IMC foi de: %.2f. Isso indica que você está: ABAIXO DO PESO", imc);
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.printf("O resultado do seu IMC foi de: %.2f. Isso indica que você está: PESO IDEAL", imc);
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.printf("O resultado do seu IMC foi de: %.2f. Isso indica que você está: LEVEMENTE ACIMA DO PESO", imc);
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.printf("O resultado do seu IMC foi de: %.2f. Isso indica que você está: OBESIDADE DE GRAU 1", imc);
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.printf("O resultado do seu IMC foi de: %.2f. Isso indica que você está: OBESIDADE DE GRAU 2 (SEVERA)", imc);
        } else {
            System.out.printf("O resultado do seu IMC foi de: %.2f. Isso indica que você está: OBESIDADE DE GRAU 3 (MÓRBIDA)", imc);
        }
    }
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Informe o seu peso em quilos: ");
        double peso = scanner.nextDouble();

        double imc = calcIMC(altura, peso);
        printIMC(imc);
        scanner.close();
    }
}