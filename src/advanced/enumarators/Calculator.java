import advanced.enumarators.CalculatorEnumAbstract;
import advanced.enumarators.CalculatorEnumAbstractSimplified;
import advanced.enumarators.CalculatorEnumLambda;

/**
 *  Enums são frequentemente utilizados para implementar regras de negócio que possuem
 *  múltiplas variantes para um mesmo contexto, permitindo encapsular o comportamento de
 *  cada opção e executá-lo de forma padronizada através de uma única interface ou método.

 *  Esta classe (main), serve apenas para definir a chamada das funções através das opções
 *  disponíveis, as quais se apresentam com um código (valor numérico) para cada função.
 *  As explicações sobre as implementações estão em seus devidos arquivos enums.

 *  A seguir temos dois exemplos de como utilizar enums de forma funcional. A primeira
 *  utiliza métodos abstratos, e a segunda utiliza lambda expressions.
 *  @see CalculatorEnumAbstract
 *  @see CalculatorEnumLambda
 */
void main() {
    Scanner input = new Scanner(System.in);
    int opt;

    while (true) {
        System.out.println("""
                \nInsira a opção desejada:
                1. Soma;
                2. Subtração;
                3. Multiplicação;
                4. Divisão;
                5. Sair;
                """);
        System.out.print("Selecionar opção> ");
        opt = Integer.parseInt(input.next());

        if (opt == 5) {
            System.out.println("Saindo da aplicação!");
            break;
        }
        if (opt < 1 || opt > 5) {
            System.out.println("Opção inválida! Favor selecionar uma opção válida!");
            continue;
        }

//        var selectedOption = CalculatorEnumAbstract.getByCode(opt);    // Abstract method
        var selectedOption = CalculatorEnumLambda.getByCode(opt);      // Lambda method


        String description = selectedOption.getDescription();
        String symbol = selectedOption.getSymbol();

        System.out.printf("Opção selecionada: %s\n\n" ,description);
        System.out.print("Insira o primeiro valor> ");
        var n1 = Integer.parseInt(input.next());
        System.out.print("Insira o segundo valor> ");
        var n2 = Integer.parseInt(input.next());

        var result = selectedOption.apply(n1, n2);

        System.out.println("\nResultado da : " + description);
        System.out.printf("%s %s %s = %s", n1, symbol, n2, result);
        System.out.println("\n=================");
    }

    input.close();
}