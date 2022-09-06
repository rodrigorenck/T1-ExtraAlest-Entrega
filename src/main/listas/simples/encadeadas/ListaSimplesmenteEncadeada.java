package listas.simples.encadeadas;

public class ListaSimplesmenteEncadeada {

    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    public ListaSimplesmenteEncadeada() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public void adicionar(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        if (this.inicio == null) { //lista esta vazia --> insere no inicio
            this.inicio = novoNodo;
            this.fim = novoNodo;
        } else { //lista nao esta vazia --> insere no final
            Nodo paux = this.fim;
            this.fim = novoNodo;
            paux.proximo = novoNodo;
        }
        quantidade++;
    }

    public void adicionar(int posicao, int elemento) {
        if ((posicao < 0) || (posicao >= quantidade)) {
            throw new IndexOutOfBoundsException("Não é possível inserir na posição " + posicao);
        }
        Nodo novoNodo = new Nodo(elemento);
        if (posicao == 0) { //inserindo no inicio
            //correcao bug1
            novoNodo.proximo = this.inicio;
            this.inicio = novoNodo;
            quantidade++;
        } else if (posicao == quantidade - 1) { //insere no final
            this.adicionar(elemento);
        } else { //insere no meio
            Nodo pant = null;
            Nodo paux = this.inicio;
            for (int i = 0; i < posicao; i++) {
                pant = paux;
                paux = paux.proximo;
            }
            pant.proximo = novoNodo; //liga o anterior ao novo Nodo
            novoNodo.proximo = paux;
            quantidade++;
        }
    }

    /**
     * Autor: Rodrigo Renck
     */
    public void remover(int elemento) {
        Nodo paux1 = inicio;
        Nodo paux = inicio;

        //remover o primeiro elemento
        if (inicio.elemento == elemento) {
            inicio = inicio.proximo;
            quantidade--;
            return;
        }
        //logica para descobrir se o elemento esta na lista
        //se ele estiver entao o cont sera maior que 0
        int cont = 0;
        while (paux1.proximo != null) {
            if (paux1.elemento == elemento) {
                cont++;
                break;
            }
            paux1 = paux1.proximo;
        }
        if (fim.elemento == elemento) {
            cont++;
        }
        //se o cont estiver igual a 0 o elemento nao esta na lista entao retornamos
        if (cont == 0) {
            return;
        }

        while (paux.proximo != null) {
            //remove do fim
            if (paux.proximo.proximo == null) {
                paux.proximo = null;
                fim = paux;
                quantidade--;
                return;
            }
            //remove do meio
            if (paux.proximo.elemento == elemento) {
                Nodo elementoParaRemover = paux.proximo;
                paux.proximo = elementoParaRemover.proximo; //aponta para o cara depois do elemento
                quantidade--;
                return;
            }
            //vai para o proximo elemento
            paux = paux.proximo;
        }
    }

    /**
     * Autor: Rodrigo Renck
     */
    public void removerPelaPosicao(int posicao) {
        if ((posicao < 0) || (posicao >= quantidade)) {
            throw new IndexOutOfBoundsException("Não é possível remover na posição " + posicao);
        }
        Nodo paux = inicio;
        //remove do inicio
        if(posicao == 0){
            inicio = inicio.proximo;
            quantidade--;
            return;
        }
        int cont = 1;
        while (paux.proximo != null) {
            //remove do fim
            if (paux.proximo.proximo == null) {
                paux.proximo = null;
                fim = paux;
                quantidade--;
                return;
            }
            //remove do meio
            if (cont == posicao) {
                Nodo elementoParaRemover = paux.proximo;
                paux.proximo = elementoParaRemover.proximo; //aponta para o cara depois do elemento
                quantidade--;
                return;
            }
            //vai para o proximo elemento
            paux = paux.proximo;
            cont++;
        }
    }

    public int ler(int posicao) {
        Nodo paux = this.inicio;
        int p = 0;
        for (int i = 0; i < posicao; i++) {
            paux = paux.proximo;
        }
        return paux.elemento;
    }

    /**
     * Autor: Rodrigo Renck
     */
    public void escrever(int posicao, int elemento) {
        if ((posicao < 0) || (posicao >= quantidade)) {
            throw new IndexOutOfBoundsException("Não é possível escrever na posição " + posicao);
        }
        Nodo paux = inicio;
        //escreve no inicio
        if(posicao == 0){
            inicio.elemento = elemento;
            return;
        }
        int cont = 0;
        while(paux.proximo != null){
            //escreve no meio
            if (cont == posicao) {
                paux.elemento = elemento;
                return;
            }
            paux = paux.proximo;
            cont++;
        }
        //caso ele chegue nesse ponto do codigo entao eh pra escrever no ultimo elemento
        //escreve no fim
        fim.elemento = elemento;
    }

    public int tamanho() {
        return this.quantidade;
    }

    public boolean estaVazia() {
        return this.quantidade == 0;
    }

    public boolean contem(int elemento) {
        return (this.retornarPosicao(elemento) > -1);
    }

    public int retornarPosicao(int elemento) {
        //indexOf metodo
        //retorna a posicao na lista do elemento ou -1 se nao existir
        Nodo paux = this.inicio;
        for (int posicao = 0; posicao < this.quantidade; posicao++) {
            if (paux.elemento == elemento) {
                return posicao;
            }
            //correcao do bug2
            paux = paux.proximo;
        }
        return -1;
    }

    @Override
    public String toString() {
        String aux = "[ ";
        Nodo paux = inicio;
        while (paux != null) {
            aux = aux + paux.elemento + " ";
            paux = paux.proximo; // avanca para proximo novo
        }
        aux += "]";
        return aux;
    }


}
