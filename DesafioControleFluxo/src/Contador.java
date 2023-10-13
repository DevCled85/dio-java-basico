import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt(); // Use nextInt() para ler um valor inteiro
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt(); // Use nextInt() para ler um valor inteiro

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) { // Nome da exceção personalizada
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException(); // Lançar exceção se o primeiro for maior ou igual ao segundo
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

