package pgua.eic.oo;

import java.util.Random;

public class VetorUtils {

    private final int[] vetor;
    private final Random rnd;
    private final int tamanhoVetor;
    private final int maximoValor;

    public VetorUtils(final int tamanhoVetor, final int maximoValor) {
        this.tamanhoVetor = tamanhoVetor;
        this.maximoValor = maximoValor;

        vetor = new int[this.tamanhoVetor];

        rnd = new Random(System.currentTimeMillis());
    }

    public void inicializaVetor() {

        for (int i = 0; i < this.vetor.length; i++) {
            this.vetor[i] = rnd.nextInt(this.maximoValor);
        }

    }

    public int[] getVetor() {
        return this.vetor;
    }

    public String toString() {
        String texto = "";
        for (int i = 0; i < vetor.length; i++) {
            texto += vetor[i] + ", ";
        }

        return texto;
    }

    public class Bubble {
        private int i, j, aux, tam, quant;
        private int[] vetorOrdenado;

        // metodo construtor com parametro tam do vetor e vetor a ser ordenado
        public Vetor(final int tamanhoVetor, final int vetor){
            this.tamanhoVetor = tamanhoVetor;
            this.vetor = vetor;
            
            tam = tamanhoVetor;
        }

        public int[] getvetor(){
            for(i=0;i<tam-1;i++){
                for (j=i+1;j<tam; j++){
                    if(v[i]>v[j]){
                        vetorOrdenado = v[i];
                        aux = v[j];
                        v[j] = v[i];
                        v[i] = aux;
                        quant++;
                    }
                }
            }
        }

        public int[] getVetor(){
            return this.vetor;
        }

        public int[] getvetorOrdenado(){
            return this.vetorOrdenado;

        }

        public int getquant(){
            return this.quant;
        }

        public String toString(){
            return this.vetorOrdenado;
            return this.vetor;
            return this.quant;
        } 
    }
}
