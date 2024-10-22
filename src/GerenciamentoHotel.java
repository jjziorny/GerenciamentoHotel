import java.util.List;
import java.util.ArrayList;

public class GerenciamentoHotel {

    private List<Quarto> quartos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void fazerReserva(Reserva reserva) {
        for (Quarto quarto : quartos) {
            if (quarto.numero == reserva.numeroQuarto && quarto.disponibilidade) {
                quarto.atualizarDisponibilidade(false);
                reservas.add(reserva);
                System.out.println("Reserva feita para o quarto " + reserva.numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto indisponível ou não encontrado.");
    }

    public void checkIn(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.numero == numeroQuarto && quarto.disponibilidade) {
                quarto.atualizarDisponibilidade(false);
                System.out.println("Check-in realizado com sucesso no quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto não encontrado ou já ocupado.");
    }

    public void checkOut( int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.numero == numeroQuarto && !quarto.disponibilidade) {
                quarto.atualizarDisponibilidade(true);
                System.out.println("Check-out realizado no quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto já está disponível ou não foi encontrado.");
    }

    public void mostrarReservas() {
        System.out.println("Histórico de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void listarQuartosDisponiveis() {
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartos) {
            if (quarto.disponibilidade) {
                System.out.println(quarto);
            }
        }
    }
}
