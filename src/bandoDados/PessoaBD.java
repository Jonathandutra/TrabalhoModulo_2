package bandoDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.*;

public class PessoaBD extends Conexao
{
    public int cadastro (Pessoa pessoa, ArrayList <Contato> contato, Endereco endereco)
    {
        int i=-1;
       i = cadastroPessoa(pessoa);
        cadastroContato(i, contato);
        cadastroEndereco(i, endereco);
        return i;
    }
    
    public int cadastroPessoa (Pessoa pessoa)
    {
        int key =0;
        try 
        {
            conectarBanco();
            String sql= "insert into pessoa (nome,rg,cpf,naturalidade,dataNascimento,uf,"
                    + "nomePai,nomeMae,foto) values(?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, pessoa.getNome());
            stm.setString(2, pessoa.getRG());
            stm.setString(3, pessoa.getCpf());
            stm.setString(4, pessoa.getNaturalidade());
            stm.setDate(5, pessoa.getDataNacimento());
            stm.setString(6, pessoa.getUf());
            stm.setString(7, pessoa.getNomePai());
            stm.setString(8, pessoa.getNomeMae());
            stm.setString(9, pessoa.getFoto());
            stm.executeUpdate();

            ResultSet codPessoa = stm.getGeneratedKeys();
            while (codPessoa.next()) 
            {
                key = codPessoa.getInt(1);
            }
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            desconectarBanco();
            return key;
        }
        
    }
    
    public void cadastroContato (int codPessoa , ArrayList <Contato> cont)
    {
        try 
        {
            conectarBanco();
            stm = con.createStatement();
            for(Contato contato:cont)
            {
                String sql= "insert into contato(codPessoa, tipo , contato) "
                    + "values ("+codPessoa+",'"+contato.getTipo()+"','"+contato.getContato()+"');" ;
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
    public void cadastroEndereco (int codPessoa, Endereco endereco)
    {
         try {
            conectarBanco();
            stm = con.createStatement();
            String sql = "insert into endereco (codPessoa,endereco,cidade,uf,bairro,cep,complemento)"
                    + "values(" + codPessoa + ",'" + endereco.getEndereco() + "','" + endereco.getCidade() + "'"
                    + ",'" + endereco.getUf() + "','" + endereco.getBairro() + "','" + endereco.getCep() + "',"
                    + "'" + endereco.getComplemento() + "');";
            stm.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            desconectarBanco();
        }

    }
    
}