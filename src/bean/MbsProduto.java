package bean;
// Generated 12/09/2023 11:13:53 by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MbsProduto generated by hbm2java
 */
@Entity
@Table(name="mbs_produto"
    ,catalog="db_marcel_silva"
)
public class MbsProduto  implements java.io.Serializable {


     private int mbsIdProduto;
     private String mbsNome;
     private String mbsDescricao;
     private double mbsPreco;
     private int mbsQuantidade;
     private String mbsTipo;


    public MbsProduto() {
    }

	
    public MbsProduto(String mbsNome, String mbsDescricao, double mbsPreco, int mbsQuantidade, String mbsTipo) {
        this.mbsNome = mbsNome;
        this.mbsDescricao = mbsDescricao;
        this.mbsPreco = mbsPreco;
        this.mbsQuantidade = mbsQuantidade;
        this.mbsTipo = mbsTipo;
    }
    
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mbs_idProduto", unique=true, nullable=false)
    public int getMbsIdProduto() {
        return this.mbsIdProduto;
    }
    
    public void setMbsIdProduto(int mbsIdProduto) {
        this.mbsIdProduto = mbsIdProduto;
    }

    
    @Column(name="mbs_nome", nullable=false, length=45)
    public String getMbsNome() {
        return this.mbsNome;
    }
    
    public void setMbsNome(String mbsNome) {
        this.mbsNome = mbsNome;
    }

    
    @Column(name="mbs_descricao", nullable=false, length=100)
    public String getMbsDescricao() {
        return this.mbsDescricao;
    }
    
    public void setMbsDescricao(String mbsDescricao) {
        this.mbsDescricao = mbsDescricao;
    }

    
    @Column(name="mbs_preco", nullable=false, precision=9)
    public double getMbsPreco() {
        return this.mbsPreco;
    }
    
    public void setMbsPreco(double mbsPreco) {
        this.mbsPreco = mbsPreco;
    }

    
    @Column(name="mbs_quantidade", nullable=false)
    public int getMbsQuantidade() {
        return this.mbsQuantidade;
    }
    
    public void setMbsQuantidade(int mbsQuantidade) {
        this.mbsQuantidade = mbsQuantidade;
    }

    
    @Column(name="mbs_tipo", nullable=false, length=100)
    public String getMbsTipo() {
        return this.mbsTipo;
    }
    
    public void setMbsTipo(String mbsTipo) {
        this.mbsTipo = mbsTipo;
    }

}