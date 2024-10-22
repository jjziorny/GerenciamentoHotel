import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static GerenciamentoHotel hotel = new GerenciamentoHotel();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        executar();
    }

    public static void opcoes() {
        System.out.println("Sistema de Gerenciamento de Hotel");
        System.out.println("1 - Cadastrar quarto.");
        System.out.println("2 - Fazer reserva.");
        System.out.println("3 - Realizar check-in.");
        System.out.println("4 - Realizar check-out.");
        System.out.println("5 - Listar quartos disponíveis.");
        System.out.println("6 - Ver histórico de reservas.");
        System.out.println("7 - Sair.");
    }

    public static void executar() {
        int escolha = 0;
        while (escolha != 7) {
            opcoes();
            System.out.println("Escolha uma opção:");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    cadastrarQuarto();
                    break;
                case 2:
                    fazerReserva();
                    break;
                case 3:
                    checkIn();
                    break;
                case 4:
                    checkOut();
                    break;
                case 5:
                    hotel.listarQuartosDisponiveis();
                    break;
                case 6:
                    hotel.mostrarReservas();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    public static void cadastrarQuarto() {
        System.out.println("Digite o número do quarto:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o tipo do quarto (Solteiro/Casal/Suíte):");
        String tipo = scanner.nextLine();
        System.out.println("Digite o preço diário:");
        double precoDiario = scanner.nextDouble();
        scanner.nextLine();

        Quarto novoQuarto = new Quarto(numero, tipo, precoDiario, true);
        hotel.cadastrarQuarto(novoQuarto);
        System.out.println("Quarto cadastrado com sucesso.");
    }

    public static void fazerReserva() {
        System.out.println("Digite o nome do hóspede:");
        String nomeHospede = scanner.nextLine();
        System.out.println("Digite o número do quarto a ser reservado:");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a data de check-in (yyyy-mm-dd):");
        LocalDate checkIn = LocalDate.parse(scanner.nextLine());
        System.out.println("Digite a data de check-out (yyyy-mm-dd):");
        LocalDate checkOut = LocalDate.parse(scanner.nextLine());

        System.out.println("Digite o tipo do quarto:");
        String tipoQuarto = scanner.nextLine();

        Reserva novaReserva = new Reserva(nomeHospede, checkIn, checkOut, numeroQuarto, tipoQuarto);
        hotel.fazerReserva(novaReserva);
        System.out.println("Reserva realizada com sucesso.");
    }

    public static void checkIn() {
        System.out.println("Digite o número do quarto para check-in:");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();
        hotel.checkIn(numeroQuarto);
    }


    public static void checkOut() {
        System.out.println("Digite o número do quarto para check-out:");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();
        hotel.checkOut(numeroQuarto);
    }

}
