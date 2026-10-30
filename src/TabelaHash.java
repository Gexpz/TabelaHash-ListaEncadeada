public class TabelaHash {
    //Matriz de listas encadeadas
    ListaEncadeada[] tabela;

    //Construtor
    public TabelaHash() {
        //100 Posições da matriz
        tabela = new ListaEncadeada[100];

        for (int i = 0; i < 100; i++) {
            tabela[i] = new ListaEncadeada();
        }
    }

    //Metodo Inserir
    public void inserir(int valor) {
        //Descobre a posição
        int posicao = valor % 100;

        //Insere na lista chamano o metodo inserir
        tabela[posicao].inserir(valor);
    }

    // 1 Metodo Maior Lista
    public void maiorLista() {
        int maior = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < 100; i++) {
            int quantidade = tabela[i].tamanho();

            if (quantidade > maior) {
                maior = quantidade;
                posicaoMaior = i;
            }
        }

        System.out.println("Maior lista: " + maior + " elementos");
        System.out.println("Posição: " + posicaoMaior);

        tabela[posicaoMaior].mostrar();
    }

    //2 Metodo para contar as posições vazias
    public int contarVazias(){
        int contador = 0;

        for (int i = 0; i < 100; i++){

            if(tabela[i].tamanho() == 0){
                contador++;
            }
        }
        return contador;
    }

    //3 Contar Listas que tiverasm colisões
    public int contarListas() {
        int contador = 0;

        for (int i = 0; i < 100; i++) {
            if (tabela[i].tamanho() > 1) {
                contador++;
            }
        }

        return contador;
    }
}
