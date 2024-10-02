public class EstagioTarget {
    public int question1(int n) {
        if (n <= 1) {
            return n;
        }
        return question1(n - 1) + question1(n - 2);
    }

    public int question2(String texto){
        int freq =0;
        for(char c: texto.toCharArray()){
            if(c == 'a'|c == 'A'){
                freq++;
            }
        }
        return freq;
    }

    public void questao3(){
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);
    }

}
