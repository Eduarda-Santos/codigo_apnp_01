package pgua.eic.oo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tamanhoVetor=0;
        int maximoValor=0;
        VetorUtils vetorUtils = null;
        VerificaOrdenacao verificador = new VerificaOrdenacao();

        System.out.println("Digite o tamanho do vetor:");
        tamanhoVetor = scan.nextInt();

        System.out.println("Digite o valor máximo para o vetor:");
        maximoValor = scan.nextInt();

        vetorUtils = new VetorUtils(tamanhoVetor,maximoValor);

        vetorUtils.inicializaVetor();

        System.out.println(vetorUtils.toString());

        int[] vetor = vetorUtils.getVetor();

        boolean retorno = verificador.verificaCrescente(vetor);
        System.out.println(retorno);


    }
}
