/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import bean.MbsCompra;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Junior
 */
    public class MbsCompraControle extends AbstractTableModel{

        List lista;

        public void setList(List lista){
            this.lista = lista;
            this.fireTableDataChanged();
        }

        public MbsCompra getBean(int row) {
            return (MbsCompra) lista.get(row);
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
            MbsCompra mbscompra = (MbsCompra) lista.get(rowIndex);
            if( columnIndex == 0){
                return mbscompra.getMbsIdCompra();
            }
            if (columnIndex == 1) {
                return mbscompra.getMbsFuncionario();
            }
            if( columnIndex == 2){
                return mbscompra.getMbsQuantidadeCompra();
            }
            if( columnIndex == 3){
                return mbscompra.getMbsPrecoCompra();
            }
            return "";
        }
    
        @Override
        public String getColumnName(int column) {
            if( column == 0){
                return "id";
            }
            if( column == 1){
                return "Funcionario";
            }
            if( column == 2){
                return "Quantidade da compra";
            }
            if( column == 3){
                return "Preço Compra";
            }
            return "";
        }
    }
