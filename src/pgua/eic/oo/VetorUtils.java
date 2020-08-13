package pgua.eic.oo;

import java.util.Random;

public class VetorUtils {

    private int[] vetor;
    private Random rnd;
    private int tamanhoVetor;
    private int maximoValor;


    public VetorUtils(int tamanhoVetor,int maximoValor){
        this.tamanhoVetor = tamanhoVetor;
        this.maximoValor = maximoValor;

        vetor = new int[this.tamanhoVetor];

        rnd = new Random(System.currentTimeMillis());
    }

    public void inicializaVetor(){

        for(int i=0;i<this.vetor.length;i++){
            this.vetor[i] = rnd.nextInt(this.maximoValor);
        }

    }

    public int[] getVetor(){
        return this.vetor;
    }

    public String toString(){
        String texto="";
        for(int i=0;i<vetor.length;i++){
            texto+=vetor[i]+", ";
        }

        return texto;
    }





}
