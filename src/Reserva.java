import java.time.LocalDate;


public class Reserva {

    String nomeHospede;
    LocalDate checkIn;
    LocalDate checkOut;
    int numeroQuarto;
    String tipoQuarto;

    public Reserva(String nomeHospede, LocalDate checkIn, LocalDate checkOut, int numeroQuarto, String tipoQuarto) {
        this.nomeHospede = nomeHospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Reserva{" +
                "nomeHospede='" + nomeHospede + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", numeroQuarto=" + numeroQuarto +
                ", tipoQuarto='" + tipoQuarto + '\'' +
                '}';
    }
}
