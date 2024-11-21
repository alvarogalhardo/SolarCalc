public class Cliente {
    private int codIdentificador;
    private String nome;
    private String email;
    private String endereço;
    private String telefone;
    private double consumoMensal;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getConsumoMensal(){
        return consumoMensal;
    }
    public void setConsumoMensal(double consumoMensal){
        this.consumoMensal = consumoMensal;
    }
    public int getCodIdentificador(){
        return codIdentificador;
    }

}
