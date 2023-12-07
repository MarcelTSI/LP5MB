/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import bean.MbsCompraProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author marcel
 */
    public class MbsCompraProdutoControle extends AbstractTableModel{

        List lista;

        public void setList(List lista){
            this.lista = lista;
            this.fireTableDataChanged();
        }

        public MbsCompraProduto getBean(int row) {
            return (MbsCompraProduto) lista.get(row);
        }
        
        public void addBean (MbsCompraProduto mbsCompraProduto) {
        lista.add(mbsCompraProduto);
        this.fireTableDataChanged();
        }
        
        public void removeBean (int index) {
            if (lista != null && index >= 0 && index < lista.size() ) {
            lista.remove(index);
            this.fireTableDataChanged();
            }
        }
        
        public void updateBean (int index, MbsCompraProduto mbsCompraProduto) {
            lista.set(index , mbsCompraProduto);
            this.fireTableDataChanged();
        }
        
        @Override
        public int getRowCount() {
            return lista.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }
    

    public Object getValueAt(int rowIndex, int columnIndex) {
            MbsCompraProduto mbscompraproduto = (MbsCompraProduto) lista.get(rowIndex);
            if( columnIndex == 0){
                return mbscompraproduto.getMbsIdComprasProduto();
            }
            if (columnIndex == 1) {
                return mbscompraproduto.getMbsProduto();
            }
            if( columnIndex == 2){
                return mbscompraproduto.getMbsQuantidade();
            }
            if( columnIndex == 3){
                return mbscompraproduto.getMbsQuantidade()* mbscompraproduto.getMbsValorUnitario();
            }
            return "";
        }
    
        @Override
        public String getColumnName(int column) {
            if( column == 0){
                return "ID";
            }
            if( column == 1){
                return "Produto";
            }
            if( column == 2){
                return "Quantidade";
            }
            if( column == 3){
                return "Valor Unitário";
            }
            return "";
        }
        
        
    }
