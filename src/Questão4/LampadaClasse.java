package Questão4;

import questao1.LampadaModelo;

public class LampadaClasse {
    public static void main(String[] args) {
        LampadaModelo lampadaModelo = new LampadaModelo(20.0, "modelo1", "marca1", true);

        System.out.println(lampadaModelo.getModelo());
        System.out.println(lampadaModelo.getMarca());
        System.out.println(lampadaModelo.getPreco());
        System.out.println(lampadaModelo.isDisponivel());

        lampadaModelo.vendido();

        System.out.println(lampadaModelo.isDisponivel());
    }
}
