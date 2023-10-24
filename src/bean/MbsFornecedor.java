package bean;
// Generated 12/09/2023 11:13:53 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MbsFornecedor generated by hbm2java
 */
@Entity
@Table(name="mbs_fornecedor"
    ,catalog="db_marcel_silva"
)
public class MbsFornecedor  implements java.io.Serializable {


     private int mbsIdFornecedor;
     private String mbsNome;
     private String mbsTelefone;
     private String mbsEmail;
     private String mbsCnpj;
     private String mbsEndereco;
     private String mbsGarantia;
     private String mbsPais;
     private String mbsCidade;
     private String mbsEstado;
     private String mbsRamoAtuacao;
     private Date mbsDataCadastro;
     private String mbsAtivo;
     private String mbsObservacoes;
     private String mbsCep;
    

    public MbsFornecedor() {
    }

	
    public MbsFornecedor(String mbsNome, String mbsTelefone, String mbsEmail, String mbsCnpj, String mbsEndereco, String mbsGarantia, String mbsPais, String mbsCidade, String mbsEstado, String mbsRamoAtuacao, String mbsAtivo, String mbsCep) {
        this.mbsNome = mbsNome;
        this.mbsTelefone = mbsTelefone;
        this.mbsEmail = mbsEmail;
        this.mbsCnpj = mbsCnpj;
        this.mbsEndereco = mbsEndereco;
        this.mbsGarantia = mbsGarantia;
        this.mbsPais = mbsPais;
        this.mbsCidade = mbsCidade;
        this.mbsEstado = mbsEstado;
        this.mbsRamoAtuacao = mbsRamoAtuacao;
        this.mbsAtivo = mbsAtivo;
        this.mbsCep = mbsCep;
    }
    
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mbs_idFornecedor", unique=true, nullable=false)
    public int getMbsIdFornecedor() {
        return this.mbsIdFornecedor;
    }
    
    public void setMbsIdFornecedor(int mbsIdFornecedor) {
        this.mbsIdFornecedor = mbsIdFornecedor;
    }

    
    @Column(name="mbs_nome", nullable=false, length=60)
    public String getMbsNome() {
        return this.mbsNome;
    }
    
    public void setMbsNome(String mbsNome) {
        this.mbsNome = mbsNome;
    }

    
    @Column(name="mbs_telefone", nullable=false, length=14)
    public String getMbsTelefone() {
        return this.mbsTelefone;
    }
    
    public void setMbsTelefone(String mbsTelefone) {
        this.mbsTelefone = mbsTelefone;
    }

    
    @Column(name="mbs_email", nullable=false, length=60)
    public String getMbsEmail() {
        return this.mbsEmail;
    }
    
    public void setMbsEmail(String mbsEmail) {
        this.mbsEmail = mbsEmail;
    }

    
    @Column(name="mbs_cnpj", nullable=false, length=18)
    public String getMbsCnpj() {
        return this.mbsCnpj;
    }
    
    public void setMbsCnpj(String mbsCnpj) {
        this.mbsCnpj = mbsCnpj;
    }

    
    @Column(name="mbs_endereco", nullable=false, length=60)
    public String getMbsEndereco() {
        return this.mbsEndereco;
    }
    
    public void setMbsEndereco(String mbsEndereco) {
        this.mbsEndereco = mbsEndereco;
    }

    
    @Column(name="mbs_garantia", nullable=false, length=1)
    public String getMbsGarantia() {
        return this.mbsGarantia;
    }
    
    public void setMbsGarantia(String mbsGarantia) {
        this.mbsGarantia = mbsGarantia;
    }

    
    @Column(name="mbs_pais", nullable=false, length=25)
    public String getMbsPais() {
        return this.mbsPais;
    }
    
    public void setMbsPais(String mbsPais) {
        this.mbsPais = mbsPais;
    }

    
    @Column(name="mbs_cidade", nullable=false, length=50)
    public String getMbsCidade() {
        return this.mbsCidade;
    }
    
    public void setMbsCidade(String mbsCidade) {
        this.mbsCidade = mbsCidade;
    }

    
    @Column(name="mbs_estado", nullable=false, length=2)
    public String getMbsEstado() {
        return this.mbsEstado;
    }
    
    public void setMbsEstado(String mbsEstado) {
        this.mbsEstado = mbsEstado;
    }

    
    @Column(name="mbs_ramo_atuacao", nullable=false, length=45)
    public String getMbsRamoAtuacao() {
        return this.mbsRamoAtuacao;
    }
    
    public void setMbsRamoAtuacao(String mbsRamoAtuacao) {
        this.mbsRamoAtuacao = mbsRamoAtuacao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="mbs_data_cadastro", length=10)
    public Date getMbsDataCadastro() {
        return this.mbsDataCadastro;
    }
    
    public void setMbsDataCadastro(Date mbsDataCadastro) {
        this.mbsDataCadastro = mbsDataCadastro;
    }

    
    @Column(name="mbs_ativo", nullable=false, length=1)
    public String getMbsAtivo() {
        return this.mbsAtivo;
    }
    
    public void setMbsAtivo(String mbsAtivo) {
        this.mbsAtivo = mbsAtivo;
    }

    
    @Column(name="mbs_observacoes", length=100)
    public String getMbsObservacoes() {
        return this.mbsObservacoes;
    }
    
    public void setMbsObservacoes(String mbsObservacoes) {
        this.mbsObservacoes = mbsObservacoes;
    }

    
    @Column(name="mbs_cep", nullable=false, length=9)
    public String getMbsCep() {
        return this.mbsCep;
    }
    
    public void setMbsCep(String mbsCep) {
        this.mbsCep = mbsCep;
    }

}


