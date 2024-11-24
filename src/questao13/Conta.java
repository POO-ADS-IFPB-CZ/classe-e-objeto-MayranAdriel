package questao13;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void retira(double valor){
            saldo -= valor;
    }

    public boolean transfere(Conta contaOrigem, Conta contaDestino, double valor){
        if(valor > contaOrigem.getSaldo()) return false;
        else {
            contaOrigem.retira(valor);
            contaDestino.deposita(valor);
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
