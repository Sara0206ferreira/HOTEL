package Hotel;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Cadastre o Quarto");
            System.out.println("2. Cadastre a Reserva");
            System.out.println("3. Mostrar Cadastro de Reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Número do quarto: ");
                String numero = scanner.nextLine();
                System.out.print("Tipo de quarto (solteiro/casal/suíte): ");
                String tipo = scanner.nextLine();
                System.out.print("Valor da Diária: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                hotel.cadastrarQuarto(numero, tipo, preco);
                System.out.println("Quarto cadastrado!");

            } else if (opcao.equals("2")) {
                System.out.print("Nome do hóspede: ");
                String nomeHospede = scanner.nextLine();
                System.out.print("Check-in (Ano-Mês-Dia): ");
                LocalDate dataCheckin = LocalDate.parse(scanner.nextLine());
                System.out.print("Check-out (Ano-Mês-Dia): ");
                LocalDate dataCheckout = LocalDate.parse(scanner.nextLine());
                System.out.print("Número do quarto reservado: ");
                String numeroQuarto = scanner.nextLine();
                String resultado = hotel.cadastrarReserva(nomeHospede, dataCheckin, dataCheckout, numeroQuarto);
                System.out.println(resultado);

            } else if (opcao.equals("3")) {
                hotel.relatorioHistoricoReservas();  

            } else if (opcao.equals("4")) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
