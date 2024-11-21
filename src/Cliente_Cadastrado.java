public class Cliente_Cadastrado {
    private int codCadastro;
    private String seqCNPJ;
    private double consumoMensal;

    public void cadastrarCNPJ(String CNPJ){
        this.seqCNPJ = CNPJ;
    }
    public double getConsumoMensal(){
        return consumoMensal;
    }
    public void setConsumoMensal(double consumoMensal){
        this.consumoMensal = consumoMensal;
    }
    public String getSeqCNPJ(){
        return seqCNPJ;
    }
    public void setCodCadastro(int codCadastro){
        this.codCadastro = codCadastro;
    }
    public int getCodCadastro(){
        return codCadastro;
    }
}
