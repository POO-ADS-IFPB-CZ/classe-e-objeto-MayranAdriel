package questao13;

public class Instancias {
    public static void main(String[] args) {
        Conta conta1 = new Conta(100.0);
        Conta conta2 = new Conta(100.0);

        //Valores antes da transferência
        System.out.println("Conta origem: " + conta1.getSaldo());
        System.out.println("Conta destino: " + conta2.getSaldo());

        conta1.transfere(conta1, conta2, 100);

        //Valores após a transferência
        System.out.println("Conta origem: " + conta1.getSaldo());
        System.out.println("Conta destino: " + conta2.getSaldo());
    }
}
