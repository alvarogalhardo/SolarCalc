import java.util.Date;

public class Medidor {
    private int codMedidor;
    private Cliente_Cadastrado codCadastroMedidor;
    private String modelo;
    private double ultimaLeitura;
    private Date dataLeitura;

    public int getCodMedidor() {
        return codMedidor;
    }
    public void setCodMedidor(int codMedidor) {
        this.codMedidor = codMedidor;
    }
    public Cliente_Cadastrado getCodCadastroMedidor() {
        return codCadastroMedidor;
    }
    public void setCodCadastroMedidor(Cliente_Cadastrado codCadastroMedidor) {
        this.codCadastroMedidor = codCadastroMedidor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getUltimaLeitura() {
        return ultimaLeitura;
    }
    public void setUltimaLeitura(double ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }
    public Date getDataLeitura() {
        return dataLeitura;
    }
    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }
}
