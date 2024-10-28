import java.util.Random;

public class Controller {
    private Hash hash;
    private Registro registro;
    private int seed;


    public Controller(int tamanhoTabela, int seed) {
        this.hash = new Hash(tamanhoTabela);
        this.registro = new  Registro(tamanhoTabela);
        this.seed = seed;
    }


    public boolean popularRegistro(int tamanhoDoConjuntoDados)
    {
        Random random = new Random(this.seed);
        for (int i = 0; i < tamanhoDoConjuntoDados; i++) {
            int num = random.nextInt();
            Elemento elemento = new Elemento(hash.funcaoHash(num),num );
            registro.inserirRegistro(elemento);
        }
        return  true;
    }

    public void exibirLista(){
        registro.exibirLista();
    }

    public void busca()
    {
        Random random = new Random(this.seed);
        for (int i = 0; i < 250_001; i++) {
            int num = random.nextInt();
            switch (num) {
                case 100:
                    chamarPesquisa(num);
                    break;
                case 500:
                    chamarPesquisa(num);
                    break;
                case 1_000:
                    chamarPesquisa(num);
                    break;
                case  100_000:
                    chamarPesquisa(num);
                    break;
                case 250_000:
                    chamarPesquisa(num);
                    break;
            }

        }

    }

    private void chamarPesquisa(int num)
    {


        registro.pesquisarValor(this.hash.funcaoHash(num), num );
    }


}
