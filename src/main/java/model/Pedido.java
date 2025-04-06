package model;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numeroMesa;
    private List<String> itens;

    public Pedido(int numeroMesa, List<String> itens) {
        this.numeroMesa = numeroMesa;
        this.itens = itens;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public List<String> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Mesa " + numeroMesa + ": " + String.join(", ", itens);
    }
}
