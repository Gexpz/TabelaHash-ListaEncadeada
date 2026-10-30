public class ListaEncadeada {
    No inicio;

    //Constructor
    public ListaEncadeada(){
        this.inicio = null;
    }

    //Metodo inserir
    public void inserir(int valor){
        No novo = new No(valor);

        if (inicio == null){
            inicio = novo;
        }else{
            No atual =inicio;

            while (atual.proximo != null){
                atual = atual.proximo;
            }

            atual.proximo = novo;
        }
    }

    //Metodo para mostrar
    public void mostrar(){
        No atual = inicio;

        while (atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    // 1 Metodo para mostrar o Tamanho das listas encadeadas
    public int tamanho(){
        //Começa a contagem no 0
        int contador = 0;
        No atual = inicio;

        while (atual != null){
            //Conta um no
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }
}

