package Hotel;

import java.time.LocalDate;

public class Reserva {
    private Hospede hospede;
    private LocalDate dataCheckin;
    private LocalDate dataCheckout;
    private Quarto quarto;

    public Reserva(Hospede hospede, LocalDate dataCheckin, LocalDate dataCheckout, Quarto quarto) {
        this.hospede = hospede;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.quarto = quarto;
    }
    
    public String detalhesReserva() {
        return "Nome do hóspede: " + hospede.getNome() +
               ", Data de check-in: " + dataCheckin +
               ", Data de check-out: " + dataCheckout +
               ", Número do quarto: " + quarto.getNumero() +
               ", Tipo de quarto: " + quarto.getTipo();
    }

    public Hospede getHospede() {
        return hospede;
    }

    public LocalDate getDataCheckin() {
        return dataCheckin;
    }

    public LocalDate getDataCheckout() {
        return dataCheckout;
    }

    public Quarto getQuarto() {
        return quarto;
    }
}
