import java.util.Random;
public class Main {

    public static void main(String[] args){

        Random aleatorio = new Random(1090);

        TabelaHash tabela = new TabelaHash();

        int ultimo1 = 0;
        int ultimo2 = 0;
        int ultimo3 = 0;

        for(int i = 0; i < 1000; i++){
            int valor = aleatorio.nextInt(100001);
            tabela.inserir(valor);

            ultimo1 = ultimo2;
            ultimo2 = ultimo3;
            ultimo3 = valor;
        }

        //Impressão dos Resultados
        System.out.println("1- Maior lista encadeada:");
        tabela.maiorLista();

        System.out.println("2- Quantidade de listas com colisões: " + tabela.contarListas());

        System.out.println("3- Quantidade de posições vazias: " + tabela.contarVazias());

        System.out.println("4- Tres ultimos valores inseridos:");
        System.out.println(ultimo1);
        System.out.println(ultimo2);
        System.out.println(ultimo3);
    }
}