package br.com.dtelizeudev.demojndi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Pessoa
 */
@Entity
@Table(name = "PESSOA")
@TableGenerator(name = "controle_id", table = "CONTROLEID", pkColumnName = "TABELA", valueColumnName = "ID", pkColumnValue = "PESSOA", allocationSize = 1)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "controle_id")
    @Column(name = "COD_PESSOA")
    private Long codPessoa;

    @Column(name = "COD_ORIGEM")
    private Long codOrigem;

    @Column(name = "COD_USUARIOCADASTRO")
    private Long codUsuarioCadastro;

    @Column(name = "DTA_CADASTRO")
    private Date dtaCadastro;

    @Column(name = "COD_USUARIOALTERACAO")
    private Long codUsuarioAlteracao;

    @Column(name = "DTA_ALTERACAO")
    private Date dtaAlteracao;

    @Column(name = "FLG_ATIVO")
    private boolean flgAtivo;

    @Column(name = "FLG_TIPOPESSOA")
    private boolean flgTipoPessoa;

    @Column(name = "COD_USUARIO")
    private Long codUsuario;

    /**
     * @return the codPessoa
     */
    public Long getCodPessoa() {
        return codPessoa;
    }

    /**
     * @param codPessoa the codPessoa to set
     */
    public void setCodPessoa(Long codPessoa) {
        this.codPessoa = codPessoa;
    }

    /**
     * @return the codOrigem
     */
    public Long getCodOrigem() {
        return codOrigem;
    }

    /**
     * @param codOrigem the codOrigem to set
     */
    public void setCodOrigem(Long codOrigem) {
        this.codOrigem = codOrigem;
    }

    /**
     * @return the codUsuarioCadastro
     */
    public Long getCodUsuarioCadastro() {
        return codUsuarioCadastro;
    }

    /**
     * @param codUsuarioCadastro the codUsuarioCadastro to set
     */
    public void setCodUsuarioCadastro(Long codUsuarioCadastro) {
        this.codUsuarioCadastro = codUsuarioCadastro;
    }

    /**
     * @return the dtaCadastro
     */
    public Date getDtaCadastro() {
        return dtaCadastro;
    }

    /**
     * @param dtaCadastro the dtaCadastro to set
     */
    public void setDtaCadastro(Date dtaCadastro) {
        this.dtaCadastro = dtaCadastro;
    }

    /**
     * @return the codUsuarioAlteracao
     */
    public Long getCodUsuarioAlteracao() {
        return codUsuarioAlteracao;
    }

    /**
     * @param codUsuarioAlteracao the codUsuarioAlteracao to set
     */
    public void setCodUsuarioAlteracao(Long codUsuarioAlteracao) {
        this.codUsuarioAlteracao = codUsuarioAlteracao;
    }

    /**
     * @return the dtaAlteracao
     */
    public Date getDtaAlteracao() {
        return dtaAlteracao;
    }

    /**
     * @param dtaAlteracao the dtaAlteracao to set
     */
    public void setDtaAlteracao(Date dtaAlteracao) {
        this.dtaAlteracao = dtaAlteracao;
    }

    /**
     * @return the flgAtivo
     */
    public boolean isFlgAtivo() {
        return flgAtivo;
    }

    /**
     * @param flgAtivo the flgAtivo to set
     */
    public void setFlgAtivo(boolean flgAtivo) {
        this.flgAtivo = flgAtivo;
    }

    /**
     * @return the flgTipoPessoa
     */
    public boolean isFlgTipoPessoa() {
        return flgTipoPessoa;
    }

    /**
     * @param flgTipoPessoa the flgTipoPessoa to set
     */
    public void setFlgTipoPessoa(boolean flgTipoPessoa) {
        this.flgTipoPessoa = flgTipoPessoa;
    }

    /**
     * @return the codUsuario
     */
    public Long getCodUsuario() {
        return codUsuario;
    }

    /**
     * @param codUsuario the codUsuario to set
     */
    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }
}