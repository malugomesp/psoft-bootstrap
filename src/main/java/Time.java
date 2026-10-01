import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private Software produto;
    private Pessoa gerente;
    private List<Pessoa> desenvolvedores;
    private List<Sprint> sprints;
   
    public Time(Software produto, String nome) {
        this.produto = produto;
        this.nome = nome;
        this.desenvolvedores = new ArrayList<Pessoa>();
        this.sprints = new ArrayList<Sprint>();
    }

    public void cadastraGerente(Pessoa gerente) {
        this.gerente = gerente;
        if (gerente != null) {
            gerente.setPapel(new PapelGerente());
        }
    }

    public void cadastraDesenvolvedor(Pessoa desenvolvedor) {
        if (desenvolvedor != null) {
            desenvolvedor.setPapel(new PapelDesenvolvedor());
            desenvolvedores.add(desenvolvedor);
        }
    }

    public void cadastraSprint(Sprint sprint) {
        if (sprint != null) {
            sprints.add(sprint);
        }
    }

    public void tornarLiderSprint(Sprint sprint, Pessoa desenvolvedor) {
        if (sprint != null && desenvolvedor != null) {
            sprint.cadastraLider(desenvolvedor);
        }
    }

    public String getNome() {
        return nome;
    }

    public Software getProduto() {
        return produto;
    }

    public Pessoa getGerente() {
        return gerente;
    }

    public List<Pessoa> getDesenvolvedores() {
        return new ArrayList<Pessoa>(desenvolvedores);
    }

    public List<Sprint> getSprints() {
        return new ArrayList<Sprint>(sprints);
    }
}