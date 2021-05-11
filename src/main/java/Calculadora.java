import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner valorInvestido = new Scanner(System.in);

        double valor;

        System.out.println("Informe o valor a ser investido: ");
        valor = valorInvestido.nextDouble();
        int alcance = calcularAlcance(valor);
        System.out.println("Seu anúcio tem a capacidade de chegar até " + alcance + " pessoa(as)!");

    }

    /**
     *
     * @param valor
     * @return
     */
    public static int calcularAlcance(double valor) {
        int alcance = 0;
        int anuncioOriginal = (int)(valor * 30);
        int clicks = (int)(anuncioOriginal * 0.12);
        int compartilhamentos = (int)(clicks * 0.15);

        alcance = anuncioOriginal + (compartilhamentos * 40);
        int novasVisualizacoes = compartilhamentos * 40;

        for (int i = 1; i < 4; i++){
            int novosClicks = (int)(novasVisualizacoes * 0.12);
            int novosCompartilhamentos = (int)(novosClicks * 0.15);
            novasVisualizacoes = novosCompartilhamentos * 40;
            alcance = alcance + novasVisualizacoes;
        }

        return alcance;
    }
}
