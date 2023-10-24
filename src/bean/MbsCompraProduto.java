package bean;
// Generated 12/09/2023 11:13:53 by Hibernate Tools 4.3.1



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MbsCompraProduto generated by hbm2java
 */
@Entity
@Table(name="mbs_compra_produto"
    ,catalog="db_marcel_silva"
)
public class MbsCompraProduto  implements java.io.Serializable {


     private int mbsIdComprasProduto;
     private MbsCompra mbsCompra;
     private MbsProduto mbsProduto;
     private int mbsQuantidade;
     private double mbsValorUnitario;

    public MbsCompraProduto() {
    }

	
    public MbsCompraProduto(int mbsQuantidade, double mbsValorUnitario) {
        this.mbsQuantidade = mbsQuantidade;
        this.mbsValorUnitario = mbsValorUnitario;
    }
    public MbsCompraProduto(MbsCompra mbsCompra, MbsProduto mbsProduto, int mbsQuantidade, double mbsValorUnitario) {
       this.mbsCompra = mbsCompra;
       this.mbsProduto = mbsProduto;
       this.mbsQuantidade = mbsQuantidade;
       this.mbsValorUnitario = mbsValorUnitario;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mbs_idCompras_produto", unique=true, nullable=false)
    public int getMbsIdComprasProduto() {
        return this.mbsIdComprasProduto;
    }
    
    public void setMbsIdComprasProduto(int mbsIdComprasProduto) {
        this.mbsIdComprasProduto = mbsIdComprasProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mbs_compra")
    public MbsCompra getMbsCompra() {
        return this.mbsCompra;
    }
    
    public void setMbsCompra(MbsCompra mbsCompra) {
        this.mbsCompra = mbsCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mbs_produto")
    public MbsProduto getMbsProduto() {
        return this.mbsProduto;
    }
    
    public void setMbsProduto(MbsProduto mbsProduto) {
        this.mbsProduto = mbsProduto;
    }

    
    @Column(name="mbs_quantidade", nullable=false)
    public int getMbsQuantidade() {
        return this.mbsQuantidade;
    }
    
    public void setMbsQuantidade(int mbsQuantidade) {
        this.mbsQuantidade = mbsQuantidade;
    }

    
    @Column(name="mbs_valor_unitario", nullable=false, precision=10)
    public double getMbsValorUnitario() {
        return this.mbsValorUnitario;
    }
    
    public void setMbsValorUnitario(double mbsValorUnitario) {
        this.mbsValorUnitario = mbsValorUnitario;
    }




}

