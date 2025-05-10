package ui;

public class Menu {

    public static void exibirOpcoes() {
        System.out.println("""
                    Escolha a opção desejada:
                    
                    1 - Dolar Americano -> Real Brasileiro
                    2 - Real Brasileiro -> Dolar Americano
                    3 - Dolar Americano -> Euro
                    4 - Euro -> Dolar Americano
                    5 - Dolar Americano -> Libra Esterlina
                    6 - Libra Esterlina -> Dolar Americano
                    7 - Sair
                    """);
    }

    public static String[] obterMoedas(int op) {
        return switch (op) {
            case 1 -> new String[]{"USD", "BRL"};
            case 2 -> new String[]{"BRL", "USD"};
            case 3 -> new String[]{"USD", "EUR"};
            case 4 -> new String[]{"EUR", "USD"};
            case 5 -> new String[]{"USD", "GBP"};
            case 6 -> new String[]{"GBP", "USD"};
            default -> new String[]{"", ""};
        };
    }
}
