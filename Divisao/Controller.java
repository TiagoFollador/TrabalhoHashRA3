public class Controller {
    private Hash hash;
    private Registro registro;


    public Controller(int tamanhoTabela) {
        this.hash = new Hash(tamanhoTabela);
        this.registro = new Registro(tamanhoTabela);
    }

    private Elemento criarElemento(int valor)
    {
        int chave = hash.funcaoHash(valor);
        Elemento e = new Elemento(chave, valor);
        return e;
    }

    private boolean inserirRegistro(Elemento e)
    {
        return this.registro.inserirRegistro(e);
    }

//    public boolean popularRegistro()


}
