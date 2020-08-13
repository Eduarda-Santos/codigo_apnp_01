package pgua.eic.oo;

public class VerificaOrdenacao {

    public boolean verificaCrescente(int[] vetor){

        boolean flag=true;

        for(int i=0;i<vetor.length-1;i++){
            if(vetor[i]>vetor[i+1]){
                flag = false;
            }
        }

        return flag;

    }


}
