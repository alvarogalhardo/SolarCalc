public class Cliente_Simulador {
    private int codIdClienteSimulador;
    private double custoAtual;
    private boolean receberComunicacoes;

    public int getCodIdClienteSimulador() {
        return codIdClienteSimulador;
    }
    public void setCodIdClienteSimulador(int codIdClienteSimulador) {
        this.codIdClienteSimulador = codIdClienteSimulador;
    }
    public double getCustoAtual() {
        return custoAtual;
    }
    public void setCustoAtual(double custoAtual) {
        this.custoAtual = custoAtual;
    }
    public boolean isReceberComunicacoes() {
        return receberComunicacoes;
    }
    public void setReceberComunicacoes(boolean receberComunicacoes) {
        this.receberComunicacoes = receberComunicacoes;
    }
}
