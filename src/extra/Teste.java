package extra;

import bandoDados.AlunoBD;
import bandoDados.PessoaBD;
import java.sql.Date;
import java.util.ArrayList;
import modelos.Aluno;
import modelos.Contato;
import modelos.Endereco;
import modelos.Pessoa;

public class Teste 
{
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();
        PessoaBD pessoaBD = new PessoaBD();
        Endereco endereco = new Endereco();
        Contato contato = new Contato();
        Aluno aluno = new Aluno();
        AlunoBD alunoBD = new AlunoBD();
        
        endereco.setBairro("Jaburu");
        endereco.setCidade("Vitoria");
        endereco.setUf("ES");
        endereco.setComplemento("proximo ao mirante");
        endereco.setCep("12431123");
        endereco.setEndereco("rua nova sem numero");
        
        contato.setTipo("telefone");
        contato.setContato("996108981");
        
        aluno.setMatricula("ifo516vt36");
        aluno.setComprovanteEscolarida("Historico");
        aluno.setObservacao("aluno de escola publica");
        aluno.setNome("Jonathan Dutra");
        aluno.setNomeMae("Eva Dutra");
        aluno.setCpf("128.xxx.000-33");
        aluno.setDataNacimento(Date.valueOf("2016/07/11"));
        
        alunoBD.cadastro(aluno, endereco, contato);
        
        
        for (Pessoa tmp: pessoaBD.listarPessoasBanco())
        {
            System.out.println("Nome:"+tmp.getNome());
            
            tmp.setEnderecos(pessoaBD.listarEnderecoPessoa(tmp));
            
            System.out.println(tmp.getNome());
            
            for(Endereco end : tmp.getEnderecos())
            {
                System.out.println(end.getBairro());
            }
        }
        
    }


}
