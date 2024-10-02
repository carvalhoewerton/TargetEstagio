public class Visao {

    public static void main(String[] args) {
        //Questao 1 - Fibonacci
        EstagioTarget questoes = new EstagioTarget();
        int exemplo1 = questoes.question1(4);
        int exemplo2 = questoes.question1(9);
        int exemplo3 = questoes.question1(1);

        System.out.println("Resultado da seq de fibonacci para os numeros 1, 4 e 9: "+exemplo1+", " + exemplo2+", " + exemplo3);

        //Questão 2 - frequencia da letra A
        int caso1 = questoes.question2("O rato roeu A roupa do rei de roma");
        int caso2 = questoes.question2("elefante");

        System.out.println("Primeiro caso: "+caso1+"\nSegundo caso: "+caso2);

        //Questão 3:
        questoes.questao3();
    }
}
