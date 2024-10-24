public class Registro
{
    private Elemento[] registroElementos;
    private int tamanhoAtual;
    private int tamanhoMaximo;

    public Registro(int tamanhoLista)
    {
        this.registroElementos = new Elemento[tamanhoLista];
        this.tamanhoAtual = 0;
        this.tamanhoMaximo = tamanhoLista - 1;
    }

    public boolean inserirRegistro(Elemento elemento)
    {
        if (tamanhoAtual < tamanhoMaximo) {
            if (encontrarChavesIguais(elemento)) {
                return true;
            } else {
                this.registroElementos[this.tamanhoAtual] = elemento;
                tamanhoAtual++;
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean encontrarChavesIguais(Elemento elemento)
    {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (registroElementos[i].getChave() == elemento.getChave()) {
                Elemento lastElemento = findLastElemento(registroElementos[i]);
                lastElemento.setProximo(elemento);
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
}
