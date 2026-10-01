public class PapelProductOwner implements Papel {
    @Override
    public String getPapel() {
        return "Product Owner";
    }

    @Override
    public void executarFuncao() {
        System.out.println("Gerenciando o backlog e a visão do produto.");
    }
}
