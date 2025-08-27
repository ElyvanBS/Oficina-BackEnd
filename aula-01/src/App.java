import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World\n");

        String nome = "Web Academy";
        System.out.println(nome.contains("Web") + "\n");

        System.out.println(nome.charAt(0) + "\n");

        String primeiroNome = "Web";
        String segundoNome = "Academy";
        System.out.println(primeiroNome.concat(segundoNome)+"\n");

        // Tipos primitivos mais utilizados
        int tipoInt = 1;
        double tipoDouble = 2.0;
        float tipoFloat = 1.0f;
        long tipoLong = 120L;
        char tipoChar = 'F';

        // Tipos Wapper Class mais utilizados (Objeto)
        Integer tipoIntegerWP = 1;
        Double tipoDoubleWP = 2.0;
        Float tipoFloatWP = 1.0f;
        Long tipoLongWP = 120L;
        Character tipoCharacterWP = 'F';
        
        int valor1 = 1;
        int valor2 = 2;

        // Operações Básicas
        System.out.println("Soma");
        System.out.println(valor1 + valor2 + "\n");

        System.out.println("Subtração");
        System.out.println(valor1 - valor2 + "\n");

        System.out.println("Divisão");
        System.out.println(valor1 / valor2 + "\n");

        System.out.println("Multiplicação");
        System.out.println(valor1 * valor2 + "\n");

        System.out.println("Resto");
        System.out.println(valor1 % valor2 + "\n");

        // Controle de Fluxo
        if (!segundoNome.contains("dem")) {
            System.out.println("Entrou no if!" + "\n");
        } else {
            System.out.println("Entrou no else!" + "\n");
        }

        // Laços de Repetição
        int contador = 0;
        do {
            System.out.println("DO" + "\n");
        } while (contador != 0); // Executa pelo menos uma vez


        while (contador < 2) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("\n");

        for(int i = 1; i <= 5; i++){
            System.out.println("Volta número: " + i);
        }

        //Pegar valor do input (Scanner)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("\nDigite o primeiro numero: ");
        // int n1 = sc.nextInt();
        // System.out.println("\nVocê digitou: " + n1);

        // Prática Aula 01 - (Sistema de Média Escolar)
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media > 8){
            System.out.println("Aluno APROVADO!");
        } else if(media >= 5 && media <= 8){
            System.out.println("Aluno está de FINAL!");
        } else {
            System.out.println("Aluno REPROVADO");
        }
    }
}
