package advanced.enumarators;

/**
 *  Versão simplificada do {@link CalculatorEnumAbstract}. Possui apenas as opções e o método abstrato para chamada.
 *  Método de chamada:
 *      CalculatorEnumAbstractSimplified.SUM.apply(n1, n2);
 */
public enum CalculatorEnumAbstractSimplified {

    SUM {
        @Override
        public int apply(int n1, int n2) {
            return n1 + n2;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int n1, int n2) {
            return n1 - n2;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int n1, int n2) {
            return n1 * n2;
        }
    },
    DIVIDE {
        @Override
        public int apply(int n1, int n2) {
            return n1 / n2;
        }
    };

    public abstract int apply(int n1, int n2);

}