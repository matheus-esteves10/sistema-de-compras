public class Compra implements Comparable<Compra> {

    private double valor;
    private String descricao;

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compra: descrição = " + descricao +
                "valor = " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) { //método criado para ordenar as compras por valor
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
