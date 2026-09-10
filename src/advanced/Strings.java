/*
    * Todos os métodos de construção de strings possuem funções de verificação,
    comparação, conversões, etc. embutidas.
 */
@SuppressWarnings("all")
void main() {
    /*
        Strings são fáceis de usar e mais rápidas de programar, porém, sofrem
        de baixo desempenho nos casos em que múltiplas concatenações são
        necessárias. Strings são imutáveis.
     */
    String string1 = new String("Novo objeto String (método tradicional)");
    String string2 = "Novo objeto String (método rápido)";

    /*
        StringBuilders precisam ser instanciadas, mas tem um desempenho
        superior em casos em que múltiplas concatenações são necessárias.
        Em contrapartida, elas não são 'thread safe'.
     */
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Novo objeto StringBuilder");

    /*
        StringBuffers, assim como StringBuilders, precisam ser instanciadas,
        possuem um desempenho um pouco inferior ao StringBuilder, mas ainda
        muito superior às Strings em relação a múltiplas concatenações. E no
        caso das StringBuffers, elas são 'thread safe',
     */
    StringBuffer stringBuffer1 = new StringBuffer();
    stringBuffer1.append("Novo objeto StringBuffer");

}