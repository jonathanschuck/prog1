import java.util.*;

public class Exercicio {
    public static void main(String[] args){
        // 1
        System.out.print("\nProfessor: Fernando Bevilacqua ");
        System.out.print("\nAluno: Seu nome aqui ");
        System.out.print("\nObjetivo: ");
        System.out.print("\n       O objetivo dessa disciplina é compreender os conceitos fundamentais \n       do paradigma de programação orientada a objetos e aplicá-los no \n       desenvolvimento de soluções de software.");
        System.out.print("\nTurno: Vespertino ");

        //2
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("\nSoma de numeros inteiros: ");
        int ValorUm;
        int ValorDois;
        int SomaInteiros;

        System.out.print("\nDigite o Valor um: ");
        ValorUm = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nDigite o Valor dois: ");
        ValorDois = scanner.nextInt();
        scanner.nextLine();

        SomaInteiros = ValorUm + ValorDois;

        System.out.print("\nSoma de numeros inteiros é: ");
        System.out.print("\n" + SomaInteiros);

        System.out.print("\nSoma de numeros flutuantes: ");
        float ValorFloatUm;
        float ValorFloatDois;
        float SomaFloat;

        System.out.print("\nDigite o Valor flutuante um: ");
        ValorFloatUm = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("\nDigite o Valor flutuante dois: ");
        ValorFloatDois = scanner.nextFloat();
        scanner.nextLine();

        SomaFloat = ValorFloatUm + ValorFloatDois;

        System.out.print("\nSoma de numeros flutuantes é: ");
        System.out.print("\n" + SomaFloat);
    }
    
}
