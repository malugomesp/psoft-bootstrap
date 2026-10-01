public class PapelLider implements Papel{
    @Override 
    public String getPapel() { 
        return "Líder de Equipe"; 
    } 
    
    @Override 
    public void executarFuncao() { 
        System.out.println("Liderando as atividades da Sprint atual."); 
    }
}
