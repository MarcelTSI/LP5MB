/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.MbsProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcel
 */
    public class MbsProdutoControle extends AbstractTableModel {
    
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public MbsProduto getBean(int row) {
        return (MbsProduto) lista.get(row);
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
        MbsProduto produto = (MbsProduto) lista.get(rowIndex);
        if( columnIndex == 0){
            return produto.getMbsIdProduto();
        }
        if( columnIndex == 1){
            return produto.getMbsNome();
        }
        if( columnIndex == 2){
            return produto.getMbsPreco();
        }
        if( columnIndex == 3){
            return produto.getMbsQuantidade();
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
            return "preço";
        }
        if( column == 3){
            return "Quantidade";
        }
        return "";
    }
}
