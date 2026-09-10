package advanced.enumarators;

import java.util.function.BiFunction;

/**
 *  Lambda Enum:
 *  É implementado uma função anônima a cada opção. Elas são chamadas através do código
 *  associado pelo método {@link #getByCode(int)}, que avalia as opções disponíveis e
 *  retorna a função da opção correspondente.
 *  Para que este método funcione corretamente, é necessário a injeção da interface
 *  funcional {@link BiFunction} que implementa o método {@link BiFunction#apply(Object, Object)}.
 *
 *  A interface funcional BiFunction funciona como um contrato fixo: ela define que
 *  qualquer função armazenada deve receber dois parâmetros e retornar um valor.
 *  Ao passar a expressão lambda no construtor do Enum, criamos a implementação concreta
 *  para o único método abstrato da interface: {@link BiFunction#apply}. O atributo
 *  'calculate' atua como uma referência que guarda esse algoritmo. Por fim, quando
 *  chamamos o método {@link #apply(int, int)} do Enum, ele apenas repassa os parâmetros
 *  para o método 'apply' que executa a lógica armazenada naquela opção e retorna o
 *  resultado.

 *  Neste exemplo, cada opção possui um código, descrição e um símbolo o qual ele
 *  representa. Cada um dos atributos deve ser injetado com o construtor, assim como um
 *  'getter' deve ser implementado para acessar os atributos das opções.

 *  @see CalculatorEnumLambdaSimplified para uma versão simplificada do enum
 */
public enum CalculatorEnumLambda {

    // Method reference
    SUM(1, "Soma", "+", Integer::sum),

    SUBTRACT(2, "Subtração", "-", (n1, n2) -> n1 - n2),

    MULTIPLY(3, "Multiplicação", "x", (n1, n2) -> n1 * n2),

    DIVIDE(4, "Divisão", "/", (n1, n2) -> n1 / n2);

    private final int code;
    private final String description;
    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> calculate;

    CalculatorEnumLambda(int code, String description, String symbol, BiFunction<Integer, Integer, Integer> calculate) {
        this.code = code;
        this.description = description;
        this.symbol = symbol;
        this.calculate = calculate;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }

    public static CalculatorEnumLambda getByCode(int code) {
        for (CalculatorEnumLambda option : CalculatorEnumLambda.values()) {
            if (option.getCode() == code) {
                return option;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }

    public int apply(int n1, int n2) {
        return this.calculate.apply(n1, n2);
    }

}
