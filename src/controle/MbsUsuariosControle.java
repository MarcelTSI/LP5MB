/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.MbsUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcel
 */
    public class MbsUsuariosControle extends AbstractTableModel {
    
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public MbsUsuarios getBean(int row) {
        return (MbsUsuarios) lista.get(row);
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
        MbsUsuarios mbsusuarios = (MbsUsuarios) lista.get(rowIndex);
        if( columnIndex == 0){
            return mbsusuarios.getMbsIdUsuario();
        }
        if( columnIndex == 1){
            return mbsusuarios.getMbsNome();
        }
        if( columnIndex == 2){
            return mbsusuarios.getMbsApelido();
        }
        if( columnIndex == 3){
            return mbsusuarios.getMbsCpf();
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
            return "apelido";
        }
        if( column == 3){
            return "cpf";
        }
        return "";
    }
}
