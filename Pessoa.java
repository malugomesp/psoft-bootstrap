import java.util.*;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private String profissao;
    private List<Endereco> enderecos;
    
    public Pessoa(String nome, String cpf, int idade, String telefone, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = new ArrayList<Endereco>();
    }

    public String cadastraEndereco(String rua, String bairro, String cep, String cidade, int numero, String complemento) {
        Endereco e = new Endereco(rua, bairro, cep, cidade, numero, complemento);
        if (!enderecos.contains(e)){
            enderecos.add(e);
            return "endereço cadastrado";
        }
        return "esse endereco já existe";
    }
    
    public String removeEndereco(String rua, String bairro, String cep, String cidade, int numero, String complemento) {
        Endereco e = new Endereco(rua, bairro, cep, cidade, numero, complemento);
        if (!enderecos.contains(e)){
            return "endereço não cadastrado";
        }
        enderecos.remove(e);
        return "endereco removido";
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
    
}