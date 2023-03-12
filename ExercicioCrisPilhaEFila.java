import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCrisPilhaEFila {
    public static void main(String[] args){

        //LISTA

        Scanner s = new Scanner(System.in);
        ArrayList<Integer>numeros = new ArrayList<>();

    numeros.addAll(Arrays.asList(10, 20, 30, 40, 50));

        int qtdNumeros = numeros.size();

        System.out.println("Números: " + numeros);

        numeros.add(14);

        System.out.println("Números: " + numeros);

        System.out.println("Digite um número para adicioná-lo ao início da lista: ");
        int novoNumero = Integer.parseInt(s.nextLine());
        numeros.add(0, novoNumero);

        System.out.println("Números: " + numeros);

        System.out.println("Digite um número para adicioná-lo a lista: ");
        int novoNumero1 = Integer.parseInt(s.nextLine());

        if(numeros.contains(novoNumero1)){
            int posicao = numeros.indexOf(novoNumero1);
            System.out.println(novoNumero1 + " está na posição " + posicao);
        }
        else {
            System.out.println("Número " + novoNumero1 + " adicionado com sucesso!");
            numeros.add(novoNumero1);
        System.out.println("Listagem: " + numeros);
    }
}}