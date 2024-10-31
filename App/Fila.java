public class Fila {
    // java tem final reservado, por isso o ingles
    private Elemento begin;
    private Elemento end;

    public Fila(Elemento begin) {
        this.begin = begin;
    }

    public Elemento getBegin() {
        return begin;
    }

    public Elemento getEnd() {
        return end;
    }

    public void setEnd(Elemento end) {
        this.end = end;
    }
}
