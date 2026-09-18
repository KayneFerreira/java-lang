package advanced.enumarators;

import java.util.function.BiFunction;

/**
 *  Versão simplificada do {@link CalculatorEnumLambda}. Possui apenas as opções, as injeções e o método de chamada
 *  {@link #apply(int, int)}.
 *  Método de chamada:
 *      CalculatorEnumLambdaSimplified.SUM.apply(n1, n2);
 */
public enum CalculatorEnumLambdaSimplified {

    // Method reference
    SUM(Integer::sum),

    SUBTRACT((n1, n2) -> n1 - n2),

    MULTIPLY((n1, n2) -> n1 * n2),

    DIVIDE((n1, n2) -> n1 / n2);

    private final BiFunction<Integer, Integer, Integer> calculate;

    CalculatorEnumLambdaSimplified(BiFunction<Integer, Integer, Integer> calculate) {
        this.calculate = calculate;
    }

    public int apply(int n1, int n2) {
        return this.calculate.apply(n1, n2);
    }

}
