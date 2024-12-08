import java.util.Scanner;

public class CalculoFinanceiro {

    public static double calcularValorFuturo(double pv, double taxaJuros, int periodos) {
        return pv * Math.pow(1 + taxaJuros, periodos);
    }

    // Função para calcular o Valor Presente (PV)
    public static double calcularValorPresente(double fv, double taxaJuros, int periodos) {
        return fv / Math.pow(1 + taxaJuros, periodos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de escolha
        System.out.println("Cálculos de Valor Presente e Valor Futuro");
        System.out.print("Você quer calcular o (1) Valor Presente ou (2) Valor Futuro? Digite 1 ou 2: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            // Calcular o Valor Presente
            System.out.print("Digite o Valor Futuro (FV): ");
            double fv = scanner.nextDouble();
            System.out.print("Digite a taxa de juros (em %): ");
            double taxaJuros = scanner.nextDouble() / 100;
            System.out.print("Digite o número de períodos: ");
            int periodos = scanner.nextInt();

            double pv = calcularValorPresente(fv, taxaJuros, periodos);
            System.out.printf("O Valor Presente (PV) é: R$%.2f%n", pv);
        } else if (escolha == 2) {
            // Calcular o Valor Futuro
            System.out.print("Digite o Valor Presente (PV): ");
            double pv = scanner.nextDouble();
            System.out.print("Digite a taxa de juros (em %): ");
            double taxaJuros = scanner.nextDouble() / 100;
            System.out.print("Digite o número de períodos: ");
            int periodos = scanner.nextInt();

            double fv = calcularValorFuturo(pv, taxaJuros, periodos);
            System.out.printf("O Valor Futuro (FV) é: R$%.2f%n", fv);
        } else {
            System.out.println("Opção inválida! Digite 1 para Valor Presente ou 2 para Valor Futuro.");
        }

        scanner.close();
    }
}
