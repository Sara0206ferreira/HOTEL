package Hotel;

public class Quarto {
    private String numero;
    private String tipo;
    private double preco;
    private boolean disponibilidade;

    public Quarto(String numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.disponibilidade = true; // true para disponível, false para ocupado
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
