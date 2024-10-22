public class Quarto{

    int numero;
    String tipo;
    double precoDiario;
    boolean disponibilidade;



    public Quarto(int numero, String tipo, double precoDiario, boolean disponibilidade) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiario = precoDiario;
        this.disponibilidade = disponibilidade;



    }


    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", precoDiario=" + precoDiario +
                ", disponibilidade=" + disponibilidade +
                '}';
    }

    public void atualizarDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;

    }


}