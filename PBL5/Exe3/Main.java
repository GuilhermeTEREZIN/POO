
public class Main {
    public static void main(String[] args) {
        ContaCorrente contacorrente = new ContaCorrente(15000f);
        ContaPoupanca contapoupanca = new ContaPoupanca(2655f);

        Pessoa pessoa1 = new Pessoa("Guilherme Terezin",contacorrente);
        Pessoa pessoa2 = new Pessoa("Giovanni Uchoa",contapoupanca);

        System.out.print("Saldo da pessoa 1: ");
        pessoa1.getConta().mostrarSaldo();
        pessoa1.depositar(50.00f);
        pessoa1.getConta().mostrarSaldo();

        System.out.print("\nSaldo da pessoa 2: ");
        pessoa2.getConta().mostrarSaldo();
        pessoa2.depositar(1700.81f);
        pessoa2.getConta().mostrarSaldo();

    }
}
