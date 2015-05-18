
package bandoDados;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Contato;
import modelos.Endereco;
import modelos.FormacaoProfessor;
import modelos.Professor;

/**
 *
 * @author jonathan
 */
public class ProfessorBD extends PessoaBD
{
    public void cadastro (Professor professor , ArrayList<Contato> contato, Endereco endereco, ArrayList<FormacaoProfessor> fp )
    {
        
       int i = cadastro(professor, contato, endereco);
       cadastroFormacao(i, fp);
       
    }
       public void cadastroFormacao (int codPessoa, ArrayList <FormacaoProfessor> fp) 
       {
           try 
           {
               conectarBanco();
             stm = con.createStatement();
            for(FormacaoProfessor formacao: fp)
            {
                String sql= "insert into formacao(codProfessor, tipo , curso,instituicao,situacao, anoConclucao,anoInicio) "
                    + "values ("+codPessoa+",'"+formacao.getTipo()+"','"+formacao.getCurso()+"',"
                        + "'"+formacao.getInstituicao()+"',"+formacao.getSituacao()+"',"+formacao.getAnoConclusao()+"',"
                        + "'"+formacao.getAnoIncio()+"');" ;
                stm.executeUpdate(sql);
            }        
           }
           catch (Exception e)
           {
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
           finally
           {
               desconectarBanco();
           }
       }
    
}
