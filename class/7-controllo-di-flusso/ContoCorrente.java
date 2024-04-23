class ContoCorrente {
  double saldo;

  void deposito(double importo) {
    saldo += importo;
  }

  void prelievo(double importo) {
    saldo -= importo;
  }

  double saldo() {
    return saldo;
  }
}