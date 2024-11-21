public class Simulador {
    private int codSimulador;
    private double potenciaSugerida;
    private double estimativaEconomia;
    private double custoEstimado;
    private int codIdentificadorSimulador;
    private static final int irradiacao = 5;
    private static final double potencialPerda = 0.25;

    public double getPotenciaSugerida(){
        return potenciaSugerida;
    }
    public void setPotenciaSugerida(double potenciaSugerida){
        this.potenciaSugerida = potenciaSugerida;
    }
    public double getEstimativaEconomia(){
        return estimativaEconomia;
    }
    public void setEstimativaEconomia(double estimativaEconomia){
        this.estimativaEconomia = estimativaEconomia;
    }
    public int getCodIdentificadorSimulador(){
        return codIdentificadorSimulador;
    }
    public void setCodIdentificadorSimulador(int codIdentificadorSimulador){
        this.codIdentificadorSimulador = codIdentificadorSimulador;
    }
    public int getCodSimulador(){
        return codSimulador;
    }
    public void setCodSimulador(int codSimulador){
        this.codSimulador = codSimulador;
    }
    public double getCustoEstimado(){
        return custoEstimado;
    }
    public void setCustoEstimado(double custoEstimado){
        this.custoEstimado = custoEstimado;
    }

    public int calcularQuantidadePaineis(PainelSolar painelSolar, double custoMensal) {
        double energiaPainel = (painelSolar.getPotencia() * irradiacao * (1 - potencialPerda));
        double res = custoMensal / energiaPainel;
        return (int) Math.ceil(res);
    }

}
