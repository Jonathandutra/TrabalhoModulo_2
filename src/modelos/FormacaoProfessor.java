
package modelos;

import java.sql.Date;

public class FormacaoProfessor
{
    private String tipo;
    private String curso;
    private String instituicao;
    private String situacao;
    private Date anoConclusao;
    private Date anoIncio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(Date anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public Date getAnoIncio() {
        return anoIncio;
    }

    public void setAnoIncio(Date anoIncio) {
        this.anoIncio = anoIncio;
    }
    
}
