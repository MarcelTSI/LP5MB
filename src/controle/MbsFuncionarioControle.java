/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.MbsFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcel
 */
    public class MbsFuncionarioControle extends AbstractTableModel {
    
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    
    public MbsFuncionario getBean(int row) {
        return (MbsFuncionario) lista.get(row);
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
        MbsFuncionario cjrfuncionario = (MbsFuncionario) lista.get(rowIndex);
        if( columnIndex == 0){
            return cjrfuncionario.getMbsIdFuncionario();
        }
        if( columnIndex == 1){
            return cjrfuncionario.getMbsNome();
        }
        if( columnIndex == 2){
            return cjrfuncionario.getMbsCpf();
        }
        if( columnIndex == 3){
            return cjrfuncionario.getMbsEndereco();
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
            return "Cpf";
        }
        if( column == 3){
            return "Endereço";
        }
        return "";
    }
}