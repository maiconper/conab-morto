package conab.morto.com;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mytable")
public class Morto {
   
    
    private String setor;
    private String documento;
    private String conteudo;
    private String empresa;
    private String unidade;
    private String obs;
    private Integer prateleira;
    private Integer caixa;

    private String apagado;
    private String retirado;
    private String data_del;
    private String hora_del;
    private String usuario;

    private Integer codigo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    

    public Morto(){

        
    }

    public Morto(String setor, String documento, String conteudo, String empresa, String unidade, String obs,
            Integer prateleira, Integer caixa, String apagado, String retirado, String data_del, String hora_del,
            String usuario, Integer codigo, Integer id) {
        this.setor = setor;
        this.documento = documento;
        this.conteudo = conteudo;
        this.empresa = empresa;
        this.unidade = unidade;
        this.obs = obs;
        this.prateleira = prateleira;
        this.caixa = caixa;
        this.apagado = apagado;
        this.retirado = retirado;
        this.data_del = data_del;
        this.hora_del = hora_del;
        this.usuario = usuario;
        this.codigo = codigo;
        this.id = id;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
    public Integer getPrateleira() {
        return prateleira;
    }
    public void setPrateleira(Integer prateleira) {
        this.prateleira = prateleira;
    }
    public Integer getCaixa() {
        return caixa;
    }
    public void setCaixa(Integer caixa) {
        this.caixa = caixa;
    }
    public String getApagado() {
        return apagado;
    }
    public void setApagado(String apagado) {
        this.apagado = apagado;
    }
    public String getRetirado() {
        return retirado;
    }
    public void setRetirado(String retirado) {
        this.retirado = retirado;
    }
    public String getData_del() {
        return data_del;
    }
    public void setData_del(String data_del) {
        this.data_del = data_del;
    }
    public String getHora_del() {
        return hora_del;
    }
    public void setHora_del(String hora_del) {
        this.hora_del = hora_del;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Morto [apagado=" + apagado + ", caixa=" + caixa + ", codigo=" + codigo + ", conteudo=" + conteudo
                + ", data_del=" + data_del + ", documento=" + documento + ", empresa=" + empresa + ", hora_del="
                + hora_del + ", id=" + id + ", obs=" + obs + ", prateleira=" + prateleira + ", retirado=" + retirado
                + ", setor=" + setor + ", unidade=" + unidade + ", usuario=" + usuario + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apagado == null) ? 0 : apagado.hashCode());
        result = prime * result + ((caixa == null) ? 0 : caixa.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
        result = prime * result + ((data_del == null) ? 0 : data_del.hashCode());
        result = prime * result + ((documento == null) ? 0 : documento.hashCode());
        result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
        result = prime * result + ((hora_del == null) ? 0 : hora_del.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((obs == null) ? 0 : obs.hashCode());
        result = prime * result + ((prateleira == null) ? 0 : prateleira.hashCode());
        result = prime * result + ((retirado == null) ? 0 : retirado.hashCode());
        result = prime * result + ((setor == null) ? 0 : setor.hashCode());
        result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Morto other = (Morto) obj;
        if (apagado == null) {
            if (other.apagado != null)
                return false;
        } else if (!apagado.equals(other.apagado))
            return false;
        if (caixa == null) {
            if (other.caixa != null)
                return false;
        } else if (!caixa.equals(other.caixa))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (conteudo == null) {
            if (other.conteudo != null)
                return false;
        } else if (!conteudo.equals(other.conteudo))
            return false;
        if (data_del == null) {
            if (other.data_del != null)
                return false;
        } else if (!data_del.equals(other.data_del))
            return false;
        if (documento == null) {
            if (other.documento != null)
                return false;
        } else if (!documento.equals(other.documento))
            return false;
        if (empresa == null) {
            if (other.empresa != null)
                return false;
        } else if (!empresa.equals(other.empresa))
            return false;
        if (hora_del == null) {
            if (other.hora_del != null)
                return false;
        } else if (!hora_del.equals(other.hora_del))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (obs == null) {
            if (other.obs != null)
                return false;
        } else if (!obs.equals(other.obs))
            return false;
        if (prateleira == null) {
            if (other.prateleira != null)
                return false;
        } else if (!prateleira.equals(other.prateleira))
            return false;
        if (retirado == null) {
            if (other.retirado != null)
                return false;
        } else if (!retirado.equals(other.retirado))
            return false;
        if (setor == null) {
            if (other.setor != null)
                return false;
        } else if (!setor.equals(other.setor))
            return false;
        if (unidade == null) {
            if (other.unidade != null)
                return false;
        } else if (!unidade.equals(other.unidade))
            return false;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        return true;
    }

    


}
