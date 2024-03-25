import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o seu peso em quilos: ");
        double peso = scanner.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Obesidade de grau 1");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesidade de grau 2 (severa)");
        }
        else{
            System.out.println("Obesidade de grau 3 (mórbida)");
        }

    }
}