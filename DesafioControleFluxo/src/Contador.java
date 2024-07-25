import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        System.out.println("Obrigado. Realizando contagem");
		
		try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
		}

		System.out.println("Fim da contagemm");

	}   

	    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
		
            }for (int contagem = parametroUm; contagem <= parametroDois; contagem++) {
                System.out.println("Número: " + contagem);
	    }


        }
            
}