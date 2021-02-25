import java.util.*;

public class Programa {
    public static void main(String[] args) {
        int inteiro = 30;
        String nome = "Jonathan Schuck";

        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.print("\nDigite a idade: ");
        inteiro = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nDigite seu Nome: ");
        nome = scanner.nextLine();

        if (inteiro == 30) {
            System.out.print("Voce tem 30 anos ***** ");
        }else{
            System.out.print("Voce não tem 30 anos ***** ");
        }

        for (int i = 0; i < 10; i++){

            System.out.print("\nHello");
        }

        System.out.print("\nNome: " + nome);

        System.out.print("\nIdade: " + inteiro);

        switch (inteiro){
            case 30: {
                System.out.print("\nCASE");
            }

        

        }
        
    }
    
}
