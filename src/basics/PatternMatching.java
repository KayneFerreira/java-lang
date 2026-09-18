
void main() {
    patternMatchingSwitch();
    patternMatchingInstanceof();
}

/*
 *  A partir da versão 17 do Java, foi introduzida a funcionalidade "Pattern Matching". Ela permite filtrar tipos
 *  diretamente sem a necessidade de fazer casts explicitos no corpo do bloco. Ela também aceita o case 'null' para
 *  evitar chamadas extras de verificação antes do bloco. Também é possível usar cláusulas de guarda, que adiciona
 *  condições boolean aos casos diretamente no case (ex: case String s when s.length() > 5). Além de dispensar a
 *  necessidade do uso da keyword 'break'.
 */
static void patternMatchingSwitch() {
    Scanner input = new Scanner(System.in);

    System.out.print("Switch Case> ");
    String opt1 = input.nextLine();
    switch (opt1) {
        case "1" -> System.out.println("O valor de entrada foi 1.");
        case "2" -> System.out.println("O valor de entrada foi 2.");
        case "3", "4" -> System.out.println("O valor de entrada foi 3 ou 4.");
        default -> System.out.println("O valor de entrada foi outro.");
    }

    System.out.print("Pattern Matching> ");
    Object opt2 = input.hasNextInt() ? input.nextInt() : input.next();
    switch (opt2) {
        case String s -> System.out.println("Texto recebido: " + s);
        case Integer i -> System.out.println("Número recebido: " + i);
        default -> System.out.println("Outro tipo recebido.");
    }

    input.close();
}


@SuppressWarnings("all")
static void patternMatchingInstanceof() {
    Object obj = "Olá, Java!";

    // Método antigo: precisava fazer o cast manual
    if (obj instanceof String) {
        String text = (String) obj;
        System.out.println(text);
    }

    // Com Pattern Matching: declara a variável direto no teste
    if (obj instanceof String text) {
        System.out.println(text);
    }
}