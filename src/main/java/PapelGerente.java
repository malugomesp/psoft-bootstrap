public class PapelGerente implements Papel {
    @Override 
    public String getPapel() { 
        return "Gerente"; 
    } 
    
    @Override 
    public void executarFuncao() { 
        System.out.println("Gerenciando a equipe e os recursos do time."); 
    }
}
