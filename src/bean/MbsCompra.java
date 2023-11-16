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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MbsCompra generated by hbm2java
 */
@Entity
@Table(name="mbs_compra"
    ,catalog="db_marcel_silva"
)
public class MbsCompra  implements java.io.Serializable {


     private int mbsIdCompra;
     private MbsFornecedor mbsFornecedor;
     private MbsFuncionario mbsFuncionario;
     private Date mbsDataCompra;
     private int mbsProdutoComprado;
     private double mbsPrecoCompra;
     private int mbsQuantidadeCompra;
     

    public MbsCompra() {
    }

	
    public MbsCompra(Date mbsDataCompra, int mbsProdutoComprado, double mbsPrecoCompra, int mbsQuantidadeCompra) {
        this.mbsDataCompra = mbsDataCompra;
        this.mbsProdutoComprado = mbsProdutoComprado;
        this.mbsPrecoCompra = mbsPrecoCompra;
        this.mbsQuantidadeCompra = mbsQuantidadeCompra;
    }

   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mbs_idCompra", unique=true, nullable=false)
    public int getMbsIdCompra() {
        return this.mbsIdCompra;
    }
    
    public void setMbsIdCompra(int mbsIdCompra) {
        this.mbsIdCompra = mbsIdCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mbs_fornecedor")
    public MbsFornecedor getMbsFornecedor() {
        return this.mbsFornecedor;
    }
    
    public void setMbsFornecedor(MbsFornecedor mbsFornecedor) {
        this.mbsFornecedor = mbsFornecedor;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mbs_funcionario")
    public MbsFuncionario getMbsFuncionario() {
        return this.mbsFuncionario;
    }
    
    public void setMbsFuncionario(MbsFuncionario mbsFuncionario) {
        this.mbsFuncionario = mbsFuncionario;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="mbs_data_compra", nullable=false, length=19)
    public Date getMbsDataCompra() {
        return this.mbsDataCompra;
    }
    
    public void setMbsDataCompra(Date mbsDataCompra) {
        this.mbsDataCompra = mbsDataCompra;
    }

    
    @Column(name="mbs_produto_comprado", nullable=false)
    public int getMbsProdutoComprado() {
        return this.mbsProdutoComprado;
    }
    
    public void setMbsProdutoComprado(int mbsProdutoComprado) {
        this.mbsProdutoComprado = mbsProdutoComprado;
    }

    
    @Column(name="mbs_preco_compra", nullable=false, precision=9)
    public double getMbsPrecoCompra() {
        return this.mbsPrecoCompra;
    }
    
    public void setMbsPrecoCompra(double mbsPrecoCompra) {
        this.mbsPrecoCompra = mbsPrecoCompra;
    }

    
    @Column(name="mbs_quantidade_compra", nullable=false)
    public int getMbsQuantidadeCompra() {
        return this.mbsQuantidadeCompra;
    }
    
    public void setMbsQuantidadeCompra(int mbsQuantidadeCompra) {
        this.mbsQuantidadeCompra = mbsQuantidadeCompra;
    }


}


