import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        /*
        Criar um programa que simula um jogo de adivinhação,
        que deve gerar um número aleatório entre 0 e 100 e pedir
        para que o usuário tente adivinhar o número, em até 5
        tentativas. A cada tentativa, o programa deve informar
        se o número digitado pelo usuário é maior ou menor
        do que o número gerado.
         */
        int contador = 1;
        int tentativasRestantes = 4;
        int numAleatorio = new Random().nextInt(100);
        System.out.println(numAleatorio);


        while (contador != 5) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Adivinhe o número que o programa rodou de 0 a 100. Digite a sua tentativa");
            int numDigitado = leitura.nextInt();

            if (numDigitado == numAleatorio) {
                System.out.println("Você acertou em " + contador + " tentativas");
                break;
            } else {

                System.out.println("Continue tentado, você tem mais " + tentativasRestantes + "tentativas");
                tentativasRestantes--;
            }
            contador++;
        }
    }
}
