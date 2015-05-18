
package modelos;

import java.util.ArrayList;
import bandoDados.PessoaBD;
import java.sql.Date;

public class Pessoa
{
    private int codPessoa;
    private String foto;
    private String nome;
    private String corRaca;
    private String cpf;
    private Date dataNacimento;
    private String naturalidade;
    private String uf;
    private String sexo;
    private String senha;
    private String nomeMae;
    private String nomePai;
    private String RG;
    private ArrayList <Endereco> enderecos = new ArrayList ();
    private ArrayList <Contato> contatos = new ArrayList();
    
    public int getCodPessoa() 
    {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorRaca() {
        return corRaca;
    }

    public void setCorRaca(String corRaca) {
        this.corRaca = corRaca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList <Endereco> getEnderecos()
    {
        return this.enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> endereco)
    {
        this.enderecos = endereco;
    }
    public void setEnderecos(Endereco endereco)
    {
        this.enderecos.add(endereco);
    }

    public ArrayList <Contato> getContato(Pessoa pessoa) {
       
       return this.contatos;
    }
      public ArrayList <Contato> getContato() {
       
       return this.contatos;
    }

    public void setContato(Contato contato) {
        this.contatos.add(contato);
    }
    public void setContato (ArrayList <Contato> contato)
    {
        this.contatos = contato;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
  
    
}
