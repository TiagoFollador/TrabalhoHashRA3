public class Main {

    public static void main(String[] args) {

        insercaoBusca(1000, 1_000_000, 1000);
        insercaoBusca(1000, 5_000_000, 777);
        insercaoBusca(1000, 20_000_000, 888);
    }

    private static void insercaoBusca(int tamanhoLista, int numRegistros, int seed)
    {
        long tempoInicial = System.currentTimeMillis();
        long tempoInsercao = System.currentTimeMillis();

        System.out.println("--- Numero de Registros : " + numRegistros + " ---");
        System.out.println("===========================================");

        Controller c = new Controller(tamanhoLista, seed);
        c.popularRegistro(numRegistros);

        long tempoTerminoInsercao = System.currentTimeMillis() - tempoInsercao;
        System.out.println(tempoTerminoInsercao + "ms para inserir os " + numRegistros + " de dados");

        System.out.println();
        long tempoBusca = System.currentTimeMillis();
        c.busca();
        long tempoFinalBusca = System.currentTimeMillis() - tempoBusca;
        System.out.println();

        System.out.println("Demorou " + tempoFinalBusca + "ms para buscar os dados");
        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("Tempo total do sistema: " + tempoFinal + "ms");
    }


}
