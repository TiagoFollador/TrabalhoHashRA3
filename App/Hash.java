public class Hash
{
    private int tamanhoTabela;

    public Hash(int tamanhoTabela) {
        this.tamanhoTabela = tamanhoTabela;
    }

    public int funcaoHashDivisao(int chave)
    {
        return chave >= 0 ? chave % this.tamanhoTabela : (chave * (-1)) % this.tamanhoTabela;
    }

    public int funcaoHashMultiplicacao(int chave)
    {
        return chave >= 0 ? (int) (this.tamanhoTabela * ((chave * 0.6180339887) % 1)) : (int) (this.tamanhoTabela * (((chave * (-1)) * 0.6180339887) % 1));
    }

    public int funcaoHashDobramento(int chave)
    {
        int numBits = 10;
        int parte1 = chave >> numBits;
        int parte2 = chave & this.tamanhoTabela - 1;

        return chave >= 0 ? parte1 ^ parte2 : ((chave * (-1)) >> numBits) ^ ((chave * (-1)) & this.tamanhoTabela - 1);
    }


}
