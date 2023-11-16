/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.MbsFornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcel
 */
    public class MbsFornecedorControle extends AbstractTableModel {
    
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public MbsFornecedor getBean(int row) {
        return (MbsFornecedor) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MbsFornecedor fornecedor = (MbsFornecedor) lista.get(rowIndex);
        if( columnIndex == 0){
            return fornecedor.getMbsIdFornecedor();
        }
        if( columnIndex == 1){
            return fornecedor.getMbsNome();
        }
        if( columnIndex == 2){
            return fornecedor.getMbsCnpj();
        }
        if( columnIndex == 3){
            return fornecedor.getMbsDataCadastro();
        }
        
        return "";
    }
    
    @Override
    public String getColumnName(int column) {
        if( column == 0){
            return "ID";
        }
        if( column == 1){
            return "Nome";
        }
        if( column == 2){
            return "Cnpj";
        }
        if( column == 3){
            return "Data de Cadastro";
        }
        return "";
    }
}
