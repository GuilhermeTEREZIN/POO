class ContaPoupanca extends Conta {
    public ContaPoupanca(float saldo) {
        super(saldo);
    }

    @Override
    public void mostrarSaldo() {
        //float rendimento = getSaldo() * 0.005;
        System.out.printf("Saldo da Poupança com o rendimento de 0,5: R$ %.2f\n", (getSaldo() * 1.005));
    }
}
