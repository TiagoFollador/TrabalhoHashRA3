public class Registro {
    private Elemento[] registroElementos;
    private int tamanhoAtual;
    private int tamanhoMaximo;
    private int colisoes;

    public Registro(int tamanhoLista)
    {
        this.registroElementos = new Elemento[tamanhoLista];
        this.tamanhoAtual = 0;
        this.colisoes = 0;
        this.tamanhoMaximo = tamanhoLista;

    }
    public int getColisoes() {
        return colisoes;
    }

    public void inserirRegistro(Elemento elemento)
    {

        if (encontrarChavesIguais(elemento)) {
            return;
        } else if (tamanhoAtual < tamanhoMaximo) {
            this.registroElementos[this.tamanhoAtual] = elemento;
            tamanhoAtual++;
        }
    }



    private boolean encontrarChavesIguais(Elemento elemento)
    {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (registroElementos[i].getChave() == elemento.getChave()) {
                Elemento lastElemento = findLastElemento(registroElementos[i]);
                lastElemento.setProximo(elemento);
                this.colisoes++;
                return true;
            }
        }
        return false;
    }

    private Elemento findLastElemento(Elemento e)
    {
        if (e.getProximo() == null) {
            return e;
        } else {
            return findLastElemento(e.getProximo());
        }
    }

    public void exibirLista()
    {
        for (int i = 0; i < this.tamanhoAtual; i++) {
            percorrerListaEncadeada(this.registroElementos[i]);
            System.out.println();
        }
    }

    private Elemento percorrerListaEncadeada(Elemento e)
    {
        if (e.getProximo() == null) {
            System.out.print(" Valor: " + e.getValor());
            return e;
        }
        System.out.print(" Valor: " + e.getValor() + " -> ");
        return percorrerListaEncadeada(e.getProximo());
    }

    public boolean pesquisarValor(int chave, int valor)
    {
        boolean findValue = false;
        for (int i = 0; i < this.tamanhoAtual; i++) {
            if (this.registroElementos[i].getChave() == chave) {
                Elemento elementoProcurado = encontrarValorNaListaEncadeada(this.registroElementos[i], valor);
                if (elementoProcurado.getValor() == valor) {
                    System.out.printf("Chave Encontrada: %08d -- Chave Buscada %08d\n", elementoProcurado.getChave(), chave);
                    System.out.printf("Numero Encontrado: %08d -- Numero Buscado %08d\n", elementoProcurado.getValor(), valor);

                }
            }


        }
        return findValue;
    }

    private Elemento encontrarValorNaListaEncadeada(Elemento e, int valor)
    {
        if (e.getValor() == valor) {
            return e;
        } else if (e.getProximo() == null) {
            return null;
        }
        return encontrarValorNaListaEncadeada(e.getProximo(), valor);
    }
}
