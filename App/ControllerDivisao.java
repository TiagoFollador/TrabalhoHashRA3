import java.util.Random;

public class ControllerDivisao {
    private Hash hash;
    private Registro registro;
    private int seed;


    public ControllerDivisao(int tamanhoTabela, int seed) {
        this.hash = new Hash(tamanhoTabela);
        this.registro = new  Registro(tamanhoTabela);
        this.seed = seed;
    }
    public int getColisoes()
    {
        return  this.registro.getColisoes();
    }

    public boolean popularRegistro(int tamanhoDoConjuntoDados)
    {
        Random random = new Random(this.seed);
        for (int i = 0; i < tamanhoDoConjuntoDados; i++) {
            int num = random.nextInt();
            Elemento elemento = new Elemento(hash.funcaoHashDivisao(num),num );
            registro.inserirRegistro(elemento);
        }
        return  true;
    }


    public void busca()
    {
        Random random = new Random(this.seed);
        for (int i = 0; i < 999_001; i++) {
            int num = random.nextInt();
            switch (i) {
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
                case 999_000:
                    chamarPesquisa(num);
                    break;
                default:
                    break;
            }

        }

    }

    private void chamarPesquisa(int num)
    {


        registro.pesquisarValor(this.hash.funcaoHashDivisao(num), num );
    }


}
