
import services.ConversorMoeda;
import ui.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        int op = 0;

        do {
            Menu.exibirOpcoes();
            op = scanner.nextInt();

            if(op > 0 && op < 7) {
                String[] moedas = Menu.obterMoedas(op);
                conversorMoeda.converterMoeda(scanner, moedas[0], moedas[1]);
            } else if (op < 1 || op > 7) {
                System.out.println("Opção inválida");
            }

        } while (op != 7);



    }
}