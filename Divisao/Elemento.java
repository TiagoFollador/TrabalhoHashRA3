public class Elemento
{
    private int chave;
    private int valor;
    private Elemento proximo;

    public Elemento(int chave, int valor) {
        this.chave = chave;
        this.valor = valor;
        this.proximo = null;
    }

    public int getChave() {
        return chave;
    }

    public int getValor() {
        return valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
