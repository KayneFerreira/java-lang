package advanced.enumarators;

/**
 *  Abstract Enum:
 *  Os métodos são criados dentro de cada opção e sobrescritos para funcionarem conforme o chamado. Dessa forma é
 *  possível implementar apenas uma função com a mesma assinatura, porém com diferentes operações ou comportamentos.
 *  Para as chamadas, um método abstrato precisa ser implementado ({@link #apply(int, int)}).

 *  Neste exemplo, cada opção possui um código, descrição e um símbolo o qual ele representa. Cada um dos atributos deve
 *  ser injetado pelo construtor, assim como um 'get' deve ser implementado para acessar os atributos das opções.

 *  Para o acesso às opções via código, é necessário o uso de um método que avalie as opções disponíveis e retorne esta
 *  opção de acordo com o código correspondente ({@link #getByCode(int)}).

 *  @see CalculatorEnumAbstractSimplified para uma versão simplificada do enum
 */
public enum CalculatorEnumAbstract {

    SUM(1, "Soma", "+") {
        @Override
        public int apply(int n1, int n2) {
            return n1 + n2;
        }
    },
    SUBTRACT(2, "Subtração", "-") {
        @Override
        public int apply(int n1, int n2) {
            return n1 - n2;
        }
    },
    MULTIPLY(3, "Multiplicação", "x") {
        @Override
        public int apply(int n1, int n2) {
            return n1 * n2;
        }
    },
    DIVIDE(4, "Divisão", "/") {
        @Override
        public int apply(int n1, int n2) {
            return n1 / n2;
        }
    };

    private final int code;
    private final String description;
    private final String symbol;

    CalculatorEnumAbstract(int code, String description, String symbol) {
        this.code = code;
        this.description = description;
        this.symbol = symbol;
    }

    public abstract int apply(int n1, int n2);

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }

    public static CalculatorEnumAbstract getByCode(int code) {
        for (CalculatorEnumAbstract option : values()) {
            if (option.getCode() == code) {
                return option;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}