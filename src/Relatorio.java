import java.util.Date;

public class Relatorio {
    private int codRelatorio;
    private int codIdentificadorRelatorioFK;
    private int codMedidorRelatorioFK;
    private Date dataRelatorio;
    private double consumoRelatorio;
    private double economiaRelatorio;
    private Cliente_Cadastrado codCadastroRelatorio;
    private Medidor codMedidorRelatorio;

    public Relatorio gerarRelatorioMensal(){
        return null;
    }
    public Relatorio gerarrelatorioAnual(){
        return null;
    }
    public Relatorio gerarRelatorioCustomizado(){
        return null;
    }
    public int getCodRelatorio() {
        return codRelatorio;
    }
    public void setCodRelatorio(int codRelatorio) {
        this.codRelatorio = codRelatorio;
    }
    public int getCodIdentificadorRelatorioFK() {
        return codIdentificadorRelatorioFK;
    }
    public void setCodIdentificadorRelatorioFK(int codIdentificadorRelatorioFK) {
        this.codIdentificadorRelatorioFK = codIdentificadorRelatorioFK;
    }
    public int getCodMedidorRelatorioFK() {
        return codMedidorRelatorioFK;
    }
    public void setCodMedidorRelatorioFK(int codMedidorRelatorioFK) {
        this.codMedidorRelatorioFK = codMedidorRelatorioFK;
    }
    public Date getDataRelatorio() {
        return dataRelatorio;
    }
    public void setDataRelatorio(Date dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }
    public double getConsumoRelatorio() {
        return consumoRelatorio;
    }
    public void setConsumoRelatorio(double consumoRelatorio) {
        this.consumoRelatorio = consumoRelatorio;
    }
    public double getEconomiaRelatorio() {
        return economiaRelatorio;
    }
    public void setEconomiaRelatorio(double economiaRelatorio) {
        this.economiaRelatorio = economiaRelatorio;
    }
    public Cliente_Cadastrado getCodCadastroRelatorio() {
        return codCadastroRelatorio;
    }
    public void setCodCadastroRelatorio(Cliente_Cadastrado codCadastroRelatorio) {
        this.codCadastroRelatorio = codCadastroRelatorio;
    }
    public Medidor getCodMedidorRelatorio() {
        return codMedidorRelatorio;
    }
    public void setCodMedidorRelatorio(Medidor codMedidorRelatorio) {
        this.codMedidorRelatorio = codMedidorRelatorio;
    }

}
