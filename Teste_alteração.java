import java.util.Scanner;

public class Teste {
    /*
     * int INDICE = 13, SOMA = 0, K = 0;
     * enquanto K < INDICE faça
     * {
     * K = K + 1;
     * SOMA = SOMA + K;
     * }
     * imprimir(SOMA);
     * Ao final do processamento, qual será o valor da variável SOMA?
     */

    public static int valorsoma() {

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }

    /*
     * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
     * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
     * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
     * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
     * avisando se o número informado pertence ou não a sequência.
     * 
     * IMPORTANTE:
     * 
     * Esse número pode ser informado através de qualquer entrada de sua preferência
     * ou pode ser previamente definido no código;
     */

    public static int Fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int a = 0, b = 1, c;
        boolean pertence = false;

        if (num == a || num == b) {
            pertence = true;
        } else {
            while (b <= num) {
                c = a + b;
                if (c == num) {
                    pertence = true;
                    break;
                }
                a = b;
                b = c;
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();

    }

    /* a) 1, 3, 5, 7, _ */
    public static long squ1() {
        int ultimoElemento = 7;
        int proximoElemento = ultimoElemento + 2;
        System.out.println(proximoElemento);
    }

    /* b) 2, 4, 8, 16, 32, 64, __ */
    public static long seq2() {
        int ultimoElemento = 64;
        int proximoElemento = ultimoElemento * 2;
        System.out.println(proximoElemento);
    }

    /* c) 0, 1, 4, 9, 16, 25, 36, __ */
    public static long squ3() {
        int ultimoElemento = 36;
        int indice = 7;
        int proximoElemento = indice * indice;
        System.out.println(proximoElemento);
    }

    /* d) 4, 16, 36, 64, __ */
    public static int squ4() {

        int ultimoElemento = 64;
        int proximoElemento = ultimoElemento + 20;
        System.out.println(proximoElemento);
    }

    /* e) 1, 1, 2, 3, 5, 8, __ */
    public static int squ5() {
        int penultimoElemento = 5;
        int ultimoElemento = 8;
        int proximoElemento = penultimoElemento + ultimoElemento;
        System.out.println(proximoElemento);
    }

    /* f) 2, 10, 12, 16, 17, 18, 19, __ */
    public static int squ6() {
        int ultimoElemento = 19;
        int proximoElemento = ultimoElemento + 1;
        System.out.println(proximoElemento);

    }

    /*
     * IMPORTANTE:
     * 
     * a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <->
     * Franca.
     * 
     * b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a
     * mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
     * 
     * c) Explique como chegou no resultado.
     */

    public static long trajeto() {
        int distancia = 100; // em km
        int velocidadeCarro = 110; // em km/h
        int velocidadeCaminhao = 80; // em km/h
        int tempoPedagio = 5; // em minutos

        double velocidadeMediaCaminhao = velocidadeCaminhao * 60.0 / (60 + tempoPedagio);
        System.out.println("velocidade media do caminhão é de" + velocidadeMediaCaminhao);
        double tempoCarro = distancia / (velocidadeCarro * 1.0);
        System.out.println("Tempo do carrro é de" + tempoCarro);
        double tempoCaminhao = distancia / (velocidadeCaminhao);
        System.out.println("Tempo do caminhão é de" + tempoCaminhao);
    }

    /*
     * IMPORTANTE:
     * 
     * a) Essa string pode ser informada através de qualquer entrada de sua
     * preferência ou pode ser previamente definida no código;
     * 
     * b) Evite usar funções prontas, como, por exemplo, reverse;
     */

    public static String InverterString() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("String invertida: " + reversed);
    }

    public static void main(String[] args) {

    }

}
