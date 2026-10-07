
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero, maiornum = 0, menornum = 0, soma = 0, cont = 1, contnum;
        double media;

        System.out.print("Digite o " + "1° numero ou -1 para encerrar: ");
        numero = leia.nextInt();

        while (numero >= 0) {
            soma += numero;
            if (cont == 1) {
                maiornum = numero;
                menornum = numero;
            } else {
                if (maiornum < numero) {
                    maiornum = numero;
                }
                if (menornum > numero) {
                    menornum = numero;
                }
            }
            cont++;
            System.out.print("Digite o " + cont + "° numero:");
            numero = leia.nextInt();
        }
        contnum = cont - 1;
        if (contnum > 0) {
            media = (double) soma / contnum;
            System.out.println("O menor valor digitado é: " + menornum);
            System.out.println("O maior valor digitado é: " + maiornum);
            System.out.println("A soma dos valores digitados é: " + soma);
            System.out.printf("A media dos valores digitados é: %.1f\n", media);
        } else {
            System.out.println("Nenhum valor foi digitado programa encerrado.");
        }
    }
}
