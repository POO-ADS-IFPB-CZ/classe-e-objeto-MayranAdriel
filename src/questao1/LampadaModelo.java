package questao1;

import java.util.Objects;

public class LampadaModelo {
    long Id;
    double preco;
    String modelo;
    String marca;
    boolean disponivel;

    public LampadaModelo(double preco, String modelo, String marca, boolean disponivel) {
        this.preco = preco;
        this.modelo = modelo;
        this.marca = marca;
        this.disponivel = disponivel;
    }

    public LampadaModelo() {

    }

    public void vendido(){
        setDisponivel(false);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LampadaModelo lampada = (LampadaModelo) o;
        return Id == lampada.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

    @Override
    public String toString() {
        return "LampadaModelo{" +
                "Id=" + Id +
                ", preco=" + preco +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }


}
