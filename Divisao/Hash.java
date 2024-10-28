public class Hash
{
    private int tamanhoTabela;

    public Hash(int tamanhoTabela) {
        this.tamanhoTabela = tamanhoTabela;
    }

    public int funcaoHash(int chave)
    {
        return chave >= 0 ? chave % this.tamanhoTabela : (chave * (-1)) % this.tamanhoTabela;
    }

}
