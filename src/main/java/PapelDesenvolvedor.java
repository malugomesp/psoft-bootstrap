public class PapelDesenvolvedor implements Papel {
    
    @Override 
    public String getPapel() { 
        return "Desenvolvedor"; 
    } 
    
    @Override 
    public void executarFuncao() { 
        System.out.println("Escrevendo código e implementando funcionalidades."); 
    }
}
