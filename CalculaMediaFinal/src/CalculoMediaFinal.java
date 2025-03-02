import java.util.Locale;
import java.util.Scanner;

public class CalculoMediaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Garante que o separador decimal seja o ponto

        double somaNotas = 0;
        int totalNotas = 3;

        // Recebe as 3 notas
        for (int i = 1; i <= totalNotas; i++) {
            while (true) {
                System.out.print("Digite a " + i + "ª nota (ex: 7.5): ");
                if (scanner.hasNextDouble()) {
                    double nota = scanner.nextDouble();
                    if (nota >= 0 && nota <= 10) { // Valida um intervalo de notas
                        somaNotas += nota;
                        break;
                    } else {
                        System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número decimal com ponto, exemplo: 7.5");
                    scanner.next();
                }
            }
        }

        // Calcula a média
        double media = somaNotas / totalNotas;

        // Exibe o resultado
        System.out.printf("Sua média final é: %.2f\n", media);

        scanner.close();
    }
}
