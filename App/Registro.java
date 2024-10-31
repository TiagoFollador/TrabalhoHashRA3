public class Registro {
    private Fila[] registroElementos;
    private int tamanhoAtual;
    private int tamanhoMaximo;
    private int colisoes;

    public Registro(int tamanhoLista)
    {
        this.registroElementos = new Fila[tamanhoLista];
        this.tamanhoAtual = 0;
        this.colisoes = 0;
        this.tamanhoMaximo = tamanhoLista;

    }
    public int getColisoes() {
        return colisoes;
    }

    public boolean inserirRegistro(Elemento elemento)
    {
        if (encontrarChavesIguais(elemento)) {
            return true;
        } else if (tamanhoAtual < tamanhoMaximo) {
            Fila fila = new Fila(elemento);
            this.registroElementos[this.tamanhoAtual] = fila;
            tamanhoAtual++;
            return true;
        }
        return false;
    }



    private boolean encontrarChavesIguais(Elemento elemento)
    {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (registroElementos[i].getBegin().getChave() == elemento.getChave()) {
                Elemento lastElemento = findLastElemento(registroElementos[i]);
                registroElementos[i].setEnd(elemento);
                lastElemento.setProximo(elemento);
                this.colisoes++;
                return true;
            }
        }
        return false;
    }

//    private Elemento findLastElemento(Elemento e)
//    {
//        if (e.getProximo() == null) {
//            return e;
//        } else {
//            return findLastElemento(e.getProximo());
//        }
//    }
    private Elemento findLastElemento(Fila fila)
    {
        if (fila.getBegin().getProximo() == null) {
            return fila.getBegin();
        } else {
            return fila.getEnd();
        }
    }


    public boolean pesquisarValor(int chave, int valor)
    {
        boolean findValue = false;
        for (int i = 0; i < this.tamanhoAtual; i++) {
            if (this.registroElementos[i].getBegin().getChave() == chave) {
                Elemento elementoProcurado = encontrarValorNaListaEncadeada(this.registroElementos[i].getBegin(), valor);
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
