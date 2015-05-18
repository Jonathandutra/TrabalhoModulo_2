
package modelos;

import java.util.ArrayList;

public class Professor extends Pessoa
{
    private String funcao;
    private ArrayList < FormacaoProfessor> formacaoProfesso = new ArrayList ();

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public ArrayList < FormacaoProfessor> getFormacaoProfesso() {
        return formacaoProfesso;
    }

    public void setFormacaoProfesso(ArrayList < FormacaoProfessor> formacaoProfesso) {
        this.formacaoProfesso = formacaoProfesso;
    }
     public void setFormacaoProfesso( FormacaoProfessor formacaoProfesso) {
       this.formacaoProfesso.add(formacaoProfesso);
    }
        
}
