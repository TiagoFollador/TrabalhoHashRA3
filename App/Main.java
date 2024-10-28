public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n>>> HASH DIVISAO <<<\n");
        insercaoBuscaDivisao(1000, 1_000_000, 1000);
        insercaoBuscaDivisao(1000, 5_000_000, 777);
        insercaoBuscaDivisao(1000, 20_000_000, 888);

        insercaoBuscaDivisao(10000, 1_000_000, 1000);
        insercaoBuscaDivisao(10000, 5_000_000, 777);
        insercaoBuscaDivisao(10000, 20_000_000, 888);

        insercaoBuscaDivisao(100000, 1_000_000, 1000);
        insercaoBuscaDivisao(100000, 5_000_000, 777);
        insercaoBuscaDivisao(100000, 20_000_000, 888);

        System.out.println("\n\n>>> HASH MULTIPLICACAO <<<\n");
        insercaoBuscaMultiplicacao(1000, 1_000_000, 1000);
        insercaoBuscaMultiplicacao(1000, 5_000_000, 777);
        insercaoBuscaMultiplicacao(1000, 20_000_000, 888);

        insercaoBuscaMultiplicacao(10000, 1_000_000, 1000);
        insercaoBuscaMultiplicacao(10000, 5_000_000, 777);
        insercaoBuscaMultiplicacao(10000, 20_000_000, 888);

        insercaoBuscaMultiplicacao(100000, 1_000_000, 1000);
        insercaoBuscaMultiplicacao(100000, 5_000_000, 777);
        insercaoBuscaMultiplicacao(100000, 20_000_000, 888);

        System.out.println("\n\n>>> HASH DOBRAMENTO <<<\n");
        insercaoBuscaDobramento(1000, 1_000_000, 1000);
        insercaoBuscaDobramento(1000, 5_000_000, 777);
        insercaoBuscaDobramento(1000, 20_000_000, 888);

        insercaoBuscaDobramento(10000, 1_000_000, 1000);
        insercaoBuscaDobramento(10000, 5_000_000, 777);
        insercaoBuscaDobramento(10000, 20_000_000, 888);

        insercaoBuscaDobramento(100000, 1_000_000, 1000);
        insercaoBuscaDobramento(100000, 5_000_000, 777);
        insercaoBuscaDobramento(100000, 20_000_000, 888);
    }

    private static void insercaoBuscaDivisao(int tamanhoLista, int numRegistros, int seed)
    {
        long tempoInicial = System.currentTimeMillis();
        long tempoInsercao = System.currentTimeMillis();
        System.out.println();
        System.out.println("==========================================================================================================");
        System.out.println("--- Numero de Registros : " + numRegistros + " --- Tamanho da Lista : " + tamanhoLista + " --- ");
        System.out.println("==========================================================================================================");

        ControllerDivisao c = new ControllerDivisao(tamanhoLista, seed);
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
        System.out.println("Numero de Colisões: " + c.getColisoes());
    }

    private static void insercaoBuscaMultiplicacao(int tamanhoLista, int numRegistros, int seed)
    {
        long tempoInicial = System.currentTimeMillis();
        long tempoInsercao = System.currentTimeMillis();
        System.out.println();
        System.out.println("==========================================================================================================");
        System.out.println("--- Numero de Registros : " + numRegistros + " --- Tamanho da Lista : " + tamanhoLista + " --- ");
        System.out.println("==========================================================================================================");

        ControllerMultiplicacao c = new ControllerMultiplicacao(tamanhoLista, seed);
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
        System.out.println("Numero de Colisões: " + c.getColisoes());
    }

    private static void insercaoBuscaDobramento(int tamanhoLista, int numRegistros, int seed)
    {
        long tempoInicial = System.currentTimeMillis();
        long tempoInsercao = System.currentTimeMillis();
        System.out.println();
        System.out.println("==========================================================================================================");
        System.out.println("--- Numero de Registros : " + numRegistros + " --- Tamanho da Lista : " + tamanhoLista + " --- ");
        System.out.println("==========================================================================================================");

        ControllerDobramento c = new ControllerDobramento(tamanhoLista, seed);
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
        System.out.println("Numero de Colisões: " + c.getColisoes());
    }

}
